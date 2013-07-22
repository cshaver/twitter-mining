/**
 * FlightAlertListing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class FlightAlertListing  implements java.io.Serializable {
    private int num_alerts;

    private com.flightaware.flightxml.soap.FlightXML2.FlightAlertEntry[] alerts;

    public FlightAlertListing() {
    }

    public FlightAlertListing(
           int num_alerts,
           com.flightaware.flightxml.soap.FlightXML2.FlightAlertEntry[] alerts) {
           this.num_alerts = num_alerts;
           this.alerts = alerts;
    }


    /**
     * Gets the num_alerts value for this FlightAlertListing.
     * 
     * @return num_alerts
     */
    public int getNum_alerts() {
        return num_alerts;
    }


    /**
     * Sets the num_alerts value for this FlightAlertListing.
     * 
     * @param num_alerts
     */
    public void setNum_alerts(int num_alerts) {
        this.num_alerts = num_alerts;
    }


    /**
     * Gets the alerts value for this FlightAlertListing.
     * 
     * @return alerts
     */
    public com.flightaware.flightxml.soap.FlightXML2.FlightAlertEntry[] getAlerts() {
        return alerts;
    }


    /**
     * Sets the alerts value for this FlightAlertListing.
     * 
     * @param alerts
     */
    public void setAlerts(com.flightaware.flightxml.soap.FlightXML2.FlightAlertEntry[] alerts) {
        this.alerts = alerts;
    }

    public com.flightaware.flightxml.soap.FlightXML2.FlightAlertEntry getAlerts(int i) {
        return this.alerts[i];
    }

    public void setAlerts(int i, com.flightaware.flightxml.soap.FlightXML2.FlightAlertEntry _value) {
        this.alerts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightAlertListing)) return false;
        FlightAlertListing other = (FlightAlertListing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.num_alerts == other.getNum_alerts() &&
            ((this.alerts==null && other.getAlerts()==null) || 
             (this.alerts!=null &&
              java.util.Arrays.equals(this.alerts, other.getAlerts())));
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
        _hashCode += getNum_alerts();
        if (getAlerts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlerts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlerts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightAlertListing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertListing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_alerts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "num_alerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alerts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "alerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertEntry"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
