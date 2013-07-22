/**
 * ArrivalFlightStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class ArrivalFlightStruct  implements java.io.Serializable {
    private java.lang.String ident;

    private java.lang.String aircrafttype;

    private int actualdeparturetime;

    private int actualarrivaltime;

    private java.lang.String origin;

    private java.lang.String destination;

    private java.lang.String originName;

    private java.lang.String originCity;

    private java.lang.String destinationName;

    private java.lang.String destinationCity;

    public ArrivalFlightStruct() {
    }

    public ArrivalFlightStruct(
           java.lang.String ident,
           java.lang.String aircrafttype,
           int actualdeparturetime,
           int actualarrivaltime,
           java.lang.String origin,
           java.lang.String destination,
           java.lang.String originName,
           java.lang.String originCity,
           java.lang.String destinationName,
           java.lang.String destinationCity) {
           this.ident = ident;
           this.aircrafttype = aircrafttype;
           this.actualdeparturetime = actualdeparturetime;
           this.actualarrivaltime = actualarrivaltime;
           this.origin = origin;
           this.destination = destination;
           this.originName = originName;
           this.originCity = originCity;
           this.destinationName = destinationName;
           this.destinationCity = destinationCity;
    }


    /**
     * Gets the ident value for this ArrivalFlightStruct.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this ArrivalFlightStruct.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the aircrafttype value for this ArrivalFlightStruct.
     * 
     * @return aircrafttype
     */
    public java.lang.String getAircrafttype() {
        return aircrafttype;
    }


    /**
     * Sets the aircrafttype value for this ArrivalFlightStruct.
     * 
     * @param aircrafttype
     */
    public void setAircrafttype(java.lang.String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }


    /**
     * Gets the actualdeparturetime value for this ArrivalFlightStruct.
     * 
     * @return actualdeparturetime
     */
    public int getActualdeparturetime() {
        return actualdeparturetime;
    }


    /**
     * Sets the actualdeparturetime value for this ArrivalFlightStruct.
     * 
     * @param actualdeparturetime
     */
    public void setActualdeparturetime(int actualdeparturetime) {
        this.actualdeparturetime = actualdeparturetime;
    }


    /**
     * Gets the actualarrivaltime value for this ArrivalFlightStruct.
     * 
     * @return actualarrivaltime
     */
    public int getActualarrivaltime() {
        return actualarrivaltime;
    }


    /**
     * Sets the actualarrivaltime value for this ArrivalFlightStruct.
     * 
     * @param actualarrivaltime
     */
    public void setActualarrivaltime(int actualarrivaltime) {
        this.actualarrivaltime = actualarrivaltime;
    }


    /**
     * Gets the origin value for this ArrivalFlightStruct.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this ArrivalFlightStruct.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this ArrivalFlightStruct.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this ArrivalFlightStruct.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the originName value for this ArrivalFlightStruct.
     * 
     * @return originName
     */
    public java.lang.String getOriginName() {
        return originName;
    }


    /**
     * Sets the originName value for this ArrivalFlightStruct.
     * 
     * @param originName
     */
    public void setOriginName(java.lang.String originName) {
        this.originName = originName;
    }


    /**
     * Gets the originCity value for this ArrivalFlightStruct.
     * 
     * @return originCity
     */
    public java.lang.String getOriginCity() {
        return originCity;
    }


    /**
     * Sets the originCity value for this ArrivalFlightStruct.
     * 
     * @param originCity
     */
    public void setOriginCity(java.lang.String originCity) {
        this.originCity = originCity;
    }


    /**
     * Gets the destinationName value for this ArrivalFlightStruct.
     * 
     * @return destinationName
     */
    public java.lang.String getDestinationName() {
        return destinationName;
    }


    /**
     * Sets the destinationName value for this ArrivalFlightStruct.
     * 
     * @param destinationName
     */
    public void setDestinationName(java.lang.String destinationName) {
        this.destinationName = destinationName;
    }


    /**
     * Gets the destinationCity value for this ArrivalFlightStruct.
     * 
     * @return destinationCity
     */
    public java.lang.String getDestinationCity() {
        return destinationCity;
    }


    /**
     * Sets the destinationCity value for this ArrivalFlightStruct.
     * 
     * @param destinationCity
     */
    public void setDestinationCity(java.lang.String destinationCity) {
        this.destinationCity = destinationCity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrivalFlightStruct)) return false;
        ArrivalFlightStruct other = (ArrivalFlightStruct) obj;
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
            ((this.aircrafttype==null && other.getAircrafttype()==null) || 
             (this.aircrafttype!=null &&
              this.aircrafttype.equals(other.getAircrafttype()))) &&
            this.actualdeparturetime == other.getActualdeparturetime() &&
            this.actualarrivaltime == other.getActualarrivaltime() &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.originName==null && other.getOriginName()==null) || 
             (this.originName!=null &&
              this.originName.equals(other.getOriginName()))) &&
            ((this.originCity==null && other.getOriginCity()==null) || 
             (this.originCity!=null &&
              this.originCity.equals(other.getOriginCity()))) &&
            ((this.destinationName==null && other.getDestinationName()==null) || 
             (this.destinationName!=null &&
              this.destinationName.equals(other.getDestinationName()))) &&
            ((this.destinationCity==null && other.getDestinationCity()==null) || 
             (this.destinationCity!=null &&
              this.destinationCity.equals(other.getDestinationCity())));
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
        if (getAircrafttype() != null) {
            _hashCode += getAircrafttype().hashCode();
        }
        _hashCode += getActualdeparturetime();
        _hashCode += getActualarrivaltime();
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getOriginName() != null) {
            _hashCode += getOriginName().hashCode();
        }
        if (getOriginCity() != null) {
            _hashCode += getOriginCity().hashCode();
        }
        if (getDestinationName() != null) {
            _hashCode += getDestinationName().hashCode();
        }
        if (getDestinationCity() != null) {
            _hashCode += getDestinationCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrivalFlightStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivalFlightStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ident"));
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
        elemField.setFieldName("actualdeparturetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "actualdeparturetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualarrivaltime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "actualarrivaltime"));
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
        elemField.setFieldName("originName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "originName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "originCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "destinationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "destinationCity"));
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
