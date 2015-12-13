/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.bdgenomics.formats.avro;  
@SuppressWarnings("all")
/** Record for describing a reference assembly. Not used for storing the contents
 of said assembly.

 @see NucleotideContigFragment */
@org.apache.avro.specific.AvroGenerated
public class Contig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Contig\",\"namespace\":\"org.bdgenomics.formats.avro\",\"doc\":\"Record for describing a reference assembly. Not used for storing the contents\\n of said assembly.\\n\\n @see NucleotideContigFragment\",\"fields\":[{\"name\":\"contigName\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of this contig in the assembly (e.g., \\\"chr1\\\").\",\"default\":null},{\"name\":\"contigLength\",\"type\":[\"null\",\"long\"],\"doc\":\"The length of this contig.\",\"default\":null},{\"name\":\"contigMD5\",\"type\":[\"null\",\"string\"],\"doc\":\"The MD5 checksum of the assembly for this contig.\",\"default\":null},{\"name\":\"referenceURL\",\"type\":[\"null\",\"string\"],\"doc\":\"The URL at which this reference assembly can be found.\",\"default\":null},{\"name\":\"assembly\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of this assembly (e.g., \\\"hg19\\\").\",\"default\":null},{\"name\":\"species\",\"type\":[\"null\",\"string\"],\"doc\":\"The species that this assembly is for.\",\"default\":null},{\"name\":\"referenceIndex\",\"type\":[\"null\",\"int\"],\"doc\":\"Optional 0-based index of this contig in a SAM file header that it was read\\n   from; helps output SAMs/BAMs with headers in the same order as they started\\n   with, before a conversion to ADAM.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The name of this contig in the assembly (e.g., "chr1"). */
  @Deprecated public java.lang.CharSequence contigName;
  /** The length of this contig. */
  @Deprecated public java.lang.Long contigLength;
  /** The MD5 checksum of the assembly for this contig. */
  @Deprecated public java.lang.CharSequence contigMD5;
  /** The URL at which this reference assembly can be found. */
  @Deprecated public java.lang.CharSequence referenceURL;
  /** The name of this assembly (e.g., "hg19"). */
  @Deprecated public java.lang.CharSequence assembly;
  /** The species that this assembly is for. */
  @Deprecated public java.lang.CharSequence species;
  /** Optional 0-based index of this contig in a SAM file header that it was read
   from; helps output SAMs/BAMs with headers in the same order as they started
   with, before a conversion to ADAM. */
  @Deprecated public java.lang.Integer referenceIndex;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Contig() {}

  /**
   * All-args constructor.
   */
  public Contig(java.lang.CharSequence contigName, java.lang.Long contigLength, java.lang.CharSequence contigMD5, java.lang.CharSequence referenceURL, java.lang.CharSequence assembly, java.lang.CharSequence species, java.lang.Integer referenceIndex) {
    this.contigName = contigName;
    this.contigLength = contigLength;
    this.contigMD5 = contigMD5;
    this.referenceURL = referenceURL;
    this.assembly = assembly;
    this.species = species;
    this.referenceIndex = referenceIndex;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return contigName;
    case 1: return contigLength;
    case 2: return contigMD5;
    case 3: return referenceURL;
    case 4: return assembly;
    case 5: return species;
    case 6: return referenceIndex;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: contigName = (java.lang.CharSequence)value$; break;
    case 1: contigLength = (java.lang.Long)value$; break;
    case 2: contigMD5 = (java.lang.CharSequence)value$; break;
    case 3: referenceURL = (java.lang.CharSequence)value$; break;
    case 4: assembly = (java.lang.CharSequence)value$; break;
    case 5: species = (java.lang.CharSequence)value$; break;
    case 6: referenceIndex = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'contigName' field.
   * The name of this contig in the assembly (e.g., "chr1").   */
  public java.lang.CharSequence getContigName() {
    return contigName;
  }

  /**
   * Sets the value of the 'contigName' field.
   * The name of this contig in the assembly (e.g., "chr1").   * @param value the value to set.
   */
  public void setContigName(java.lang.CharSequence value) {
    this.contigName = value;
  }

  /**
   * Gets the value of the 'contigLength' field.
   * The length of this contig.   */
  public java.lang.Long getContigLength() {
    return contigLength;
  }

  /**
   * Sets the value of the 'contigLength' field.
   * The length of this contig.   * @param value the value to set.
   */
  public void setContigLength(java.lang.Long value) {
    this.contigLength = value;
  }

  /**
   * Gets the value of the 'contigMD5' field.
   * The MD5 checksum of the assembly for this contig.   */
  public java.lang.CharSequence getContigMD5() {
    return contigMD5;
  }

  /**
   * Sets the value of the 'contigMD5' field.
   * The MD5 checksum of the assembly for this contig.   * @param value the value to set.
   */
  public void setContigMD5(java.lang.CharSequence value) {
    this.contigMD5 = value;
  }

  /**
   * Gets the value of the 'referenceURL' field.
   * The URL at which this reference assembly can be found.   */
  public java.lang.CharSequence getReferenceURL() {
    return referenceURL;
  }

  /**
   * Sets the value of the 'referenceURL' field.
   * The URL at which this reference assembly can be found.   * @param value the value to set.
   */
  public void setReferenceURL(java.lang.CharSequence value) {
    this.referenceURL = value;
  }

  /**
   * Gets the value of the 'assembly' field.
   * The name of this assembly (e.g., "hg19").   */
  public java.lang.CharSequence getAssembly() {
    return assembly;
  }

  /**
   * Sets the value of the 'assembly' field.
   * The name of this assembly (e.g., "hg19").   * @param value the value to set.
   */
  public void setAssembly(java.lang.CharSequence value) {
    this.assembly = value;
  }

  /**
   * Gets the value of the 'species' field.
   * The species that this assembly is for.   */
  public java.lang.CharSequence getSpecies() {
    return species;
  }

  /**
   * Sets the value of the 'species' field.
   * The species that this assembly is for.   * @param value the value to set.
   */
  public void setSpecies(java.lang.CharSequence value) {
    this.species = value;
  }

  /**
   * Gets the value of the 'referenceIndex' field.
   * Optional 0-based index of this contig in a SAM file header that it was read
   from; helps output SAMs/BAMs with headers in the same order as they started
   with, before a conversion to ADAM.   */
  public java.lang.Integer getReferenceIndex() {
    return referenceIndex;
  }

  /**
   * Sets the value of the 'referenceIndex' field.
   * Optional 0-based index of this contig in a SAM file header that it was read
   from; helps output SAMs/BAMs with headers in the same order as they started
   with, before a conversion to ADAM.   * @param value the value to set.
   */
  public void setReferenceIndex(java.lang.Integer value) {
    this.referenceIndex = value;
  }

  /** Creates a new Contig RecordBuilder */
  public static org.bdgenomics.formats.avro.Contig.Builder newBuilder() {
    return new org.bdgenomics.formats.avro.Contig.Builder();
  }
  
  /** Creates a new Contig RecordBuilder by copying an existing Builder */
  public static org.bdgenomics.formats.avro.Contig.Builder newBuilder(org.bdgenomics.formats.avro.Contig.Builder other) {
    return new org.bdgenomics.formats.avro.Contig.Builder(other);
  }
  
  /** Creates a new Contig RecordBuilder by copying an existing Contig instance */
  public static org.bdgenomics.formats.avro.Contig.Builder newBuilder(org.bdgenomics.formats.avro.Contig other) {
    return new org.bdgenomics.formats.avro.Contig.Builder(other);
  }
  
  /**
   * RecordBuilder for Contig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Contig>
    implements org.apache.avro.data.RecordBuilder<Contig> {

    private java.lang.CharSequence contigName;
    private java.lang.Long contigLength;
    private java.lang.CharSequence contigMD5;
    private java.lang.CharSequence referenceURL;
    private java.lang.CharSequence assembly;
    private java.lang.CharSequence species;
    private java.lang.Integer referenceIndex;

    /** Creates a new Builder */
    private Builder() {
      super(org.bdgenomics.formats.avro.Contig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.bdgenomics.formats.avro.Contig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.contigName)) {
        this.contigName = data().deepCopy(fields()[0].schema(), other.contigName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contigLength)) {
        this.contigLength = data().deepCopy(fields()[1].schema(), other.contigLength);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contigMD5)) {
        this.contigMD5 = data().deepCopy(fields()[2].schema(), other.contigMD5);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.referenceURL)) {
        this.referenceURL = data().deepCopy(fields()[3].schema(), other.referenceURL);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.assembly)) {
        this.assembly = data().deepCopy(fields()[4].schema(), other.assembly);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.species)) {
        this.species = data().deepCopy(fields()[5].schema(), other.species);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.referenceIndex)) {
        this.referenceIndex = data().deepCopy(fields()[6].schema(), other.referenceIndex);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Contig instance */
    private Builder(org.bdgenomics.formats.avro.Contig other) {
            super(org.bdgenomics.formats.avro.Contig.SCHEMA$);
      if (isValidValue(fields()[0], other.contigName)) {
        this.contigName = data().deepCopy(fields()[0].schema(), other.contigName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contigLength)) {
        this.contigLength = data().deepCopy(fields()[1].schema(), other.contigLength);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contigMD5)) {
        this.contigMD5 = data().deepCopy(fields()[2].schema(), other.contigMD5);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.referenceURL)) {
        this.referenceURL = data().deepCopy(fields()[3].schema(), other.referenceURL);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.assembly)) {
        this.assembly = data().deepCopy(fields()[4].schema(), other.assembly);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.species)) {
        this.species = data().deepCopy(fields()[5].schema(), other.species);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.referenceIndex)) {
        this.referenceIndex = data().deepCopy(fields()[6].schema(), other.referenceIndex);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'contigName' field */
    public java.lang.CharSequence getContigName() {
      return contigName;
    }
    
    /** Sets the value of the 'contigName' field */
    public org.bdgenomics.formats.avro.Contig.Builder setContigName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.contigName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'contigName' field has been set */
    public boolean hasContigName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'contigName' field */
    public org.bdgenomics.formats.avro.Contig.Builder clearContigName() {
      contigName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'contigLength' field */
    public java.lang.Long getContigLength() {
      return contigLength;
    }
    
    /** Sets the value of the 'contigLength' field */
    public org.bdgenomics.formats.avro.Contig.Builder setContigLength(java.lang.Long value) {
      validate(fields()[1], value);
      this.contigLength = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'contigLength' field has been set */
    public boolean hasContigLength() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'contigLength' field */
    public org.bdgenomics.formats.avro.Contig.Builder clearContigLength() {
      contigLength = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'contigMD5' field */
    public java.lang.CharSequence getContigMD5() {
      return contigMD5;
    }
    
    /** Sets the value of the 'contigMD5' field */
    public org.bdgenomics.formats.avro.Contig.Builder setContigMD5(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.contigMD5 = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'contigMD5' field has been set */
    public boolean hasContigMD5() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'contigMD5' field */
    public org.bdgenomics.formats.avro.Contig.Builder clearContigMD5() {
      contigMD5 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'referenceURL' field */
    public java.lang.CharSequence getReferenceURL() {
      return referenceURL;
    }
    
    /** Sets the value of the 'referenceURL' field */
    public org.bdgenomics.formats.avro.Contig.Builder setReferenceURL(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.referenceURL = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceURL' field has been set */
    public boolean hasReferenceURL() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'referenceURL' field */
    public org.bdgenomics.formats.avro.Contig.Builder clearReferenceURL() {
      referenceURL = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'assembly' field */
    public java.lang.CharSequence getAssembly() {
      return assembly;
    }
    
    /** Sets the value of the 'assembly' field */
    public org.bdgenomics.formats.avro.Contig.Builder setAssembly(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.assembly = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'assembly' field has been set */
    public boolean hasAssembly() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'assembly' field */
    public org.bdgenomics.formats.avro.Contig.Builder clearAssembly() {
      assembly = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'species' field */
    public java.lang.CharSequence getSpecies() {
      return species;
    }
    
    /** Sets the value of the 'species' field */
    public org.bdgenomics.formats.avro.Contig.Builder setSpecies(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.species = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'species' field has been set */
    public boolean hasSpecies() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'species' field */
    public org.bdgenomics.formats.avro.Contig.Builder clearSpecies() {
      species = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'referenceIndex' field */
    public java.lang.Integer getReferenceIndex() {
      return referenceIndex;
    }
    
    /** Sets the value of the 'referenceIndex' field */
    public org.bdgenomics.formats.avro.Contig.Builder setReferenceIndex(java.lang.Integer value) {
      validate(fields()[6], value);
      this.referenceIndex = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'referenceIndex' field has been set */
    public boolean hasReferenceIndex() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'referenceIndex' field */
    public org.bdgenomics.formats.avro.Contig.Builder clearReferenceIndex() {
      referenceIndex = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Contig build() {
      try {
        Contig record = new Contig();
        record.contigName = fieldSetFlags()[0] ? this.contigName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.contigLength = fieldSetFlags()[1] ? this.contigLength : (java.lang.Long) defaultValue(fields()[1]);
        record.contigMD5 = fieldSetFlags()[2] ? this.contigMD5 : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.referenceURL = fieldSetFlags()[3] ? this.referenceURL : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.assembly = fieldSetFlags()[4] ? this.assembly : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.species = fieldSetFlags()[5] ? this.species : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.referenceIndex = fieldSetFlags()[6] ? this.referenceIndex : (java.lang.Integer) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}