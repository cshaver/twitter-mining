/**
 * LatLongsToHeadingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class LatLongsToHeadingRequest  implements java.io.Serializable {
    private float lat1;

    private float lon1;

    private float lat2;

    private float lon2;

    public LatLongsToHeadingRequest() {
    }

    public LatLongsToHeadingRequest(
           float lat1,
           float lon1,
           float lat2,
           float lon2) {
           this.lat1 = lat1;
           this.lon1 = lon1;
           this.lat2 = lat2;
           this.lon2 = lon2;
    }


    /**
     * Gets the lat1 value for this LatLongsToHeadingRequest.
     * 
     * @return lat1
     */
    public float getLat1() {
        return lat1;
    }


    /**
     * Sets the lat1 value for this LatLongsToHeadingRequest.
     * 
     * @param lat1
     */
    public void setLat1(float lat1) {
        this.lat1 = lat1;
    }


    /**
     * Gets the lon1 value for this LatLongsToHeadingRequest.
     * 
     * @return lon1
     */
    public float getLon1() {
        return lon1;
    }


    /**
     * Sets the lon1 value for this LatLongsToHeadingRequest.
     * 
     * @param lon1
     */
    public void setLon1(float lon1) {
        this.lon1 = lon1;
    }


    /**
     * Gets the lat2 value for this LatLongsToHeadingRequest.
     * 
     * @return lat2
     */
    public float getLat2() {
        return lat2;
    }


    /**
     * Sets the lat2 value for this LatLongsToHeadingRequest.
     * 
     * @param lat2
     */
    public void setLat2(float lat2) {
        this.lat2 = lat2;
    }


    /**
     * Gets the lon2 value for this LatLongsToHeadingRequest.
     * 
     * @return lon2
     */
    public float getLon2() {
        return lon2;
    }


    /**
     * Sets the lon2 value for this LatLongsToHeadingRequest.
     * 
     * @param lon2
     */
    public void setLon2(float lon2) {
        this.lon2 = lon2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LatLongsToHeadingRequest)) return false;
        LatLongsToHeadingRequest other = (LatLongsToHeadingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lat1 == other.getLat1() &&
            this.lon1 == other.getLon1() &&
            this.lat2 == other.getLat2() &&
            this.lon2 == other.getLon2();
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
        _hashCode += new Float(getLat1()).hashCode();
        _hashCode += new Float(getLon1()).hashCode();
        _hashCode += new Float(getLat2()).hashCode();
        _hashCode += new Float(getLon2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LatLongsToHeadingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lat1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "lat1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lon1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "lon1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lat2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "lat2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lon2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "lon2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
