/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.log4j.Logger;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class HiveServerException extends Exception implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("HiveServerException");
  private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRING, (short)1);
  private static final TField ERROR_CODE_FIELD_DESC = new TField("errorCode", TType.I32, (short)2);
  private static final TField SQLSTATE_FIELD_DESC = new TField("SQLState", TType.STRING, (short)3);

  private String message;
  public static final int MESSAGE = 1;
  private int errorCode;
  public static final int ERRORCODE = 2;
  private String SQLState;
  public static final int SQLSTATE = 3;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean errorCode = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(MESSAGE, new FieldMetaData("message", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(ERRORCODE, new FieldMetaData("errorCode", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(SQLSTATE, new FieldMetaData("SQLState", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(HiveServerException.class, metaDataMap);
  }

  public HiveServerException() {
  }

  public HiveServerException(
    String message,
    int errorCode,
    String SQLState)
  {
    this();
    this.message = message;
    this.errorCode = errorCode;
    this.__isset.errorCode = true;
    this.SQLState = SQLState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HiveServerException(HiveServerException other) {
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    __isset.errorCode = other.__isset.errorCode;
    this.errorCode = other.errorCode;
    if (other.isSetSQLState()) {
      this.SQLState = other.SQLState;
    }
  }

  @Override
  public HiveServerException clone() {
    return new HiveServerException(this);
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void unsetMessage() {
    this.message = null;
  }

  // Returns true if field message is set (has been asigned a value) and false otherwise
  public boolean isSetMessage() {
    return this.message != null;
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    this.__isset.errorCode = true;
  }

  public void unsetErrorCode() {
    this.__isset.errorCode = false;
  }

  // Returns true if field errorCode is set (has been asigned a value) and false otherwise
  public boolean isSetErrorCode() {
    return this.__isset.errorCode;
  }

  public String getSQLState() {
    return this.SQLState;
  }

  public void setSQLState(String SQLState) {
    this.SQLState = SQLState;
  }

  public void unsetSQLState() {
    this.SQLState = null;
  }

  // Returns true if field SQLState is set (has been asigned a value) and false otherwise
  public boolean isSetSQLState() {
    return this.SQLState != null;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case ERRORCODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Integer)value);
      }
      break;

    case SQLSTATE:
      if (value == null) {
        unsetSQLState();
      } else {
        setSQLState((String)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MESSAGE:
      return getMessage();

    case ERRORCODE:
      return new Integer(getErrorCode());

    case SQLSTATE:
      return getSQLState();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case MESSAGE:
      return isSetMessage();
    case ERRORCODE:
      return isSetErrorCode();
    case SQLSTATE:
      return isSetSQLState();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HiveServerException)
      return this.equals((HiveServerException)that);
    return false;
  }

  public boolean equals(HiveServerException that) {
    if (that == null)
      return false;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_errorCode = true;
    boolean that_present_errorCode = true;
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_SQLState = true && this.isSetSQLState();
    boolean that_present_SQLState = true && that.isSetSQLState();
    if (this_present_SQLState || that_present_SQLState) {
      if (!(this_present_SQLState && that_present_SQLState))
        return false;
      if (!this.SQLState.equals(that.SQLState))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case MESSAGE:
          if (field.type == TType.STRING) {
            this.message = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ERRORCODE:
          if (field.type == TType.I32) {
            this.errorCode = iprot.readI32();
            this.__isset.errorCode = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQLSTATE:
          if (field.type == TType.STRING) {
            this.SQLState = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
    oprot.writeI32(this.errorCode);
    oprot.writeFieldEnd();
    if (this.SQLState != null) {
      oprot.writeFieldBegin(SQLSTATE_FIELD_DESC);
      oprot.writeString(this.SQLState);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HiveServerException(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorCode:");
    sb.append(this.errorCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("SQLState:");
    if (this.SQLState == null) {
      sb.append("null");
    } else {
      sb.append(this.SQLState);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

