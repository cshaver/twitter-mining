/**
 * SetAlertRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class SetAlertRequest  implements java.io.Serializable {
    private int alert_id;

    private java.lang.String ident;

    private java.lang.String origin;

    private java.lang.String destination;

    private java.lang.String aircrafttype;

    private int date_start;

    private int date_end;

    private java.lang.String channels;

    private boolean enabled;

    private int max_weekly;

    public SetAlertRequest() {
    }

    public SetAlertRequest(
           int alert_id,
           java.lang.String ident,
           java.lang.String origin,
           java.lang.String destination,
           java.lang.String aircrafttype,
           int date_start,
           int date_end,
           java.lang.String channels,
           boolean enabled,
           int max_weekly) {
           this.alert_id = alert_id;
           this.ident = ident;
           this.origin = origin;
           this.destination = destination;
           this.aircrafttype = aircrafttype;
           this.date_start = date_start;
           this.date_end = date_end;
           this.channels = channels;
           this.enabled = enabled;
           this.max_weekly = max_weekly;
    }


    /**
     * Gets the alert_id value for this SetAlertRequest.
     * 
     * @return alert_id
     */
    public int getAlert_id() {
        return alert_id;
    }


    /**
     * Sets the alert_id value for this SetAlertRequest.
     * 
     * @param alert_id
     */
    public void setAlert_id(int alert_id) {
        this.alert_id = alert_id;
    }


    /**
     * Gets the ident value for this SetAlertRequest.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this SetAlertRequest.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the origin value for this SetAlertRequest.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SetAlertRequest.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this SetAlertRequest.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this SetAlertRequest.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the aircrafttype value for this SetAlertRequest.
     * 
     * @return aircrafttype
     */
    public java.lang.String getAircrafttype() {
        return aircrafttype;
    }


    /**
     * Sets the aircrafttype value for this SetAlertRequest.
     * 
     * @param aircrafttype
     */
    public void setAircrafttype(java.lang.String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }


    /**
     * Gets the date_start value for this SetAlertRequest.
     * 
     * @return date_start
     */
    public int getDate_start() {
        return date_start;
    }


    /**
     * Sets the date_start value for this SetAlertRequest.
     * 
     * @param date_start
     */
    public void setDate_start(int date_start) {
        this.date_start = date_start;
    }


    /**
     * Gets the date_end value for this SetAlertRequest.
     * 
     * @return date_end
     */
    public int getDate_end() {
        return date_end;
    }


    /**
     * Sets the date_end value for this SetAlertRequest.
     * 
     * @param date_end
     */
    public void setDate_end(int date_end) {
        this.date_end = date_end;
    }


    /**
     * Gets the channels value for this SetAlertRequest.
     * 
     * @return channels
     */
    public java.lang.String getChannels() {
        return channels;
    }


    /**
     * Sets the channels value for this SetAlertRequest.
     * 
     * @param channels
     */
    public void setChannels(java.lang.String channels) {
        this.channels = channels;
    }


    /**
     * Gets the enabled value for this SetAlertRequest.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this SetAlertRequest.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the max_weekly value for this SetAlertRequest.
     * 
     * @return max_weekly
     */
    public int getMax_weekly() {
        return max_weekly;
    }


    /**
     * Sets the max_weekly value for this SetAlertRequest.
     * 
     * @param max_weekly
     */
    public void setMax_weekly(int max_weekly) {
        this.max_weekly = max_weekly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetAlertRequest)) return false;
        SetAlertRequest other = (SetAlertRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alert_id == other.getAlert_id() &&
            ((this.ident==null && other.getIdent()==null) || 
             (this.ident!=null &&
              this.ident.equals(other.getIdent()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.aircrafttype==null && other.getAircrafttype()==null) || 
             (this.aircrafttype!=null &&
              this.aircrafttype.equals(other.getAircrafttype()))) &&
            this.date_start == other.getDate_start() &&
            this.date_end == other.getDate_end() &&
            ((this.channels==null && other.getChannels()==null) || 
             (this.channels!=null &&
              this.channels.equals(other.getChannels()))) &&
            this.enabled == other.isEnabled() &&
            this.max_weekly == other.getMax_weekly();
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
        _hashCode += getAlert_id();
        if (getIdent() != null) {
            _hashCode += getIdent().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getAircrafttype() != null) {
            _hashCode += getAircrafttype().hashCode();
        }
        _hashCode += getDate_start();
        _hashCode += getDate_end();
        if (getChannels() != null) {
            _hashCode += getChannels().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMax_weekly();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetAlertRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetAlertRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "alert_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("date_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "date_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "date_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "channels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_weekly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "max_weekly"));
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
