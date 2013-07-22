/**
 * FlightAlertEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class FlightAlertEntry  implements java.io.Serializable {
    private int alert_id;

    private boolean enabled;

    private java.lang.String description;

    private java.lang.String type;

    private java.lang.String ident;

    private java.lang.String user_ident;

    private java.lang.String aircrafttype;

    private java.lang.String origin;

    private java.lang.String destination;

    private int date_start;

    private int date_end;

    private com.flightaware.flightxml.soap.FlightXML2.FlightAlertChannel[] channels;

    private int alert_created;

    private int alert_changed;

    public FlightAlertEntry() {
    }

    public FlightAlertEntry(
           int alert_id,
           boolean enabled,
           java.lang.String description,
           java.lang.String type,
           java.lang.String ident,
           java.lang.String user_ident,
           java.lang.String aircrafttype,
           java.lang.String origin,
           java.lang.String destination,
           int date_start,
           int date_end,
           com.flightaware.flightxml.soap.FlightXML2.FlightAlertChannel[] channels,
           int alert_created,
           int alert_changed) {
           this.alert_id = alert_id;
           this.enabled = enabled;
           this.description = description;
           this.type = type;
           this.ident = ident;
           this.user_ident = user_ident;
           this.aircrafttype = aircrafttype;
           this.origin = origin;
           this.destination = destination;
           this.date_start = date_start;
           this.date_end = date_end;
           this.channels = channels;
           this.alert_created = alert_created;
           this.alert_changed = alert_changed;
    }


    /**
     * Gets the alert_id value for this FlightAlertEntry.
     * 
     * @return alert_id
     */
    public int getAlert_id() {
        return alert_id;
    }


    /**
     * Sets the alert_id value for this FlightAlertEntry.
     * 
     * @param alert_id
     */
    public void setAlert_id(int alert_id) {
        this.alert_id = alert_id;
    }


    /**
     * Gets the enabled value for this FlightAlertEntry.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this FlightAlertEntry.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the description value for this FlightAlertEntry.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FlightAlertEntry.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the type value for this FlightAlertEntry.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this FlightAlertEntry.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the ident value for this FlightAlertEntry.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this FlightAlertEntry.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the user_ident value for this FlightAlertEntry.
     * 
     * @return user_ident
     */
    public java.lang.String getUser_ident() {
        return user_ident;
    }


    /**
     * Sets the user_ident value for this FlightAlertEntry.
     * 
     * @param user_ident
     */
    public void setUser_ident(java.lang.String user_ident) {
        this.user_ident = user_ident;
    }


    /**
     * Gets the aircrafttype value for this FlightAlertEntry.
     * 
     * @return aircrafttype
     */
    public java.lang.String getAircrafttype() {
        return aircrafttype;
    }


    /**
     * Sets the aircrafttype value for this FlightAlertEntry.
     * 
     * @param aircrafttype
     */
    public void setAircrafttype(java.lang.String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }


    /**
     * Gets the origin value for this FlightAlertEntry.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this FlightAlertEntry.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this FlightAlertEntry.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this FlightAlertEntry.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the date_start value for this FlightAlertEntry.
     * 
     * @return date_start
     */
    public int getDate_start() {
        return date_start;
    }


    /**
     * Sets the date_start value for this FlightAlertEntry.
     * 
     * @param date_start
     */
    public void setDate_start(int date_start) {
        this.date_start = date_start;
    }


    /**
     * Gets the date_end value for this FlightAlertEntry.
     * 
     * @return date_end
     */
    public int getDate_end() {
        return date_end;
    }


    /**
     * Sets the date_end value for this FlightAlertEntry.
     * 
     * @param date_end
     */
    public void setDate_end(int date_end) {
        this.date_end = date_end;
    }


    /**
     * Gets the channels value for this FlightAlertEntry.
     * 
     * @return channels
     */
    public com.flightaware.flightxml.soap.FlightXML2.FlightAlertChannel[] getChannels() {
        return channels;
    }


    /**
     * Sets the channels value for this FlightAlertEntry.
     * 
     * @param channels
     */
    public void setChannels(com.flightaware.flightxml.soap.FlightXML2.FlightAlertChannel[] channels) {
        this.channels = channels;
    }

    public com.flightaware.flightxml.soap.FlightXML2.FlightAlertChannel getChannels(int i) {
        return this.channels[i];
    }

    public void setChannels(int i, com.flightaware.flightxml.soap.FlightXML2.FlightAlertChannel _value) {
        this.channels[i] = _value;
    }


    /**
     * Gets the alert_created value for this FlightAlertEntry.
     * 
     * @return alert_created
     */
    public int getAlert_created() {
        return alert_created;
    }


    /**
     * Sets the alert_created value for this FlightAlertEntry.
     * 
     * @param alert_created
     */
    public void setAlert_created(int alert_created) {
        this.alert_created = alert_created;
    }


    /**
     * Gets the alert_changed value for this FlightAlertEntry.
     * 
     * @return alert_changed
     */
    public int getAlert_changed() {
        return alert_changed;
    }


    /**
     * Sets the alert_changed value for this FlightAlertEntry.
     * 
     * @param alert_changed
     */
    public void setAlert_changed(int alert_changed) {
        this.alert_changed = alert_changed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightAlertEntry)) return false;
        FlightAlertEntry other = (FlightAlertEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alert_id == other.getAlert_id() &&
            this.enabled == other.isEnabled() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.ident==null && other.getIdent()==null) || 
             (this.ident!=null &&
              this.ident.equals(other.getIdent()))) &&
            ((this.user_ident==null && other.getUser_ident()==null) || 
             (this.user_ident!=null &&
              this.user_ident.equals(other.getUser_ident()))) &&
            ((this.aircrafttype==null && other.getAircrafttype()==null) || 
             (this.aircrafttype!=null &&
              this.aircrafttype.equals(other.getAircrafttype()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.date_start == other.getDate_start() &&
            this.date_end == other.getDate_end() &&
            ((this.channels==null && other.getChannels()==null) || 
             (this.channels!=null &&
              java.util.Arrays.equals(this.channels, other.getChannels()))) &&
            this.alert_created == other.getAlert_created() &&
            this.alert_changed == other.getAlert_changed();
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
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIdent() != null) {
            _hashCode += getIdent().hashCode();
        }
        if (getUser_ident() != null) {
            _hashCode += getUser_ident().hashCode();
        }
        if (getAircrafttype() != null) {
            _hashCode += getAircrafttype().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += getDate_start();
        _hashCode += getDate_end();
        if (getChannels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getAlert_created();
        _hashCode += getAlert_changed();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightAlertEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "alert_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "user_ident"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertChannel"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert_created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "alert_created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert_changed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "alert_changed"));
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
