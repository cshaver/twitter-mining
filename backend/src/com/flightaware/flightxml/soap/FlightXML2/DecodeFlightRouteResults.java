/**
 * DecodeFlightRouteResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class DecodeFlightRouteResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.ArrayOfFlightRouteStruct decodeFlightRouteResult;

    public DecodeFlightRouteResults() {
    }

    public DecodeFlightRouteResults(
           com.flightaware.flightxml.soap.FlightXML2.ArrayOfFlightRouteStruct decodeFlightRouteResult) {
           this.decodeFlightRouteResult = decodeFlightRouteResult;
    }


    /**
     * Gets the decodeFlightRouteResult value for this DecodeFlightRouteResults.
     * 
     * @return decodeFlightRouteResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.ArrayOfFlightRouteStruct getDecodeFlightRouteResult() {
        return decodeFlightRouteResult;
    }


    /**
     * Sets the decodeFlightRouteResult value for this DecodeFlightRouteResults.
     * 
     * @param decodeFlightRouteResult
     */
    public void setDecodeFlightRouteResult(com.flightaware.flightxml.soap.FlightXML2.ArrayOfFlightRouteStruct decodeFlightRouteResult) {
        this.decodeFlightRouteResult = decodeFlightRouteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DecodeFlightRouteResults)) return false;
        DecodeFlightRouteResults other = (DecodeFlightRouteResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.decodeFlightRouteResult==null && other.getDecodeFlightRouteResult()==null) || 
             (this.decodeFlightRouteResult!=null &&
              this.decodeFlightRouteResult.equals(other.getDecodeFlightRouteResult())));
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
        if (getDecodeFlightRouteResult() != null) {
            _hashCode += getDecodeFlightRouteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DecodeFlightRouteResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decodeFlightRouteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfFlightRouteStruct"));
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
