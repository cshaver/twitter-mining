/**
 * RoutesBetweenAirportsExStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class RoutesBetweenAirportsExStruct  implements java.io.Serializable {
    private int count;

    private java.lang.String route;

    private int filedAltitude_min;

    private int filedAltitude_max;

    private int last_departuretime;

    public RoutesBetweenAirportsExStruct() {
    }

    public RoutesBetweenAirportsExStruct(
           int count,
           java.lang.String route,
           int filedAltitude_min,
           int filedAltitude_max,
           int last_departuretime) {
           this.count = count;
           this.route = route;
           this.filedAltitude_min = filedAltitude_min;
           this.filedAltitude_max = filedAltitude_max;
           this.last_departuretime = last_departuretime;
    }


    /**
     * Gets the count value for this RoutesBetweenAirportsExStruct.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this RoutesBetweenAirportsExStruct.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the route value for this RoutesBetweenAirportsExStruct.
     * 
     * @return route
     */
    public java.lang.String getRoute() {
        return route;
    }


    /**
     * Sets the route value for this RoutesBetweenAirportsExStruct.
     * 
     * @param route
     */
    public void setRoute(java.lang.String route) {
        this.route = route;
    }


    /**
     * Gets the filedAltitude_min value for this RoutesBetweenAirportsExStruct.
     * 
     * @return filedAltitude_min
     */
    public int getFiledAltitude_min() {
        return filedAltitude_min;
    }


    /**
     * Sets the filedAltitude_min value for this RoutesBetweenAirportsExStruct.
     * 
     * @param filedAltitude_min
     */
    public void setFiledAltitude_min(int filedAltitude_min) {
        this.filedAltitude_min = filedAltitude_min;
    }


    /**
     * Gets the filedAltitude_max value for this RoutesBetweenAirportsExStruct.
     * 
     * @return filedAltitude_max
     */
    public int getFiledAltitude_max() {
        return filedAltitude_max;
    }


    /**
     * Sets the filedAltitude_max value for this RoutesBetweenAirportsExStruct.
     * 
     * @param filedAltitude_max
     */
    public void setFiledAltitude_max(int filedAltitude_max) {
        this.filedAltitude_max = filedAltitude_max;
    }


    /**
     * Gets the last_departuretime value for this RoutesBetweenAirportsExStruct.
     * 
     * @return last_departuretime
     */
    public int getLast_departuretime() {
        return last_departuretime;
    }


    /**
     * Sets the last_departuretime value for this RoutesBetweenAirportsExStruct.
     * 
     * @param last_departuretime
     */
    public void setLast_departuretime(int last_departuretime) {
        this.last_departuretime = last_departuretime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutesBetweenAirportsExStruct)) return false;
        RoutesBetweenAirportsExStruct other = (RoutesBetweenAirportsExStruct) obj;
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
            this.filedAltitude_min == other.getFiledAltitude_min() &&
            this.filedAltitude_max == other.getFiledAltitude_max() &&
            this.last_departuretime == other.getLast_departuretime();
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
        _hashCode += getFiledAltitude_min();
        _hashCode += getFiledAltitude_max();
        _hashCode += getLast_departuretime();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutesBetweenAirportsExStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExStruct"));
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
        elemField.setFieldName("filedAltitude_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filedAltitude_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filedAltitude_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filedAltitude_max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_departuretime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "last_departuretime"));
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
