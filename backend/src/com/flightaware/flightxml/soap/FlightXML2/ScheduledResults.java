/**
 * ScheduledResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class ScheduledResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.ScheduledStruct scheduledResult;

    public ScheduledResults() {
    }

    public ScheduledResults(
           com.flightaware.flightxml.soap.FlightXML2.ScheduledStruct scheduledResult) {
           this.scheduledResult = scheduledResult;
    }


    /**
     * Gets the scheduledResult value for this ScheduledResults.
     * 
     * @return scheduledResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.ScheduledStruct getScheduledResult() {
        return scheduledResult;
    }


    /**
     * Sets the scheduledResult value for this ScheduledResults.
     * 
     * @param scheduledResult
     */
    public void setScheduledResult(com.flightaware.flightxml.soap.FlightXML2.ScheduledStruct scheduledResult) {
        this.scheduledResult = scheduledResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledResults)) return false;
        ScheduledResults other = (ScheduledResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduledResult==null && other.getScheduledResult()==null) || 
             (this.scheduledResult!=null &&
              this.scheduledResult.equals(other.getScheduledResult())));
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
        if (getScheduledResult() != null) {
            _hashCode += getScheduledResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledStruct"));
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
