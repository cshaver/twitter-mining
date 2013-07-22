/**
 * CountAirportOperationsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class CountAirportOperationsStruct  implements java.io.Serializable {
    private int enroute;

    private int departed;

    private int scheduled_departures;

    private int scheduled_arrivals;

    public CountAirportOperationsStruct() {
    }

    public CountAirportOperationsStruct(
           int enroute,
           int departed,
           int scheduled_departures,
           int scheduled_arrivals) {
           this.enroute = enroute;
           this.departed = departed;
           this.scheduled_departures = scheduled_departures;
           this.scheduled_arrivals = scheduled_arrivals;
    }


    /**
     * Gets the enroute value for this CountAirportOperationsStruct.
     * 
     * @return enroute
     */
    public int getEnroute() {
        return enroute;
    }


    /**
     * Sets the enroute value for this CountAirportOperationsStruct.
     * 
     * @param enroute
     */
    public void setEnroute(int enroute) {
        this.enroute = enroute;
    }


    /**
     * Gets the departed value for this CountAirportOperationsStruct.
     * 
     * @return departed
     */
    public int getDeparted() {
        return departed;
    }


    /**
     * Sets the departed value for this CountAirportOperationsStruct.
     * 
     * @param departed
     */
    public void setDeparted(int departed) {
        this.departed = departed;
    }


    /**
     * Gets the scheduled_departures value for this CountAirportOperationsStruct.
     * 
     * @return scheduled_departures
     */
    public int getScheduled_departures() {
        return scheduled_departures;
    }


    /**
     * Sets the scheduled_departures value for this CountAirportOperationsStruct.
     * 
     * @param scheduled_departures
     */
    public void setScheduled_departures(int scheduled_departures) {
        this.scheduled_departures = scheduled_departures;
    }


    /**
     * Gets the scheduled_arrivals value for this CountAirportOperationsStruct.
     * 
     * @return scheduled_arrivals
     */
    public int getScheduled_arrivals() {
        return scheduled_arrivals;
    }


    /**
     * Sets the scheduled_arrivals value for this CountAirportOperationsStruct.
     * 
     * @param scheduled_arrivals
     */
    public void setScheduled_arrivals(int scheduled_arrivals) {
        this.scheduled_arrivals = scheduled_arrivals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountAirportOperationsStruct)) return false;
        CountAirportOperationsStruct other = (CountAirportOperationsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enroute == other.getEnroute() &&
            this.departed == other.getDeparted() &&
            this.scheduled_departures == other.getScheduled_departures() &&
            this.scheduled_arrivals == other.getScheduled_arrivals();
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
        _hashCode += getEnroute();
        _hashCode += getDeparted();
        _hashCode += getScheduled_departures();
        _hashCode += getScheduled_arrivals();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountAirportOperationsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enroute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "enroute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "departed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduled_departures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "scheduled_departures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduled_arrivals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "scheduled_arrivals"));
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
