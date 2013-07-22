/**
 * LatLongsToHeadingResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class LatLongsToHeadingResults  implements java.io.Serializable {
    private int latLongsToHeadingResult;

    public LatLongsToHeadingResults() {
    }

    public LatLongsToHeadingResults(
           int latLongsToHeadingResult) {
           this.latLongsToHeadingResult = latLongsToHeadingResult;
    }


    /**
     * Gets the latLongsToHeadingResult value for this LatLongsToHeadingResults.
     * 
     * @return latLongsToHeadingResult
     */
    public int getLatLongsToHeadingResult() {
        return latLongsToHeadingResult;
    }


    /**
     * Sets the latLongsToHeadingResult value for this LatLongsToHeadingResults.
     * 
     * @param latLongsToHeadingResult
     */
    public void setLatLongsToHeadingResult(int latLongsToHeadingResult) {
        this.latLongsToHeadingResult = latLongsToHeadingResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LatLongsToHeadingResults)) return false;
        LatLongsToHeadingResults other = (LatLongsToHeadingResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latLongsToHeadingResult == other.getLatLongsToHeadingResult();
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
        _hashCode += getLatLongsToHeadingResult();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LatLongsToHeadingResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latLongsToHeadingResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingResult"));
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
