/**
 * AirlineInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AirlineInfoResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.AirlineInfoStruct airlineInfoResult;

    public AirlineInfoResults() {
    }

    public AirlineInfoResults(
           com.flightaware.flightxml.soap.FlightXML2.AirlineInfoStruct airlineInfoResult) {
           this.airlineInfoResult = airlineInfoResult;
    }


    /**
     * Gets the airlineInfoResult value for this AirlineInfoResults.
     * 
     * @return airlineInfoResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.AirlineInfoStruct getAirlineInfoResult() {
        return airlineInfoResult;
    }


    /**
     * Sets the airlineInfoResult value for this AirlineInfoResults.
     * 
     * @param airlineInfoResult
     */
    public void setAirlineInfoResult(com.flightaware.flightxml.soap.FlightXML2.AirlineInfoStruct airlineInfoResult) {
        this.airlineInfoResult = airlineInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineInfoResults)) return false;
        AirlineInfoResults other = (AirlineInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlineInfoResult==null && other.getAirlineInfoResult()==null) || 
             (this.airlineInfoResult!=null &&
              this.airlineInfoResult.equals(other.getAirlineInfoResult())));
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
        if (getAirlineInfoResult() != null) {
            _hashCode += getAirlineInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoStruct"));
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
