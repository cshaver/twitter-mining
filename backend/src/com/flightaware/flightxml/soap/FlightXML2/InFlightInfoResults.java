/**
 * InFlightInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class InFlightInfoResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.InFlightAircraftStruct inFlightInfoResult;

    public InFlightInfoResults() {
    }

    public InFlightInfoResults(
           com.flightaware.flightxml.soap.FlightXML2.InFlightAircraftStruct inFlightInfoResult) {
           this.inFlightInfoResult = inFlightInfoResult;
    }


    /**
     * Gets the inFlightInfoResult value for this InFlightInfoResults.
     * 
     * @return inFlightInfoResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.InFlightAircraftStruct getInFlightInfoResult() {
        return inFlightInfoResult;
    }


    /**
     * Sets the inFlightInfoResult value for this InFlightInfoResults.
     * 
     * @param inFlightInfoResult
     */
    public void setInFlightInfoResult(com.flightaware.flightxml.soap.FlightXML2.InFlightAircraftStruct inFlightInfoResult) {
        this.inFlightInfoResult = inFlightInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InFlightInfoResults)) return false;
        InFlightInfoResults other = (InFlightInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inFlightInfoResult==null && other.getInFlightInfoResult()==null) || 
             (this.inFlightInfoResult!=null &&
              this.inFlightInfoResult.equals(other.getInFlightInfoResult())));
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
        if (getInFlightInfoResult() != null) {
            _hashCode += getInFlightInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InFlightInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inFlightInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightAircraftStruct"));
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
