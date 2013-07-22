/**
 * AllAirlinesResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AllAirlinesResults  implements java.io.Serializable {
    private java.lang.String[] allAirlinesResult;

    public AllAirlinesResults() {
    }

    public AllAirlinesResults(
           java.lang.String[] allAirlinesResult) {
           this.allAirlinesResult = allAirlinesResult;
    }


    /**
     * Gets the allAirlinesResult value for this AllAirlinesResults.
     * 
     * @return allAirlinesResult
     */
    public java.lang.String[] getAllAirlinesResult() {
        return allAirlinesResult;
    }


    /**
     * Sets the allAirlinesResult value for this AllAirlinesResults.
     * 
     * @param allAirlinesResult
     */
    public void setAllAirlinesResult(java.lang.String[] allAirlinesResult) {
        this.allAirlinesResult = allAirlinesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllAirlinesResults)) return false;
        AllAirlinesResults other = (AllAirlinesResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allAirlinesResult==null && other.getAllAirlinesResult()==null) || 
             (this.allAirlinesResult!=null &&
              java.util.Arrays.equals(this.allAirlinesResult, other.getAllAirlinesResult())));
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
        if (getAllAirlinesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllAirlinesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllAirlinesResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllAirlinesResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allAirlinesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "data"));
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
