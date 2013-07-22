/**
 * FlightAlertChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class FlightAlertChannel  implements java.io.Serializable {
    private int channel_id;

    private java.lang.String channel_name;

    private java.lang.String mask_summary;

    private boolean e_filed;

    private boolean e_departure;

    private boolean e_arrival;

    private boolean e_diverted;

    private boolean e_cancelled;

    private java.lang.String target_address;

    public FlightAlertChannel() {
    }

    public FlightAlertChannel(
           int channel_id,
           java.lang.String channel_name,
           java.lang.String mask_summary,
           boolean e_filed,
           boolean e_departure,
           boolean e_arrival,
           boolean e_diverted,
           boolean e_cancelled,
           java.lang.String target_address) {
           this.channel_id = channel_id;
           this.channel_name = channel_name;
           this.mask_summary = mask_summary;
           this.e_filed = e_filed;
           this.e_departure = e_departure;
           this.e_arrival = e_arrival;
           this.e_diverted = e_diverted;
           this.e_cancelled = e_cancelled;
           this.target_address = target_address;
    }


    /**
     * Gets the channel_id value for this FlightAlertChannel.
     * 
     * @return channel_id
     */
    public int getChannel_id() {
        return channel_id;
    }


    /**
     * Sets the channel_id value for this FlightAlertChannel.
     * 
     * @param channel_id
     */
    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }


    /**
     * Gets the channel_name value for this FlightAlertChannel.
     * 
     * @return channel_name
     */
    public java.lang.String getChannel_name() {
        return channel_name;
    }


    /**
     * Sets the channel_name value for this FlightAlertChannel.
     * 
     * @param channel_name
     */
    public void setChannel_name(java.lang.String channel_name) {
        this.channel_name = channel_name;
    }


    /**
     * Gets the mask_summary value for this FlightAlertChannel.
     * 
     * @return mask_summary
     */
    public java.lang.String getMask_summary() {
        return mask_summary;
    }


    /**
     * Sets the mask_summary value for this FlightAlertChannel.
     * 
     * @param mask_summary
     */
    public void setMask_summary(java.lang.String mask_summary) {
        this.mask_summary = mask_summary;
    }


    /**
     * Gets the e_filed value for this FlightAlertChannel.
     * 
     * @return e_filed
     */
    public boolean isE_filed() {
        return e_filed;
    }


    /**
     * Sets the e_filed value for this FlightAlertChannel.
     * 
     * @param e_filed
     */
    public void setE_filed(boolean e_filed) {
        this.e_filed = e_filed;
    }


    /**
     * Gets the e_departure value for this FlightAlertChannel.
     * 
     * @return e_departure
     */
    public boolean isE_departure() {
        return e_departure;
    }


    /**
     * Sets the e_departure value for this FlightAlertChannel.
     * 
     * @param e_departure
     */
    public void setE_departure(boolean e_departure) {
        this.e_departure = e_departure;
    }


    /**
     * Gets the e_arrival value for this FlightAlertChannel.
     * 
     * @return e_arrival
     */
    public boolean isE_arrival() {
        return e_arrival;
    }


    /**
     * Sets the e_arrival value for this FlightAlertChannel.
     * 
     * @param e_arrival
     */
    public void setE_arrival(boolean e_arrival) {
        this.e_arrival = e_arrival;
    }


    /**
     * Gets the e_diverted value for this FlightAlertChannel.
     * 
     * @return e_diverted
     */
    public boolean isE_diverted() {
        return e_diverted;
    }


    /**
     * Sets the e_diverted value for this FlightAlertChannel.
     * 
     * @param e_diverted
     */
    public void setE_diverted(boolean e_diverted) {
        this.e_diverted = e_diverted;
    }


    /**
     * Gets the e_cancelled value for this FlightAlertChannel.
     * 
     * @return e_cancelled
     */
    public boolean isE_cancelled() {
        return e_cancelled;
    }


    /**
     * Sets the e_cancelled value for this FlightAlertChannel.
     * 
     * @param e_cancelled
     */
    public void setE_cancelled(boolean e_cancelled) {
        this.e_cancelled = e_cancelled;
    }


    /**
     * Gets the target_address value for this FlightAlertChannel.
     * 
     * @return target_address
     */
    public java.lang.String getTarget_address() {
        return target_address;
    }


    /**
     * Sets the target_address value for this FlightAlertChannel.
     * 
     * @param target_address
     */
    public void setTarget_address(java.lang.String target_address) {
        this.target_address = target_address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightAlertChannel)) return false;
        FlightAlertChannel other = (FlightAlertChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.channel_id == other.getChannel_id() &&
            ((this.channel_name==null && other.getChannel_name()==null) || 
             (this.channel_name!=null &&
              this.channel_name.equals(other.getChannel_name()))) &&
            ((this.mask_summary==null && other.getMask_summary()==null) || 
             (this.mask_summary!=null &&
              this.mask_summary.equals(other.getMask_summary()))) &&
            this.e_filed == other.isE_filed() &&
            this.e_departure == other.isE_departure() &&
            this.e_arrival == other.isE_arrival() &&
            this.e_diverted == other.isE_diverted() &&
            this.e_cancelled == other.isE_cancelled() &&
            ((this.target_address==null && other.getTarget_address()==null) || 
             (this.target_address!=null &&
              this.target_address.equals(other.getTarget_address())));
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
        _hashCode += getChannel_id();
        if (getChannel_name() != null) {
            _hashCode += getChannel_name().hashCode();
        }
        if (getMask_summary() != null) {
            _hashCode += getMask_summary().hashCode();
        }
        _hashCode += (isE_filed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isE_departure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isE_arrival() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isE_diverted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isE_cancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTarget_address() != null) {
            _hashCode += getTarget_address().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightAlertChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "channel_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "channel_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask_summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "mask_summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_filed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "e_filed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_departure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "e_departure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_arrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "e_arrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_diverted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "e_diverted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "e_cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "target_address"));
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
