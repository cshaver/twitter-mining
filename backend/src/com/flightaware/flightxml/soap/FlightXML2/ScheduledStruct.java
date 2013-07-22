/**
 * ScheduledStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class ScheduledStruct  implements java.io.Serializable {
    private int next_offset;

    private com.flightaware.flightxml.soap.FlightXML2.ScheduledFlightStruct[] scheduled;

    public ScheduledStruct() {
    }

    public ScheduledStruct(
           int next_offset,
           com.flightaware.flightxml.soap.FlightXML2.ScheduledFlightStruct[] scheduled) {
           this.next_offset = next_offset;
           this.scheduled = scheduled;
    }


    /**
     * Gets the next_offset value for this ScheduledStruct.
     * 
     * @return next_offset
     */
    public int getNext_offset() {
        return next_offset;
    }


    /**
     * Sets the next_offset value for this ScheduledStruct.
     * 
     * @param next_offset
     */
    public void setNext_offset(int next_offset) {
        this.next_offset = next_offset;
    }


    /**
     * Gets the scheduled value for this ScheduledStruct.
     * 
     * @return scheduled
     */
    public com.flightaware.flightxml.soap.FlightXML2.ScheduledFlightStruct[] getScheduled() {
        return scheduled;
    }


    /**
     * Sets the scheduled value for this ScheduledStruct.
     * 
     * @param scheduled
     */
    public void setScheduled(com.flightaware.flightxml.soap.FlightXML2.ScheduledFlightStruct[] scheduled) {
        this.scheduled = scheduled;
    }

    public com.flightaware.flightxml.soap.FlightXML2.ScheduledFlightStruct getScheduled(int i) {
        return this.scheduled[i];
    }

    public void setScheduled(int i, com.flightaware.flightxml.soap.FlightXML2.ScheduledFlightStruct _value) {
        this.scheduled[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledStruct)) return false;
        ScheduledStruct other = (ScheduledStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.next_offset == other.getNext_offset() &&
            ((this.scheduled==null && other.getScheduled()==null) || 
             (this.scheduled!=null &&
              java.util.Arrays.equals(this.scheduled, other.getScheduled())));
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
        _hashCode += getNext_offset();
        if (getScheduled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduled(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next_offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "next_offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "scheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledFlightStruct"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
