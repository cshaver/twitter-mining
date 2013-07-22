/**
 * AirlineFlightSchedulesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AirlineFlightSchedulesRequest  implements java.io.Serializable {
    private int startDate;

    private int endDate;

    private java.lang.String origin;

    private java.lang.String destination;

    private java.lang.String airline;

    private java.lang.String flightno;

    private int howMany;

    private int offset;

    public AirlineFlightSchedulesRequest() {
    }

    public AirlineFlightSchedulesRequest(
           int startDate,
           int endDate,
           java.lang.String origin,
           java.lang.String destination,
           java.lang.String airline,
           java.lang.String flightno,
           int howMany,
           int offset) {
           this.startDate = startDate;
           this.endDate = endDate;
           this.origin = origin;
           this.destination = destination;
           this.airline = airline;
           this.flightno = flightno;
           this.howMany = howMany;
           this.offset = offset;
    }


    /**
     * Gets the startDate value for this AirlineFlightSchedulesRequest.
     * 
     * @return startDate
     */
    public int getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AirlineFlightSchedulesRequest.
     * 
     * @param startDate
     */
    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this AirlineFlightSchedulesRequest.
     * 
     * @return endDate
     */
    public int getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AirlineFlightSchedulesRequest.
     * 
     * @param endDate
     */
    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the origin value for this AirlineFlightSchedulesRequest.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this AirlineFlightSchedulesRequest.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this AirlineFlightSchedulesRequest.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this AirlineFlightSchedulesRequest.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the airline value for this AirlineFlightSchedulesRequest.
     * 
     * @return airline
     */
    public java.lang.String getAirline() {
        return airline;
    }


    /**
     * Sets the airline value for this AirlineFlightSchedulesRequest.
     * 
     * @param airline
     */
    public void setAirline(java.lang.String airline) {
        this.airline = airline;
    }


    /**
     * Gets the flightno value for this AirlineFlightSchedulesRequest.
     * 
     * @return flightno
     */
    public java.lang.String getFlightno() {
        return flightno;
    }


    /**
     * Sets the flightno value for this AirlineFlightSchedulesRequest.
     * 
     * @param flightno
     */
    public void setFlightno(java.lang.String flightno) {
        this.flightno = flightno;
    }


    /**
     * Gets the howMany value for this AirlineFlightSchedulesRequest.
     * 
     * @return howMany
     */
    public int getHowMany() {
        return howMany;
    }


    /**
     * Sets the howMany value for this AirlineFlightSchedulesRequest.
     * 
     * @param howMany
     */
    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }


    /**
     * Gets the offset value for this AirlineFlightSchedulesRequest.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this AirlineFlightSchedulesRequest.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineFlightSchedulesRequest)) return false;
        AirlineFlightSchedulesRequest other = (AirlineFlightSchedulesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.startDate == other.getStartDate() &&
            this.endDate == other.getEndDate() &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.airline==null && other.getAirline()==null) || 
             (this.airline!=null &&
              this.airline.equals(other.getAirline()))) &&
            ((this.flightno==null && other.getFlightno()==null) || 
             (this.flightno!=null &&
              this.flightno.equals(other.getFlightno()))) &&
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
        _hashCode += getStartDate();
        _hashCode += getEndDate();
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getAirline() != null) {
            _hashCode += getAirline().hashCode();
        }
        if (getFlightno() != null) {
            _hashCode += getFlightno().hashCode();
        }
        _hashCode += getHowMany();
        _hashCode += getOffset();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineFlightSchedulesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("airline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "airline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "flightno"));
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
