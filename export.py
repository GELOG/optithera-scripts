import sys
import os
from time import sleep
import psycopg2
import utils

# Constants
# utils.NEWLINE_REPLACEMENT = " " # Can be uncommented and edited
# utils.SUBARRAY_SEPARATOR = ";" # Can be uncommented and edited

if len(sys.argv) != 6:
	print "Passed arguments were: " + str(sys.argv)
	print "Arguments must be: export.py outputDir dbHost dbName dbUser dbPassword"
	exit(0)

output_dir = "./" + sys.argv[1]
output_dir = output_dir if output_dir[-1] == "/" else output_dir + "/"
connection_string = "dbname={1} host={0} user={2} password={3}".format(*sys.argv[2:])

print "Connecting to " + connection_string
conn = psycopg2.connect(connection_string)
cursor = conn.cursor()
print "Connected\n"
sleep(2)


#########################
### Individuals_##### ###
#########################
print "Exporting Individuals"

# array_agg + array_to_string = Like SUM(), but for text fields. Concatenates strings.
cursor.execute("""
	SELECT
		I.id, I.dob, I.sex, I.ethnic_code, I.centre_name, I.region_name,
		I.country_name, I.comments, COALESCE(B.batches, '')
	FROM "public"."person" I
	LEFT JOIN (
		SELECT B.person_id, array_to_string(array_agg(B.batch_id::text), '{0}') AS batches
		FROM "public"."batches" B
		GROUP BY B.person_id
		ORDER BY B.person_id ASC
	) B ON I.id = B.person_id
	ORDER BY I.id ASC
""".format(utils.SUBARRAY_SEPARATOR))
print "Writing " + str(cursor.rowcount) + " files\n"
# This section will need to create the headers and the rows dynamically because
# the number of columns is not known ahead of time! See utils.py for more info.
# 8 is where the batches subarray is located
subarrayPos = 8
nbBatches = utils.size_of_subarray(cursor, subarrayPos)
batchPlaceholders = utils.make_placeholders(subarrayPos, nbBatches)
headerPlaceholders = utils.make_headers("batch", 0, nbBatches)
f = cursor.fetchone()
current_id = -1
while f:
	current_id = f[0]
	os.makedirs(output_dir + str(current_id))
	with open("{0}{1}/Individuals_{1}.tsv".format(output_dir, current_id), "w") as file:
		file.write("individualId,familyId,paternalId,maternalId,dateOfBirth,gender,ethnicCode,centreName,region,country,notes,{0}\n".format(headerPlaceholders))
		li = utils.to_prepared_list(f)
		li = utils.break_subarray(li, subarrayPos, nbBatches)
		file.write(("""{0},,,,{1},{2},{3},{4},{5},{6},{7},"""+batchPlaceholders+"""\n""").format(*li))
		f = cursor.fetchone()

################################
### Individuals_#####_Visits ###
################################
print "Exporting Individuals Visits"
cursor.execute("""
	SELECT V.person_id, V.id, V.visit_date, V.form_id, V.fasting, V.descr
	FROM "public"."visit" AS V
	ORDER BY V.person_id ASC, V.id ASC
""")
print "Writing " + str(cursor.rowcount) + " files\n"
f = cursor.fetchone()
current_id = -1
while f:
	if f[0] != current_id: # We only close the file when we switch to a new Person
		try: # Ugly, but Python doesn't let me create ad hoc mocks like JS
			file.close()
		except:
			pass
		current_id = f[0]
		file = open("{0}{1}/Individuals_{1}_Visits.tsv".format(output_dir, current_id), "a")
		file.write("visitId,visitDate,studyFormId,fasting,description\n")
	li = utils.to_prepared_list(f)
	file.write("""{1},{2},{3},{4},{5}\n""".format(*li))
	f = cursor.fetchone()


