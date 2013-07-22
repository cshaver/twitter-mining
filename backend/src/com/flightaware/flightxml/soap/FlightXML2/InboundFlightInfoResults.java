/**
 * InboundFlightInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class InboundFlightInfoResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.FlightExStruct inboundFlightInfoResult;

    public InboundFlightInfoResults() {
    }

    public InboundFlightInfoResults(
           com.flightaware.flightxml.soap.FlightXML2.FlightExStruct inboundFlightInfoResult) {
           this.inboundFlightInfoResult = inboundFlightInfoResult;
    }


    /**
     * Gets the inboundFlightInfoResult value for this InboundFlightInfoResults.
     * 
     * @return inboundFlightInfoResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.FlightExStruct getInboundFlightInfoResult() {
        return inboundFlightInfoResult;
    }


    /**
     * Sets the inboundFlightInfoResult value for this InboundFlightInfoResults.
     * 
     * @param inboundFlightInfoResult
     */
    public void setInboundFlightInfoResult(com.flightaware.flightxml.soap.FlightXML2.FlightExStruct inboundFlightInfoResult) {
        this.inboundFlightInfoResult = inboundFlightInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundFlightInfoResults)) return false;
        InboundFlightInfoResults other = (InboundFlightInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inboundFlightInfoResult==null && other.getInboundFlightInfoResult()==null) || 
             (this.inboundFlightInfoResult!=null &&
              this.inboundFlightInfoResult.equals(other.getInboundFlightInfoResult())));
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
        if (getInboundFlightInfoResult() != null) {
            _hashCode += getInboundFlightInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundFlightInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundFlightInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightExStruct"));
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
