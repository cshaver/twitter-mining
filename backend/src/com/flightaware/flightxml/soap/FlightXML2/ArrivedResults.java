/**
 * ArrivedResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class ArrivedResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.ArrivalStruct arrivedResult;

    public ArrivedResults() {
    }

    public ArrivedResults(
           com.flightaware.flightxml.soap.FlightXML2.ArrivalStruct arrivedResult) {
           this.arrivedResult = arrivedResult;
    }


    /**
     * Gets the arrivedResult value for this ArrivedResults.
     * 
     * @return arrivedResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.ArrivalStruct getArrivedResult() {
        return arrivedResult;
    }


    /**
     * Sets the arrivedResult value for this ArrivedResults.
     * 
     * @param arrivedResult
     */
    public void setArrivedResult(com.flightaware.flightxml.soap.FlightXML2.ArrivalStruct arrivedResult) {
        this.arrivedResult = arrivedResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrivedResults)) return false;
        ArrivedResults other = (ArrivedResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrivedResult==null && other.getArrivedResult()==null) || 
             (this.arrivedResult!=null &&
              this.arrivedResult.equals(other.getArrivedResult())));
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
        if (getArrivedResult() != null) {
            _hashCode += getArrivedResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrivedResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivalStruct"));
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