####################################
### Individuals_#####_Phenotypes ###
####################################
print "Exportung Individuals Phenotypes"
cursor.execute("""
	SELECT V.person_id, V.id, P.name, M.value, P.um, P.descr, V.visit_date
	FROM "public"."phenotype" AS P
	LEFT JOIN (
		SELECT * FROM "public"."measure" M
	) AS M ON P.id = M.phenotype_id
	LEFT JOIN "public"."visit" V ON M.visit_id = V.id
	WHERE V.person_id IS NOT NULL -- There's 1 buggy row, exclude it
	ORDER BY V.person_id ASC
""")
print "Writing " + str(cursor.rowcount) + " files\n"
f = cursor.fetchone()
current_id = -1
while f:
	if f[0] != current_id: # We only close the file when we switch to a new Person
		try: # Ugly, but Python doesn't let me create ad hoc mocks like JS
			file.close()
		except:
			pass
		current_id = f[0]
		file = open("{0}{1}/Individuals_{1}_Phenotypes.tsv".format(output_dir, current_id), "a")
		file.write("visitId,phenotypeType,phenotypeGroup,name,measureDataType,measure,units,description,diagnosisDate\n")
	li = utils.to_prepared_list(f)
	file.write("""{1},,,{2},,{3},{4},{5},{6}\n""".format(*li))
	f = cursor.fetchone()


###################################
### Individuals_#####_Genotypes ###
###################################
print "Exporting Individuals Genotypes"

mapping = {
	"1": "AA",
	"2": "BB",
	"3": "AB",
	"4": "00",
	"5": "A0", # Doesn't happen in practice
	"6": "B0", # Doesn't happen in practice
	"X": "00",
	"x": "00" # Saves a call to lower()
}

# See Simon_Grondin_PFE.pdf for more information about why there's 2 cursors and how they work together
# It's too much information to write it all here.

cursor1 = conn.cursor()
cursor2 = conn.cursor()
# The first query loads data from the "snp_genotype" table, joined with the "person" table
print "Executing SQL query 1/2..."
cursor1.execute("""
	SELECT G.person_id, G.genotype_version, P.sample, G.genotype
	FROM "public"."snp_genotype" G
	INNER JOIN "public"."person" P on G.person_id = P.id
	ORDER BY G.person_id ASC, G.genotype_version ASC LIMIT 4
""")

# The second query loads data from the "snp_annotation" table, joined with the "vcf" table
print "Executing SQL query 2/2..."
cursor2.execute("""
	SELECT
		A.genotype_index, A.annotation_version, A.rs,
		V.chromosome, V.position, (V.position + CHAR_LENGTH(ref)),
		V.ref, V.alt, A.allele_a, A.allele_b
	FROM "public"."snp_annotation" A
	LEFT JOIN "public"."vcf" V ON A.rs = V.rs
	ORDER BY A.annotation_version ASC, A.genotype_index ASC
""")
print "Writing " + str(cursor1.rowcount) + " files\n"
f1 = cursor1.fetchone()
f2 = cursor2.fetchone()
while f1:
	current_id = f1[0]
	current_version = f1[1]
	filename = "{0}{1}/Individuals_{1}_v{2}_Genotypes.tsv".format(output_dir, current_id, current_version)
	print "Writing " + filename
	file = open(filename, "a")
	file.write("personId,genotypeVersion,sample,letter,rs,chromosome,start,end,ref,alt,allele_a,allele_b\n")
	buffer = []
	while f2 and f2[1] == current_version:
		li1 = utils.to_prepared_list(f1[:3])
		li2 = utils.to_prepared_list(f2[2:])
		letter = mapping[f1[3][f2[0]-1]]
		buffer.append("""{0},{1},{2},{3},{4},{5},{6},{7},{8},"{9}",{10},{11}\n""".format(*(li1+[letter]+li2)))
		f2 = cursor2.fetchone()

	file.write("".join(buffer))
	if f2 is None: # rewind
		cursor2.scroll(0, "absolute")
		f2 = cursor2.fetchone()
	file.close()
	f1 = cursor1.fetchone()


###############
### Batches ###
###############
print "Exporting Batches"
with open(output_dir + "Batches.tsv", "w") as file:
	file.write("batchId,batchDate,batchType,description,studyName\n")

	# First do the batch table
	cursor.execute("""SELECT B.id, B.batch_date, B.description FROM "public"."batch" AS B""")
	f = cursor.fetchone()
	while f:
		li = utils.to_prepared_list(f)
		file.write("""{0},{1},ADVANCE-ON,{2},Genotyping Batch\n""".format(*li))
		f = cursor.fetchone()

	# Then do the samples table
	cursor.execute("""SELECT B.id, B.sample_date, B.description FROM "public"."samples" AS B""")
	f = cursor.fetchone()
	while f:
		li = utils.to_prepared_list(f)
		file.write("""S{0},{1},ADVANCE-ON,{2},Enrollment Batch\n""".format(*li)) # Note the "S" before the Sample ID
		f = cursor.fetchone()

print "Done"



