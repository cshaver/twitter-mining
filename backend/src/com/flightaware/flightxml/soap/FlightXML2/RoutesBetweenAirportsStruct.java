/**
 * RoutesBetweenAirportsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class RoutesBetweenAirportsStruct  implements java.io.Serializable {
    private int count;

    private java.lang.String route;

    private int filedAltitude;

    public RoutesBetweenAirportsStruct() {
    }

    public RoutesBetweenAirportsStruct(
           int count,
           java.lang.String route,
           int filedAltitude) {
           this.count = count;
           this.route = route;
           this.filedAltitude = filedAltitude;
    }


    /**
     * Gets the count value for this RoutesBetweenAirportsStruct.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this RoutesBetweenAirportsStruct.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the route value for this RoutesBetweenAirportsStruct.
     * 
     * @return route
     */
    public java.lang.String getRoute() {
        return route;
    }


    /**
     * Sets the route value for this RoutesBetweenAirportsStruct.
     * 
     * @param route
     */
    public void setRoute(java.lang.String route) {
        this.route = route;
    }


    /**
     * Gets the filedAltitude value for this RoutesBetweenAirportsStruct.
     * 
     * @return filedAltitude
     */
    public int getFiledAltitude() {
        return filedAltitude;
    }


    /**
     * Sets the filedAltitude value for this RoutesBetweenAirportsStruct.
     * 
     * @param filedAltitude
     */
    public void setFiledAltitude(int filedAltitude) {
        this.filedAltitude = filedAltitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutesBetweenAirportsStruct)) return false;
        RoutesBetweenAirportsStruct other = (RoutesBetweenAirportsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.count == other.getCount() &&
            ((this.route==null && other.getRoute()==null) || 
             (this.route!=null &&
              this.route.equals(other.getRoute()))) &&
            this.filedAltitude == other.getFiledAltitude();
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
        _hashCode += getCount();
        if (getRoute() != null) {
            _hashCode += getRoute().hashCode();
        }
        _hashCode += getFiledAltitude();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutesBetweenAirportsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "route"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filedAltitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filedAltitude"));
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
