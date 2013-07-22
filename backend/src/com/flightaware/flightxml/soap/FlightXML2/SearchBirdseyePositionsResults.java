/**
 * SearchBirdseyePositionsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class SearchBirdseyePositionsResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.ArrayOfTrackExStruct searchBirdseyePositionsResult;

    public SearchBirdseyePositionsResults() {
    }

    public SearchBirdseyePositionsResults(
           com.flightaware.flightxml.soap.FlightXML2.ArrayOfTrackExStruct searchBirdseyePositionsResult) {
           this.searchBirdseyePositionsResult = searchBirdseyePositionsResult;
    }


    /**
     * Gets the searchBirdseyePositionsResult value for this SearchBirdseyePositionsResults.
     * 
     * @return searchBirdseyePositionsResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.ArrayOfTrackExStruct getSearchBirdseyePositionsResult() {
        return searchBirdseyePositionsResult;
    }


    /**
     * Sets the searchBirdseyePositionsResult value for this SearchBirdseyePositionsResults.
     * 
     * @param searchBirdseyePositionsResult
     */
    public void setSearchBirdseyePositionsResult(com.flightaware.flightxml.soap.FlightXML2.ArrayOfTrackExStruct searchBirdseyePositionsResult) {
        this.searchBirdseyePositionsResult = searchBirdseyePositionsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchBirdseyePositionsResults)) return false;
        SearchBirdseyePositionsResults other = (SearchBirdseyePositionsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchBirdseyePositionsResult==null && other.getSearchBirdseyePositionsResult()==null) || 
             (this.searchBirdseyePositionsResult!=null &&
              this.searchBirdseyePositionsResult.equals(other.getSearchBirdseyePositionsResult())));
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
        if (getSearchBirdseyePositionsResult() != null) {
            _hashCode += getSearchBirdseyePositionsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchBirdseyePositionsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchBirdseyePositionsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfTrackExStruct"));
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
