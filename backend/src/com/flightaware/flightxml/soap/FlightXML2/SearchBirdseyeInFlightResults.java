/**
 * SearchBirdseyeInFlightResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class SearchBirdseyeInFlightResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.InFlightStruct searchBirdseyeInFlightResult;

    public SearchBirdseyeInFlightResults() {
    }

    public SearchBirdseyeInFlightResults(
           com.flightaware.flightxml.soap.FlightXML2.InFlightStruct searchBirdseyeInFlightResult) {
           this.searchBirdseyeInFlightResult = searchBirdseyeInFlightResult;
    }


    /**
     * Gets the searchBirdseyeInFlightResult value for this SearchBirdseyeInFlightResults.
     * 
     * @return searchBirdseyeInFlightResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.InFlightStruct getSearchBirdseyeInFlightResult() {
        return searchBirdseyeInFlightResult;
    }


    /**
     * Sets the searchBirdseyeInFlightResult value for this SearchBirdseyeInFlightResults.
     * 
     * @param searchBirdseyeInFlightResult
     */
    public void setSearchBirdseyeInFlightResult(com.flightaware.flightxml.soap.FlightXML2.InFlightStruct searchBirdseyeInFlightResult) {
        this.searchBirdseyeInFlightResult = searchBirdseyeInFlightResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchBirdseyeInFlightResults)) return false;
        SearchBirdseyeInFlightResults other = (SearchBirdseyeInFlightResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchBirdseyeInFlightResult==null && other.getSearchBirdseyeInFlightResult()==null) || 
             (this.searchBirdseyeInFlightResult!=null &&
              this.searchBirdseyeInFlightResult.equals(other.getSearchBirdseyeInFlightResult())));
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
        if (getSearchBirdseyeInFlightResult() != null) {
            _hashCode += getSearchBirdseyeInFlightResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchBirdseyeInFlightResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchBirdseyeInFlightResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightStruct"));
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
