/**
 * ArrayOfAirlineInsightStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class ArrayOfAirlineInsightStruct  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct[] data;

    private int start_date;

    private int end_date;

    public ArrayOfAirlineInsightStruct() {
    }

    public ArrayOfAirlineInsightStruct(
           com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct[] data,
           int start_date,
           int end_date) {
           this.data = data;
           this.start_date = start_date;
           this.end_date = end_date;
    }


    /**
     * Gets the data value for this ArrayOfAirlineInsightStruct.
     * 
     * @return data
     */
    public com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct[] getData() {
        return data;
    }


    /**
     * Sets the data value for this ArrayOfAirlineInsightStruct.
     * 
     * @param data
     */
    public void setData(com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct[] data) {
        this.data = data;
    }

    public com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct getData(int i) {
        return this.data[i];
    }

    public void setData(int i, com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct _value) {
        this.data[i] = _value;
    }


    /**
     * Gets the start_date value for this ArrayOfAirlineInsightStruct.
     * 
     * @return start_date
     */
    public int getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this ArrayOfAirlineInsightStruct.
     * 
     * @param start_date
     */
    public void setStart_date(int start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the end_date value for this ArrayOfAirlineInsightStruct.
     * 
     * @return end_date
     */
    public int getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this ArrayOfAirlineInsightStruct.
     * 
     * @param end_date
     */
    public void setEnd_date(int end_date) {
        this.end_date = end_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAirlineInsightStruct)) return false;
        ArrayOfAirlineInsightStruct other = (ArrayOfAirlineInsightStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            this.start_date == other.getStart_date() &&
            this.end_date == other.getEnd_date();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getStart_date();
        _hashCode += getEnd_date();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfAirlineInsightStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfAirlineInsightStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightStruct"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
