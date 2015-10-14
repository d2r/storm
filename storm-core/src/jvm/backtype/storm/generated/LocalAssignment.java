/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-6")
public class LocalAssignment implements org.apache.thrift.TBase<LocalAssignment, LocalAssignment._Fields>, java.io.Serializable, Cloneable, Comparable<LocalAssignment> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LocalAssignment");

  private static final org.apache.thrift.protocol.TField TOPOLOGY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("topology_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXECUTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("executors", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LocalAssignmentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LocalAssignmentTupleSchemeFactory());
  }

  private String topology_id; // required
  private List<ExecutorInfo> executors; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPOLOGY_ID((short)1, "topology_id"),
    EXECUTORS((short)2, "executors");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOPOLOGY_ID
          return TOPOLOGY_ID;
        case 2: // EXECUTORS
          return EXECUTORS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY_ID, new org.apache.thrift.meta_data.FieldMetaData("topology_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTORS, new org.apache.thrift.meta_data.FieldMetaData("executors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ExecutorInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LocalAssignment.class, metaDataMap);
  }

  public LocalAssignment() {
  }

  public LocalAssignment(
    String topology_id,
    List<ExecutorInfo> executors)
  {
    this();
    this.topology_id = topology_id;
    this.executors = executors;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LocalAssignment(LocalAssignment other) {
    if (other.is_set_topology_id()) {
      this.topology_id = other.topology_id;
    }
    if (other.is_set_executors()) {
      List<ExecutorInfo> __this__executors = new ArrayList<ExecutorInfo>(other.executors.size());
      for (ExecutorInfo other_element : other.executors) {
        __this__executors.add(new ExecutorInfo(other_element));
      }
      this.executors = __this__executors;
    }
  }

  public LocalAssignment deepCopy() {
    return new LocalAssignment(this);
  }

  @Override
  public void clear() {
    this.topology_id = null;
    this.executors = null;
  }

  public String get_topology_id() {
    return this.topology_id;
  }

  public void set_topology_id(String topology_id) {
    this.topology_id = topology_id;
  }

  public void unset_topology_id() {
    this.topology_id = null;
  }

  /** Returns true if field topology_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_topology_id() {
    return this.topology_id != null;
  }

  public void set_topology_id_isSet(boolean value) {
    if (!value) {
      this.topology_id = null;
    }
  }

  public int get_executors_size() {
    return (this.executors == null) ? 0 : this.executors.size();
  }

  public java.util.Iterator<ExecutorInfo> get_executors_iterator() {
    return (this.executors == null) ? null : this.executors.iterator();
  }

  public void add_to_executors(ExecutorInfo elem) {
    if (this.executors == null) {
      this.executors = new ArrayList<ExecutorInfo>();
    }
    this.executors.add(elem);
  }

  public List<ExecutorInfo> get_executors() {
    return this.executors;
  }

  public void set_executors(List<ExecutorInfo> executors) {
    this.executors = executors;
  }

  public void unset_executors() {
    this.executors = null;
  }

  /** Returns true if field executors is set (has been assigned a value) and false otherwise */
  public boolean is_set_executors() {
    return this.executors != null;
  }

  public void set_executors_isSet(boolean value) {
    if (!value) {
      this.executors = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPOLOGY_ID:
      if (value == null) {
        unset_topology_id();
      } else {
        set_topology_id((String)value);
      }
      break;

    case EXECUTORS:
      if (value == null) {
        unset_executors();
      } else {
        set_executors((List<ExecutorInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY_ID:
      return get_topology_id();

    case EXECUTORS:
      return get_executors();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPOLOGY_ID:
      return is_set_topology_id();
    case EXECUTORS:
      return is_set_executors();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LocalAssignment)
      return this.equals((LocalAssignment)that);
    return false;
  }

  public boolean equals(LocalAssignment that) {
    if (that == null)
      return false;

    boolean this_present_topology_id = true && this.is_set_topology_id();
    boolean that_present_topology_id = true && that.is_set_topology_id();
    if (this_present_topology_id || that_present_topology_id) {
      if (!(this_present_topology_id && that_present_topology_id))
        return false;
      if (!this.topology_id.equals(that.topology_id))
        return false;
    }

    boolean this_present_executors = true && this.is_set_executors();
    boolean that_present_executors = true && that.is_set_executors();
    if (this_present_executors || that_present_executors) {
      if (!(this_present_executors && that_present_executors))
        return false;
      if (!this.executors.equals(that.executors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topology_id = true && (is_set_topology_id());
    list.add(present_topology_id);
    if (present_topology_id)
      list.add(topology_id);

    boolean present_executors = true && (is_set_executors());
    list.add(present_executors);
    if (present_executors)
      list.add(executors);

    return list.hashCode();
  }

  @Override
  public int compareTo(LocalAssignment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_topology_id()).compareTo(other.is_set_topology_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topology_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topology_id, other.topology_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_executors()).compareTo(other.is_set_executors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executors, other.executors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LocalAssignment(");
    boolean first = true;

    sb.append("topology_id:");
    if (this.topology_id == null) {
      sb.append("null");
    } else {
      sb.append(this.topology_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executors:");
    if (this.executors == null) {
      sb.append("null");
    } else {
      sb.append(this.executors);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_topology_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topology_id' is unset! Struct:" + toString());
    }

    if (!is_set_executors()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'executors' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LocalAssignmentStandardSchemeFactory implements SchemeFactory {
    public LocalAssignmentStandardScheme getScheme() {
      return new LocalAssignmentStandardScheme();
    }
  }

  private static class LocalAssignmentStandardScheme extends StandardScheme<LocalAssignment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LocalAssignment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPOLOGY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topology_id = iprot.readString();
              struct.set_topology_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXECUTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list610 = iprot.readListBegin();
                struct.executors = new ArrayList<ExecutorInfo>(_list610.size);
                ExecutorInfo _elem611;
                for (int _i612 = 0; _i612 < _list610.size; ++_i612)
                {
                  _elem611 = new ExecutorInfo();
                  _elem611.read(iprot);
                  struct.executors.add(_elem611);
                }
                iprot.readListEnd();
              }
              struct.set_executors_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LocalAssignment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topology_id != null) {
        oprot.writeFieldBegin(TOPOLOGY_ID_FIELD_DESC);
        oprot.writeString(struct.topology_id);
        oprot.writeFieldEnd();
      }
      if (struct.executors != null) {
        oprot.writeFieldBegin(EXECUTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.executors.size()));
          for (ExecutorInfo _iter613 : struct.executors)
          {
            _iter613.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocalAssignmentTupleSchemeFactory implements SchemeFactory {
    public LocalAssignmentTupleScheme getScheme() {
      return new LocalAssignmentTupleScheme();
    }
  }

  private static class LocalAssignmentTupleScheme extends TupleScheme<LocalAssignment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LocalAssignment struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topology_id);
      {
        oprot.writeI32(struct.executors.size());
        for (ExecutorInfo _iter614 : struct.executors)
        {
          _iter614.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LocalAssignment struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topology_id = iprot.readString();
      struct.set_topology_id_isSet(true);
      {
        org.apache.thrift.protocol.TList _list615 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.executors = new ArrayList<ExecutorInfo>(_list615.size);
        ExecutorInfo _elem616;
        for (int _i617 = 0; _i617 < _list615.size; ++_i617)
        {
          _elem616 = new ExecutorInfo();
          _elem616.read(iprot);
          struct.executors.add(_elem616);
        }
      }
      struct.set_executors_isSet(true);
    }
  }

}

