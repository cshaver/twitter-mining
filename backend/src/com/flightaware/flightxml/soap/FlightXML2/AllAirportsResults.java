/**
 * AllAirportsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AllAirportsResults  implements java.io.Serializable {
    private java.lang.String[] allAirportsResult;

    public AllAirportsResults() {
    }

    public AllAirportsResults(
           java.lang.String[] allAirportsResult) {
           this.allAirportsResult = allAirportsResult;
    }


    /**
     * Gets the allAirportsResult value for this AllAirportsResults.
     * 
     * @return allAirportsResult
     */
    public java.lang.String[] getAllAirportsResult() {
        return allAirportsResult;
    }


    /**
     * Sets the allAirportsResult value for this AllAirportsResults.
     * 
     * @param allAirportsResult
     */
    public void setAllAirportsResult(java.lang.String[] allAirportsResult) {
        this.allAirportsResult = allAirportsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllAirportsResults)) return false;
        AllAirportsResults other = (AllAirportsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allAirportsResult==null && other.getAllAirportsResult()==null) || 
             (this.allAirportsResult!=null &&
              java.util.Arrays.equals(this.allAirportsResult, other.getAllAirportsResult())));
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
        if (getAllAirportsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllAirportsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllAirportsResult(), i);
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
        new org.apache.axis.description.TypeDesc(AllAirportsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allAirportsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsResult"));
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
