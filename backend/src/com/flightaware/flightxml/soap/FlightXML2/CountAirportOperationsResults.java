/**
 * CountAirportOperationsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class CountAirportOperationsResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsStruct countAirportOperationsResult;

    public CountAirportOperationsResults() {
    }

    public CountAirportOperationsResults(
           com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsStruct countAirportOperationsResult) {
           this.countAirportOperationsResult = countAirportOperationsResult;
    }


    /**
     * Gets the countAirportOperationsResult value for this CountAirportOperationsResults.
     * 
     * @return countAirportOperationsResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsStruct getCountAirportOperationsResult() {
        return countAirportOperationsResult;
    }


    /**
     * Sets the countAirportOperationsResult value for this CountAirportOperationsResults.
     * 
     * @param countAirportOperationsResult
     */
    public void setCountAirportOperationsResult(com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsStruct countAirportOperationsResult) {
        this.countAirportOperationsResult = countAirportOperationsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountAirportOperationsResults)) return false;
        CountAirportOperationsResults other = (CountAirportOperationsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countAirportOperationsResult==null && other.getCountAirportOperationsResult()==null) || 
             (this.countAirportOperationsResult!=null &&
              this.countAirportOperationsResult.equals(other.getCountAirportOperationsResult())));
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
        if (getCountAirportOperationsResult() != null) {
            _hashCode += getCountAirportOperationsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountAirportOperationsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countAirportOperationsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsStruct"));
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
