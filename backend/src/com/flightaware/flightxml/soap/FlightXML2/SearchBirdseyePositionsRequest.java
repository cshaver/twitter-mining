/**
 * SearchBirdseyePositionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class SearchBirdseyePositionsRequest  implements java.io.Serializable {
    private java.lang.String query;

    private boolean uniqueFlights;

    private int howMany;

    private int offset;

    public SearchBirdseyePositionsRequest() {
    }

    public SearchBirdseyePositionsRequest(
           java.lang.String query,
           boolean uniqueFlights,
           int howMany,
           int offset) {
           this.query = query;
           this.uniqueFlights = uniqueFlights;
           this.howMany = howMany;
           this.offset = offset;
    }


    /**
     * Gets the query value for this SearchBirdseyePositionsRequest.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this SearchBirdseyePositionsRequest.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniqueFlights value for this SearchBirdseyePositionsRequest.
     * 
     * @return uniqueFlights
     */
    public boolean isUniqueFlights() {
        return uniqueFlights;
    }


    /**
     * Sets the uniqueFlights value for this SearchBirdseyePositionsRequest.
     * 
     * @param uniqueFlights
     */
    public void setUniqueFlights(boolean uniqueFlights) {
        this.uniqueFlights = uniqueFlights;
    }


    /**
     * Gets the howMany value for this SearchBirdseyePositionsRequest.
     * 
     * @return howMany
     */
    public int getHowMany() {
        return howMany;
    }


    /**
     * Sets the howMany value for this SearchBirdseyePositionsRequest.
     * 
     * @param howMany
     */
    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }


    /**
     * Gets the offset value for this SearchBirdseyePositionsRequest.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this SearchBirdseyePositionsRequest.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchBirdseyePositionsRequest)) return false;
        SearchBirdseyePositionsRequest other = (SearchBirdseyePositionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            this.uniqueFlights == other.isUniqueFlights() &&
            this.howMany == other.getHowMany() &&
            this.offset == other.getOffset();
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        _hashCode += (isUniqueFlights() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getHowMany();
        _hashCode += getOffset();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchBirdseyePositionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueFlights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "uniqueFlights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("howMany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "howMany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
