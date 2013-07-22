/**
 * TailOwnerResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class TailOwnerResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.TailOwnerStruct tailOwnerResult;

    public TailOwnerResults() {
    }

    public TailOwnerResults(
           com.flightaware.flightxml.soap.FlightXML2.TailOwnerStruct tailOwnerResult) {
           this.tailOwnerResult = tailOwnerResult;
    }


    /**
     * Gets the tailOwnerResult value for this TailOwnerResults.
     * 
     * @return tailOwnerResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.TailOwnerStruct getTailOwnerResult() {
        return tailOwnerResult;
    }


    /**
     * Sets the tailOwnerResult value for this TailOwnerResults.
     * 
     * @param tailOwnerResult
     */
    public void setTailOwnerResult(com.flightaware.flightxml.soap.FlightXML2.TailOwnerStruct tailOwnerResult) {
        this.tailOwnerResult = tailOwnerResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TailOwnerResults)) return false;
        TailOwnerResults other = (TailOwnerResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tailOwnerResult==null && other.getTailOwnerResult()==null) || 
             (this.tailOwnerResult!=null &&
              this.tailOwnerResult.equals(other.getTailOwnerResult())));
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
        if (getTailOwnerResult() != null) {
            _hashCode += getTailOwnerResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TailOwnerResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tailOwnerResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerStruct"));
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
