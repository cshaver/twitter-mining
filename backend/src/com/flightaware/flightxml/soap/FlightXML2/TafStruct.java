/**
 * TafStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class TafStruct  implements java.io.Serializable {
    private java.lang.String airport;

    private java.lang.String timeString;

    private java.lang.String[] forecast;

    public TafStruct() {
    }

    public TafStruct(
           java.lang.String airport,
           java.lang.String timeString,
           java.lang.String[] forecast) {
           this.airport = airport;
           this.timeString = timeString;
           this.forecast = forecast;
    }


    /**
     * Gets the airport value for this TafStruct.
     * 
     * @return airport
     */
    public java.lang.String getAirport() {
        return airport;
    }


    /**
     * Sets the airport value for this TafStruct.
     * 
     * @param airport
     */
    public void setAirport(java.lang.String airport) {
        this.airport = airport;
    }


    /**
     * Gets the timeString value for this TafStruct.
     * 
     * @return timeString
     */
    public java.lang.String getTimeString() {
        return timeString;
    }


    /**
     * Sets the timeString value for this TafStruct.
     * 
     * @param timeString
     */
    public void setTimeString(java.lang.String timeString) {
        this.timeString = timeString;
    }


    /**
     * Gets the forecast value for this TafStruct.
     * 
     * @return forecast
     */
    public java.lang.String[] getForecast() {
        return forecast;
    }


    /**
     * Sets the forecast value for this TafStruct.
     * 
     * @param forecast
     */
    public void setForecast(java.lang.String[] forecast) {
        this.forecast = forecast;
    }

    public java.lang.String getForecast(int i) {
        return this.forecast[i];
    }

    public void setForecast(int i, java.lang.String _value) {
        this.forecast[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TafStruct)) return false;
        TafStruct other = (TafStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airport==null && other.getAirport()==null) || 
             (this.airport!=null &&
              this.airport.equals(other.getAirport()))) &&
            ((this.timeString==null && other.getTimeString()==null) || 
             (this.timeString!=null &&
              this.timeString.equals(other.getTimeString()))) &&
            ((this.forecast==null && other.getForecast()==null) || 
             (this.forecast!=null &&
              java.util.Arrays.equals(this.forecast, other.getForecast())));
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
        if (getAirport() != null) {
            _hashCode += getAirport().hashCode();
        }
        if (getTimeString() != null) {
            _hashCode += getTimeString().hashCode();
        }
        if (getForecast() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecast());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecast(), i);
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
        new org.apache.axis.description.TypeDesc(TafStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "airport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "timeString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "forecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
