/**
 * MetarExRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class MetarExRequest  implements java.io.Serializable {
    private java.lang.String airport;

    private int startTime;

    private int howMany;

    private int offset;

    public MetarExRequest() {
    }

    public MetarExRequest(
           java.lang.String airport,
           int startTime,
           int howMany,
           int offset) {
           this.airport = airport;
           this.startTime = startTime;
           this.howMany = howMany;
           this.offset = offset;
    }


    /**
     * Gets the airport value for this MetarExRequest.
     * 
     * @return airport
     */
    public java.lang.String getAirport() {
        return airport;
    }


    /**
     * Sets the airport value for this MetarExRequest.
     * 
     * @param airport
     */
    public void setAirport(java.lang.String airport) {
        this.airport = airport;
    }


    /**
     * Gets the startTime value for this MetarExRequest.
     * 
     * @return startTime
     */
    public int getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this MetarExRequest.
     * 
     * @param startTime
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the howMany value for this MetarExRequest.
     * 
     * @return howMany
     */
    public int getHowMany() {
        return howMany;
    }


    /**
     * Sets the howMany value for this MetarExRequest.
     * 
     * @param howMany
     */
    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }


    /**
     * Gets the offset value for this MetarExRequest.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this MetarExRequest.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetarExRequest)) return false;
        MetarExRequest other = (MetarExRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airport==null && other.getAirport()==null) || 
             (this.airport!=null &&
              this.airport.equals(other.getAirport()))) &&
            this.startTime == other.getStartTime() &&
            this.howMany == other.getHowMany() &&
            this.offset == other.getOffset();
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
        if (getAirport() != null) {
            _hashCode += getAirport().hashCode();
        }
        _hashCode += getStartTime();
        _hashCode += getHowMany();
        _hashCode += getOffset();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetarExRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarExRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "airport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("howMany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "howMany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "offset"));
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
