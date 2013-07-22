/**
 * RoutesBetweenAirportsExRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class RoutesBetweenAirportsExRequest  implements java.io.Serializable {
    private java.lang.String origin;

    private java.lang.String destination;

    private int howMany;

    private int offset;

    private java.lang.String maxDepartureAge;

    private java.lang.String maxFileAge;

    public RoutesBetweenAirportsExRequest() {
    }

    public RoutesBetweenAirportsExRequest(
           java.lang.String origin,
           java.lang.String destination,
           int howMany,
           int offset,
           java.lang.String maxDepartureAge,
           java.lang.String maxFileAge) {
           this.origin = origin;
           this.destination = destination;
           this.howMany = howMany;
           this.offset = offset;
           this.maxDepartureAge = maxDepartureAge;
           this.maxFileAge = maxFileAge;
    }


    /**
     * Gets the origin value for this RoutesBetweenAirportsExRequest.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RoutesBetweenAirportsExRequest.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this RoutesBetweenAirportsExRequest.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this RoutesBetweenAirportsExRequest.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the howMany value for this RoutesBetweenAirportsExRequest.
     * 
     * @return howMany
     */
    public int getHowMany() {
        return howMany;
    }


    /**
     * Sets the howMany value for this RoutesBetweenAirportsExRequest.
     * 
     * @param howMany
     */
    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }


    /**
     * Gets the offset value for this RoutesBetweenAirportsExRequest.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this RoutesBetweenAirportsExRequest.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }


    /**
     * Gets the maxDepartureAge value for this RoutesBetweenAirportsExRequest.
     * 
     * @return maxDepartureAge
     */
    public java.lang.String getMaxDepartureAge() {
        return maxDepartureAge;
    }


    /**
     * Sets the maxDepartureAge value for this RoutesBetweenAirportsExRequest.
     * 
     * @param maxDepartureAge
     */
    public void setMaxDepartureAge(java.lang.String maxDepartureAge) {
        this.maxDepartureAge = maxDepartureAge;
    }


    /**
     * Gets the maxFileAge value for this RoutesBetweenAirportsExRequest.
     * 
     * @return maxFileAge
     */
    public java.lang.String getMaxFileAge() {
        return maxFileAge;
    }


    /**
     * Sets the maxFileAge value for this RoutesBetweenAirportsExRequest.
     * 
     * @param maxFileAge
     */
    public void setMaxFileAge(java.lang.String maxFileAge) {
        this.maxFileAge = maxFileAge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutesBetweenAirportsExRequest)) return false;
        RoutesBetweenAirportsExRequest other = (RoutesBetweenAirportsExRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.howMany == other.getHowMany() &&
            this.offset == other.getOffset() &&
            ((this.maxDepartureAge==null && other.getMaxDepartureAge()==null) || 
             (this.maxDepartureAge!=null &&
              this.maxDepartureAge.equals(other.getMaxDepartureAge()))) &&
            ((this.maxFileAge==null && other.getMaxFileAge()==null) || 
             (this.maxFileAge!=null &&
              this.maxFileAge.equals(other.getMaxFileAge())));
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
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += getHowMany();
        _hashCode += getOffset();
        if (getMaxDepartureAge() != null) {
            _hashCode += getMaxDepartureAge().hashCode();
        }
        if (getMaxFileAge() != null) {
            _hashCode += getMaxFileAge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutesBetweenAirportsExRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDepartureAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "maxDepartureAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFileAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "maxFileAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
