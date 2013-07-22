/**
 * AirlineFlightSchedulesResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AirlineFlightSchedulesResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineFlightScheduleStruct airlineFlightSchedulesResult;

    public AirlineFlightSchedulesResults() {
    }

    public AirlineFlightSchedulesResults(
           com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineFlightScheduleStruct airlineFlightSchedulesResult) {
           this.airlineFlightSchedulesResult = airlineFlightSchedulesResult;
    }


    /**
     * Gets the airlineFlightSchedulesResult value for this AirlineFlightSchedulesResults.
     * 
     * @return airlineFlightSchedulesResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineFlightScheduleStruct getAirlineFlightSchedulesResult() {
        return airlineFlightSchedulesResult;
    }


    /**
     * Sets the airlineFlightSchedulesResult value for this AirlineFlightSchedulesResults.
     * 
     * @param airlineFlightSchedulesResult
     */
    public void setAirlineFlightSchedulesResult(com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineFlightScheduleStruct airlineFlightSchedulesResult) {
        this.airlineFlightSchedulesResult = airlineFlightSchedulesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineFlightSchedulesResults)) return false;
        AirlineFlightSchedulesResults other = (AirlineFlightSchedulesResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlineFlightSchedulesResult==null && other.getAirlineFlightSchedulesResult()==null) || 
             (this.airlineFlightSchedulesResult!=null &&
              this.airlineFlightSchedulesResult.equals(other.getAirlineFlightSchedulesResult())));
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
        if (getAirlineFlightSchedulesResult() != null) {
            _hashCode += getAirlineFlightSchedulesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineFlightSchedulesResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineFlightSchedulesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfAirlineFlightScheduleStruct"));
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
