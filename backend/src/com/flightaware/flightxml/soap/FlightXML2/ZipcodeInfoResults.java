/**
 * ZipcodeInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class ZipcodeInfoResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoStruct zipcodeInfoResult;

    public ZipcodeInfoResults() {
    }

    public ZipcodeInfoResults(
           com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoStruct zipcodeInfoResult) {
           this.zipcodeInfoResult = zipcodeInfoResult;
    }


    /**
     * Gets the zipcodeInfoResult value for this ZipcodeInfoResults.
     * 
     * @return zipcodeInfoResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoStruct getZipcodeInfoResult() {
        return zipcodeInfoResult;
    }


    /**
     * Sets the zipcodeInfoResult value for this ZipcodeInfoResults.
     * 
     * @param zipcodeInfoResult
     */
    public void setZipcodeInfoResult(com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoStruct zipcodeInfoResult) {
        this.zipcodeInfoResult = zipcodeInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZipcodeInfoResults)) return false;
        ZipcodeInfoResults other = (ZipcodeInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zipcodeInfoResult==null && other.getZipcodeInfoResult()==null) || 
             (this.zipcodeInfoResult!=null &&
              this.zipcodeInfoResult.equals(other.getZipcodeInfoResult())));
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
        if (getZipcodeInfoResult() != null) {
            _hashCode += getZipcodeInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZipcodeInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcodeInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoStruct"));
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
