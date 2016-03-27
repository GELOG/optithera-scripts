/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.bdgenomics.formats.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Batch extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Batch\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"batchDateEpoch\",\"type\":[\"null\",\"long\"],\"doc\":\"Creation date of this batch.\\n\\n   Stored as a number of milliseconds since the UNIX Epoch \\n   (Jan. 1st 1970 at 00:00:00 in UTC timezone).\",\"default\":null},{\"name\":\"batchType\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of the batch (e.g. sample batch, genotyping batch, etc).\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"Textual description of this batch.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Creation date of this batch.

   Stored as a number of milliseconds since the UNIX Epoch 
   (Jan. 1st 1970 at 00:00:00 in UTC timezone). */
  @Deprecated public java.lang.Long batchDateEpoch;
  /** Type of the batch (e.g. sample batch, genotyping batch, etc). */
  @Deprecated public java.lang.CharSequence batchType;
  /** Textual description of this batch. */
  @Deprecated public java.lang.CharSequence description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Batch() {}

  /**
   * All-args constructor.
   */
  public Batch(java.lang.Long batchDateEpoch, java.lang.CharSequence batchType, java.lang.CharSequence description) {
    this.batchDateEpoch = batchDateEpoch;
    this.batchType = batchType;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return batchDateEpoch;
    case 1: return batchType;
    case 2: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: batchDateEpoch = (java.lang.Long)value$; break;
    case 1: batchType = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'batchDateEpoch' field.
   * Creation date of this batch.

   Stored as a number of milliseconds since the UNIX Epoch 
   (Jan. 1st 1970 at 00:00:00 in UTC timezone).   */
  public java.lang.Long getBatchDateEpoch() {
    return batchDateEpoch;
  }

  /**
   * Sets the value of the 'batchDateEpoch' field.
   * Creation date of this batch.

   Stored as a number of milliseconds since the UNIX Epoch 
   (Jan. 1st 1970 at 00:00:00 in UTC timezone).   * @param value the value to set.
   */
  public void setBatchDateEpoch(java.lang.Long value) {
    this.batchDateEpoch = value;
  }

  /**
   * Gets the value of the 'batchType' field.
   * Type of the batch (e.g. sample batch, genotyping batch, etc).   */
  public java.lang.CharSequence getBatchType() {
    return batchType;
  }

  /**
   * Sets the value of the 'batchType' field.
   * Type of the batch (e.g. sample batch, genotyping batch, etc).   * @param value the value to set.
   */
  public void setBatchType(java.lang.CharSequence value) {
    this.batchType = value;
  }

  /**
   * Gets the value of the 'description' field.
   * Textual description of this batch.   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Textual description of this batch.   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /** Creates a new Batch RecordBuilder */
  public static org.bdgenomics.formats.avro.Batch.Builder newBuilder() {
    return new org.bdgenomics.formats.avro.Batch.Builder();
  }
  
  /** Creates a new Batch RecordBuilder by copying an existing Builder */
  public static org.bdgenomics.formats.avro.Batch.Builder newBuilder(org.bdgenomics.formats.avro.Batch.Builder other) {
    return new org.bdgenomics.formats.avro.Batch.Builder(other);
  }
  
  /** Creates a new Batch RecordBuilder by copying an existing Batch instance */
  public static org.bdgenomics.formats.avro.Batch.Builder newBuilder(org.bdgenomics.formats.avro.Batch other) {
    return new org.bdgenomics.formats.avro.Batch.Builder(other);
  }
  
  /**
   * RecordBuilder for Batch instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Batch>
    implements org.apache.avro.data.RecordBuilder<Batch> {

    private java.lang.Long batchDateEpoch;
    private java.lang.CharSequence batchType;
    private java.lang.CharSequence description;

    /** Creates a new Builder */
    private Builder() {
      super(org.bdgenomics.formats.avro.Batch.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.bdgenomics.formats.avro.Batch.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.batchDateEpoch)) {
        this.batchDateEpoch = data().deepCopy(fields()[0].schema(), other.batchDateEpoch);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.batchType)) {
        this.batchType = data().deepCopy(fields()[1].schema(), other.batchType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Batch instance */
    private Builder(org.bdgenomics.formats.avro.Batch other) {
            super(org.bdgenomics.formats.avro.Batch.SCHEMA$);
      if (isValidValue(fields()[0], other.batchDateEpoch)) {
        this.batchDateEpoch = data().deepCopy(fields()[0].schema(), other.batchDateEpoch);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.batchType)) {
        this.batchType = data().deepCopy(fields()[1].schema(), other.batchType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'batchDateEpoch' field */
    public java.lang.Long getBatchDateEpoch() {
      return batchDateEpoch;
    }
    
    /** Sets the value of the 'batchDateEpoch' field */
    public org.bdgenomics.formats.avro.Batch.Builder setBatchDateEpoch(java.lang.Long value) {
      validate(fields()[0], value);
      this.batchDateEpoch = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'batchDateEpoch' field has been set */
    public boolean hasBatchDateEpoch() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'batchDateEpoch' field */
    public org.bdgenomics.formats.avro.Batch.Builder clearBatchDateEpoch() {
      batchDateEpoch = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'batchType' field */
    public java.lang.CharSequence getBatchType() {
      return batchType;
    }
    
    /** Sets the value of the 'batchType' field */
    public org.bdgenomics.formats.avro.Batch.Builder setBatchType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.batchType = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'batchType' field has been set */
    public boolean hasBatchType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'batchType' field */
    public org.bdgenomics.formats.avro.Batch.Builder clearBatchType() {
      batchType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public org.bdgenomics.formats.avro.Batch.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public org.bdgenomics.formats.avro.Batch.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Batch build() {
      try {
        Batch record = new Batch();
        record.batchDateEpoch = fieldSetFlags()[0] ? this.batchDateEpoch : (java.lang.Long) defaultValue(fields()[0]);
        record.batchType = fieldSetFlags()[1] ? this.batchType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}