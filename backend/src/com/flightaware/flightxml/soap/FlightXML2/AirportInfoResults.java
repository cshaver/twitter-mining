/**
 * AirportInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AirportInfoResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.AirportInfoStruct airportInfoResult;

    public AirportInfoResults() {
    }

    public AirportInfoResults(
           com.flightaware.flightxml.soap.FlightXML2.AirportInfoStruct airportInfoResult) {
           this.airportInfoResult = airportInfoResult;
    }


    /**
     * Gets the airportInfoResult value for this AirportInfoResults.
     * 
     * @return airportInfoResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.AirportInfoStruct getAirportInfoResult() {
        return airportInfoResult;
    }


    /**
     * Sets the airportInfoResult value for this AirportInfoResults.
     * 
     * @param airportInfoResult
     */
    public void setAirportInfoResult(com.flightaware.flightxml.soap.FlightXML2.AirportInfoStruct airportInfoResult) {
        this.airportInfoResult = airportInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirportInfoResults)) return false;
        AirportInfoResults other = (AirportInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airportInfoResult==null && other.getAirportInfoResult()==null) || 
             (this.airportInfoResult!=null &&
              this.airportInfoResult.equals(other.getAirportInfoResult())));
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
        if (getAirportInfoResult() != null) {
            _hashCode += getAirportInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirportInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airportInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoStruct"));
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
