/**
 * EnrouteResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class EnrouteResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.EnrouteStruct enrouteResult;

    public EnrouteResults() {
    }

    public EnrouteResults(
           com.flightaware.flightxml.soap.FlightXML2.EnrouteStruct enrouteResult) {
           this.enrouteResult = enrouteResult;
    }


    /**
     * Gets the enrouteResult value for this EnrouteResults.
     * 
     * @return enrouteResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.EnrouteStruct getEnrouteResult() {
        return enrouteResult;
    }


    /**
     * Sets the enrouteResult value for this EnrouteResults.
     * 
     * @param enrouteResult
     */
    public void setEnrouteResult(com.flightaware.flightxml.soap.FlightXML2.EnrouteStruct enrouteResult) {
        this.enrouteResult = enrouteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnrouteResults)) return false;
        EnrouteResults other = (EnrouteResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enrouteResult==null && other.getEnrouteResult()==null) || 
             (this.enrouteResult!=null &&
              this.enrouteResult.equals(other.getEnrouteResult())));
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
        if (getEnrouteResult() != null) {
            _hashCode += getEnrouteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnrouteResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrouteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteStruct"));
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
