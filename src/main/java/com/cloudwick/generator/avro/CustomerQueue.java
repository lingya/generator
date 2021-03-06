/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.cloudwick.generator.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CustomerQueue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerQueue\",\"namespace\":\"com.cloudwick.generator.avro\",\"fields\":[{\"name\":\"CId\",\"type\":\"int\"},{\"name\":\"CustomerTimeWatched\",\"type\":\"long\"},{\"name\":\"CName\",\"type\":\"string\"},{\"name\":\"MovieID\",\"type\":\"string\"},{\"name\":\"MovieName\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int CId;
  @Deprecated public long CustomerTimeWatched;
  @Deprecated public java.lang.CharSequence CName;
  @Deprecated public java.lang.CharSequence MovieID;
  @Deprecated public java.lang.CharSequence MovieName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CustomerQueue() {}

  /**
   * All-args constructor.
   */
  public CustomerQueue(java.lang.Integer CId, java.lang.Long CustomerTimeWatched, java.lang.CharSequence CName, java.lang.CharSequence MovieID, java.lang.CharSequence MovieName) {
    this.CId = CId;
    this.CustomerTimeWatched = CustomerTimeWatched;
    this.CName = CName;
    this.MovieID = MovieID;
    this.MovieName = MovieName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CId;
    case 1: return CustomerTimeWatched;
    case 2: return CName;
    case 3: return MovieID;
    case 4: return MovieName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CId = (java.lang.Integer)value$; break;
    case 1: CustomerTimeWatched = (java.lang.Long)value$; break;
    case 2: CName = (java.lang.CharSequence)value$; break;
    case 3: MovieID = (java.lang.CharSequence)value$; break;
    case 4: MovieName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'CId' field.
   */
  public java.lang.Integer getCId() {
    return CId;
  }

  /**
   * Sets the value of the 'CId' field.
   * @param value the value to set.
   */
  public void setCId(java.lang.Integer value) {
    this.CId = value;
  }

  /**
   * Gets the value of the 'CustomerTimeWatched' field.
   */
  public java.lang.Long getCustomerTimeWatched() {
    return CustomerTimeWatched;
  }

  /**
   * Sets the value of the 'CustomerTimeWatched' field.
   * @param value the value to set.
   */
  public void setCustomerTimeWatched(java.lang.Long value) {
    this.CustomerTimeWatched = value;
  }

  /**
   * Gets the value of the 'CName' field.
   */
  public java.lang.CharSequence getCName() {
    return CName;
  }

  /**
   * Sets the value of the 'CName' field.
   * @param value the value to set.
   */
  public void setCName(java.lang.CharSequence value) {
    this.CName = value;
  }

  /**
   * Gets the value of the 'MovieID' field.
   */
  public java.lang.CharSequence getMovieID() {
    return MovieID;
  }

  /**
   * Sets the value of the 'MovieID' field.
   * @param value the value to set.
   */
  public void setMovieID(java.lang.CharSequence value) {
    this.MovieID = value;
  }

  /**
   * Gets the value of the 'MovieName' field.
   */
  public java.lang.CharSequence getMovieName() {
    return MovieName;
  }

  /**
   * Sets the value of the 'MovieName' field.
   * @param value the value to set.
   */
  public void setMovieName(java.lang.CharSequence value) {
    this.MovieName = value;
  }

  /** Creates a new CustomerQueue RecordBuilder */
  public static com.cloudwick.generator.avro.CustomerQueue.Builder newBuilder() {
    return new com.cloudwick.generator.avro.CustomerQueue.Builder();
  }
  
  /** Creates a new CustomerQueue RecordBuilder by copying an existing Builder */
  public static com.cloudwick.generator.avro.CustomerQueue.Builder newBuilder(com.cloudwick.generator.avro.CustomerQueue.Builder other) {
    return new com.cloudwick.generator.avro.CustomerQueue.Builder(other);
  }
  
  /** Creates a new CustomerQueue RecordBuilder by copying an existing CustomerQueue instance */
  public static com.cloudwick.generator.avro.CustomerQueue.Builder newBuilder(com.cloudwick.generator.avro.CustomerQueue other) {
    return new com.cloudwick.generator.avro.CustomerQueue.Builder(other);
  }
  
  /**
   * RecordBuilder for CustomerQueue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerQueue>
    implements org.apache.avro.data.RecordBuilder<CustomerQueue> {

    private int CId;
    private long CustomerTimeWatched;
    private java.lang.CharSequence CName;
    private java.lang.CharSequence MovieID;
    private java.lang.CharSequence MovieName;

    /** Creates a new Builder */
    private Builder() {
      super(com.cloudwick.generator.avro.CustomerQueue.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.cloudwick.generator.avro.CustomerQueue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CId)) {
        this.CId = data().deepCopy(fields()[0].schema(), other.CId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CustomerTimeWatched)) {
        this.CustomerTimeWatched = data().deepCopy(fields()[1].schema(), other.CustomerTimeWatched);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CName)) {
        this.CName = data().deepCopy(fields()[2].schema(), other.CName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.MovieID)) {
        this.MovieID = data().deepCopy(fields()[3].schema(), other.MovieID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.MovieName)) {
        this.MovieName = data().deepCopy(fields()[4].schema(), other.MovieName);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CustomerQueue instance */
    private Builder(com.cloudwick.generator.avro.CustomerQueue other) {
            super(com.cloudwick.generator.avro.CustomerQueue.SCHEMA$);
      if (isValidValue(fields()[0], other.CId)) {
        this.CId = data().deepCopy(fields()[0].schema(), other.CId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CustomerTimeWatched)) {
        this.CustomerTimeWatched = data().deepCopy(fields()[1].schema(), other.CustomerTimeWatched);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CName)) {
        this.CName = data().deepCopy(fields()[2].schema(), other.CName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.MovieID)) {
        this.MovieID = data().deepCopy(fields()[3].schema(), other.MovieID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.MovieName)) {
        this.MovieName = data().deepCopy(fields()[4].schema(), other.MovieName);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'CId' field */
    public java.lang.Integer getCId() {
      return CId;
    }
    
    /** Sets the value of the 'CId' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder setCId(int value) {
      validate(fields()[0], value);
      this.CId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'CId' field has been set */
    public boolean hasCId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'CId' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder clearCId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'CustomerTimeWatched' field */
    public java.lang.Long getCustomerTimeWatched() {
      return CustomerTimeWatched;
    }
    
    /** Sets the value of the 'CustomerTimeWatched' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder setCustomerTimeWatched(long value) {
      validate(fields()[1], value);
      this.CustomerTimeWatched = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'CustomerTimeWatched' field has been set */
    public boolean hasCustomerTimeWatched() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'CustomerTimeWatched' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder clearCustomerTimeWatched() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'CName' field */
    public java.lang.CharSequence getCName() {
      return CName;
    }
    
    /** Sets the value of the 'CName' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder setCName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.CName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'CName' field has been set */
    public boolean hasCName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'CName' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder clearCName() {
      CName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'MovieID' field */
    public java.lang.CharSequence getMovieID() {
      return MovieID;
    }
    
    /** Sets the value of the 'MovieID' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder setMovieID(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.MovieID = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'MovieID' field has been set */
    public boolean hasMovieID() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'MovieID' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder clearMovieID() {
      MovieID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'MovieName' field */
    public java.lang.CharSequence getMovieName() {
      return MovieName;
    }
    
    /** Sets the value of the 'MovieName' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder setMovieName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.MovieName = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'MovieName' field has been set */
    public boolean hasMovieName() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'MovieName' field */
    public com.cloudwick.generator.avro.CustomerQueue.Builder clearMovieName() {
      MovieName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public CustomerQueue build() {
      try {
        CustomerQueue record = new CustomerQueue();
        record.CId = fieldSetFlags()[0] ? this.CId : (java.lang.Integer) defaultValue(fields()[0]);
        record.CustomerTimeWatched = fieldSetFlags()[1] ? this.CustomerTimeWatched : (java.lang.Long) defaultValue(fields()[1]);
        record.CName = fieldSetFlags()[2] ? this.CName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.MovieID = fieldSetFlags()[3] ? this.MovieID : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.MovieName = fieldSetFlags()[4] ? this.MovieName : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
