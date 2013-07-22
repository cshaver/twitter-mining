/**
 * MapFlightRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class MapFlightRequest  implements java.io.Serializable {
    private java.lang.String ident;

    private int mapHeight;

    private int mapWidth;

    public MapFlightRequest() {
    }

    public MapFlightRequest(
           java.lang.String ident,
           int mapHeight,
           int mapWidth) {
           this.ident = ident;
           this.mapHeight = mapHeight;
           this.mapWidth = mapWidth;
    }


    /**
     * Gets the ident value for this MapFlightRequest.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this MapFlightRequest.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the mapHeight value for this MapFlightRequest.
     * 
     * @return mapHeight
     */
    public int getMapHeight() {
        return mapHeight;
    }


    /**
     * Sets the mapHeight value for this MapFlightRequest.
     * 
     * @param mapHeight
     */
    public void setMapHeight(int mapHeight) {
        this.mapHeight = mapHeight;
    }


    /**
     * Gets the mapWidth value for this MapFlightRequest.
     * 
     * @return mapWidth
     */
    public int getMapWidth() {
        return mapWidth;
    }


    /**
     * Sets the mapWidth value for this MapFlightRequest.
     * 
     * @param mapWidth
     */
    public void setMapWidth(int mapWidth) {
        this.mapWidth = mapWidth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapFlightRequest)) return false;
        MapFlightRequest other = (MapFlightRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ident==null && other.getIdent()==null) || 
             (this.ident!=null &&
              this.ident.equals(other.getIdent()))) &&
            this.mapHeight == other.getMapHeight() &&
            this.mapWidth == other.getMapWidth();
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
        if (getIdent() != null) {
            _hashCode += getIdent().hashCode();
        }
        _hashCode += getMapHeight();
        _hashCode += getMapWidth();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapFlightRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "mapHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "mapWidth"));
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
