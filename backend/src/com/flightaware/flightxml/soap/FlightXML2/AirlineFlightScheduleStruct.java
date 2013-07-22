/**
 * AirlineFlightScheduleStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AirlineFlightScheduleStruct  implements java.io.Serializable {
    private java.lang.String ident;

    private java.lang.String actual_ident;

    private int departuretime;

    private int arrivaltime;

    private java.lang.String origin;

    private java.lang.String destination;

    private java.lang.String aircrafttype;

    private java.lang.String meal_service;

    private int seats_cabin_first;

    private int seats_cabin_business;

    private int seats_cabin_coach;

    public AirlineFlightScheduleStruct() {
    }

    public AirlineFlightScheduleStruct(
           java.lang.String ident,
           java.lang.String actual_ident,
           int departuretime,
           int arrivaltime,
           java.lang.String origin,
           java.lang.String destination,
           java.lang.String aircrafttype,
           java.lang.String meal_service,
           int seats_cabin_first,
           int seats_cabin_business,
           int seats_cabin_coach) {
           this.ident = ident;
           this.actual_ident = actual_ident;
           this.departuretime = departuretime;
           this.arrivaltime = arrivaltime;
           this.origin = origin;
           this.destination = destination;
           this.aircrafttype = aircrafttype;
           this.meal_service = meal_service;
           this.seats_cabin_first = seats_cabin_first;
           this.seats_cabin_business = seats_cabin_business;
           this.seats_cabin_coach = seats_cabin_coach;
    }


    /**
     * Gets the ident value for this AirlineFlightScheduleStruct.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this AirlineFlightScheduleStruct.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the actual_ident value for this AirlineFlightScheduleStruct.
     * 
     * @return actual_ident
     */
    public java.lang.String getActual_ident() {
        return actual_ident;
    }


    /**
     * Sets the actual_ident value for this AirlineFlightScheduleStruct.
     * 
     * @param actual_ident
     */
    public void setActual_ident(java.lang.String actual_ident) {
        this.actual_ident = actual_ident;
    }


    /**
     * Gets the departuretime value for this AirlineFlightScheduleStruct.
     * 
     * @return departuretime
     */
    public int getDeparturetime() {
        return departuretime;
    }


    /**
     * Sets the departuretime value for this AirlineFlightScheduleStruct.
     * 
     * @param departuretime
     */
    public void setDeparturetime(int departuretime) {
        this.departuretime = departuretime;
    }


    /**
     * Gets the arrivaltime value for this AirlineFlightScheduleStruct.
     * 
     * @return arrivaltime
     */
    public int getArrivaltime() {
        return arrivaltime;
    }


    /**
     * Sets the arrivaltime value for this AirlineFlightScheduleStruct.
     * 
     * @param arrivaltime
     */
    public void setArrivaltime(int arrivaltime) {
        this.arrivaltime = arrivaltime;
    }


    /**
     * Gets the origin value for this AirlineFlightScheduleStruct.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this AirlineFlightScheduleStruct.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this AirlineFlightScheduleStruct.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this AirlineFlightScheduleStruct.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the aircrafttype value for this AirlineFlightScheduleStruct.
     * 
     * @return aircrafttype
     */
    public java.lang.String getAircrafttype() {
        return aircrafttype;
    }


    /**
     * Sets the aircrafttype value for this AirlineFlightScheduleStruct.
     * 
     * @param aircrafttype
     */
    public void setAircrafttype(java.lang.String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }


    /**
     * Gets the meal_service value for this AirlineFlightScheduleStruct.
     * 
     * @return meal_service
     */
    public java.lang.String getMeal_service() {
        return meal_service;
    }


    /**
     * Sets the meal_service value for this AirlineFlightScheduleStruct.
     * 
     * @param meal_service
     */
    public void setMeal_service(java.lang.String meal_service) {
        this.meal_service = meal_service;
    }


    /**
     * Gets the seats_cabin_first value for this AirlineFlightScheduleStruct.
     * 
     * @return seats_cabin_first
     */
    public int getSeats_cabin_first() {
        return seats_cabin_first;
    }


    /**
     * Sets the seats_cabin_first value for this AirlineFlightScheduleStruct.
     * 
     * @param seats_cabin_first
     */
    public void setSeats_cabin_first(int seats_cabin_first) {
        this.seats_cabin_first = seats_cabin_first;
    }


    /**
     * Gets the seats_cabin_business value for this AirlineFlightScheduleStruct.
     * 
     * @return seats_cabin_business
     */
    public int getSeats_cabin_business() {
        return seats_cabin_business;
    }


    /**
     * Sets the seats_cabin_business value for this AirlineFlightScheduleStruct.
     * 
     * @param seats_cabin_business
     */
    public void setSeats_cabin_business(int seats_cabin_business) {
        this.seats_cabin_business = seats_cabin_business;
    }


    /**
     * Gets the seats_cabin_coach value for this AirlineFlightScheduleStruct.
     * 
     * @return seats_cabin_coach
     */
    public int getSeats_cabin_coach() {
        return seats_cabin_coach;
    }


    /**
     * Sets the seats_cabin_coach value for this AirlineFlightScheduleStruct.
     * 
     * @param seats_cabin_coach
     */
    public void setSeats_cabin_coach(int seats_cabin_coach) {
        this.seats_cabin_coach = seats_cabin_coach;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineFlightScheduleStruct)) return false;
        AirlineFlightScheduleStruct other = (AirlineFlightScheduleStruct) obj;
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
            ((this.actual_ident==null && other.getActual_ident()==null) || 
             (this.actual_ident!=null &&
              this.actual_ident.equals(other.getActual_ident()))) &&
            this.departuretime == other.getDeparturetime() &&
            this.arrivaltime == other.getArrivaltime() &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.aircrafttype==null && other.getAircrafttype()==null) || 
             (this.aircrafttype!=null &&
              this.aircrafttype.equals(other.getAircrafttype()))) &&
            ((this.meal_service==null && other.getMeal_service()==null) || 
             (this.meal_service!=null &&
              this.meal_service.equals(other.getMeal_service()))) &&
            this.seats_cabin_first == other.getSeats_cabin_first() &&
            this.seats_cabin_business == other.getSeats_cabin_business() &&
            this.seats_cabin_coach == other.getSeats_cabin_coach();
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
        if (getActual_ident() != null) {
            _hashCode += getActual_ident().hashCode();
        }
        _hashCode += getDeparturetime();
        _hashCode += getArrivaltime();
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getAircrafttype() != null) {
            _hashCode += getAircrafttype().hashCode();
        }
        if (getMeal_service() != null) {
            _hashCode += getMeal_service().hashCode();
        }
        _hashCode += getSeats_cabin_first();
        _hashCode += getSeats_cabin_business();
        _hashCode += getSeats_cabin_coach();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineFlightScheduleStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightScheduleStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "actual_ident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departuretime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "departuretime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivaltime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "arrivaltime"));
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
        elemField.setFieldName("aircrafttype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "aircrafttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meal_service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "meal_service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_cabin_first");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "seats_cabin_first"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_cabin_business");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "seats_cabin_business"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_cabin_coach");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "seats_cabin_coach"));
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
