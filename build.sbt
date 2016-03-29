name := "optithera-importer"

version := "0.1"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "net.sf.opencsv" % "opencsv" % "2.3",
  "org.apache.avro" % "avro" % "1.7.7",
  "com.twitter" % "parquet-avro" % "1.6.0",
  "org.apache.hadoop" % "hadoop-client" % "2.7.0",
  "org.apache.spark" % "spark-core_2.10" % "1.4.1",
  "org.apache.spark" % "spark-sql_2.10" % "1.4.1"
)
