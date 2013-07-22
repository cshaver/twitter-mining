/**
 * RegisterAlertEndpointResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class RegisterAlertEndpointResults  implements java.io.Serializable {
    private int registerAlertEndpointResult;

    public RegisterAlertEndpointResults() {
    }

    public RegisterAlertEndpointResults(
           int registerAlertEndpointResult) {
           this.registerAlertEndpointResult = registerAlertEndpointResult;
    }


    /**
     * Gets the registerAlertEndpointResult value for this RegisterAlertEndpointResults.
     * 
     * @return registerAlertEndpointResult
     */
    public int getRegisterAlertEndpointResult() {
        return registerAlertEndpointResult;
    }


    /**
     * Sets the registerAlertEndpointResult value for this RegisterAlertEndpointResults.
     * 
     * @param registerAlertEndpointResult
     */
    public void setRegisterAlertEndpointResult(int registerAlertEndpointResult) {
        this.registerAlertEndpointResult = registerAlertEndpointResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterAlertEndpointResults)) return false;
        RegisterAlertEndpointResults other = (RegisterAlertEndpointResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.registerAlertEndpointResult == other.getRegisterAlertEndpointResult();
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
        _hashCode += getRegisterAlertEndpointResult();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterAlertEndpointResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerAlertEndpointResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointResult"));
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
