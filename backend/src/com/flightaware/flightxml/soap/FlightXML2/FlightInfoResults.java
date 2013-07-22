/**
 * FlightInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class FlightInfoResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.FlightInfoStruct flightInfoResult;

    public FlightInfoResults() {
    }

    public FlightInfoResults(
           com.flightaware.flightxml.soap.FlightXML2.FlightInfoStruct flightInfoResult) {
           this.flightInfoResult = flightInfoResult;
    }


    /**
     * Gets the flightInfoResult value for this FlightInfoResults.
     * 
     * @return flightInfoResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.FlightInfoStruct getFlightInfoResult() {
        return flightInfoResult;
    }


    /**
     * Sets the flightInfoResult value for this FlightInfoResults.
     * 
     * @param flightInfoResult
     */
    public void setFlightInfoResult(com.flightaware.flightxml.soap.FlightXML2.FlightInfoStruct flightInfoResult) {
        this.flightInfoResult = flightInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightInfoResults)) return false;
        FlightInfoResults other = (FlightInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flightInfoResult==null && other.getFlightInfoResult()==null) || 
             (this.flightInfoResult!=null &&
              this.flightInfoResult.equals(other.getFlightInfoResult())));
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
        if (getFlightInfoResult() != null) {
            _hashCode += getFlightInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoStruct"));
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
