/**
 * MetarStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class MetarStruct  implements java.io.Serializable {
    private java.lang.String airport;

    private int time;

    private java.lang.String cloud_friendly;

    private int cloud_altitude;

    private java.lang.String cloud_type;

    private java.lang.String conditions;

    private float pressure;

    private int temp_air;

    private int temp_dewpoint;

    private int temp_relhum;

    private float visibility;

    private java.lang.String wind_friendly;

    private int wind_direction;

    private int wind_speed;

    private int wind_speed_gust;

    private java.lang.String raw_data;

    public MetarStruct() {
    }

    public MetarStruct(
           java.lang.String airport,
           int time,
           java.lang.String cloud_friendly,
           int cloud_altitude,
           java.lang.String cloud_type,
           java.lang.String conditions,
           float pressure,
           int temp_air,
           int temp_dewpoint,
           int temp_relhum,
           float visibility,
           java.lang.String wind_friendly,
           int wind_direction,
           int wind_speed,
           int wind_speed_gust,
           java.lang.String raw_data) {
           this.airport = airport;
           this.time = time;
           this.cloud_friendly = cloud_friendly;
           this.cloud_altitude = cloud_altitude;
           this.cloud_type = cloud_type;
           this.conditions = conditions;
           this.pressure = pressure;
           this.temp_air = temp_air;
           this.temp_dewpoint = temp_dewpoint;
           this.temp_relhum = temp_relhum;
           this.visibility = visibility;
           this.wind_friendly = wind_friendly;
           this.wind_direction = wind_direction;
           this.wind_speed = wind_speed;
           this.wind_speed_gust = wind_speed_gust;
           this.raw_data = raw_data;
    }


    /**
     * Gets the airport value for this MetarStruct.
     * 
     * @return airport
     */
    public java.lang.String getAirport() {
        return airport;
    }


    /**
     * Sets the airport value for this MetarStruct.
     * 
     * @param airport
     */
    public void setAirport(java.lang.String airport) {
        this.airport = airport;
    }


    /**
     * Gets the time value for this MetarStruct.
     * 
     * @return time
     */
    public int getTime() {
        return time;
    }


    /**
     * Sets the time value for this MetarStruct.
     * 
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }


    /**
     * Gets the cloud_friendly value for this MetarStruct.
     * 
     * @return cloud_friendly
     */
    public java.lang.String getCloud_friendly() {
        return cloud_friendly;
    }


    /**
     * Sets the cloud_friendly value for this MetarStruct.
     * 
     * @param cloud_friendly
     */
    public void setCloud_friendly(java.lang.String cloud_friendly) {
        this.cloud_friendly = cloud_friendly;
    }


    /**
     * Gets the cloud_altitude value for this MetarStruct.
     * 
     * @return cloud_altitude
     */
    public int getCloud_altitude() {
        return cloud_altitude;
    }


    /**
     * Sets the cloud_altitude value for this MetarStruct.
     * 
     * @param cloud_altitude
     */
    public void setCloud_altitude(int cloud_altitude) {
        this.cloud_altitude = cloud_altitude;
    }


    /**
     * Gets the cloud_type value for this MetarStruct.
     * 
     * @return cloud_type
     */
    public java.lang.String getCloud_type() {
        return cloud_type;
    }


    /**
     * Sets the cloud_type value for this MetarStruct.
     * 
     * @param cloud_type
     */
    public void setCloud_type(java.lang.String cloud_type) {
        this.cloud_type = cloud_type;
    }


    /**
     * Gets the conditions value for this MetarStruct.
     * 
     * @return conditions
     */
    public java.lang.String getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this MetarStruct.
     * 
     * @param conditions
     */
    public void setConditions(java.lang.String conditions) {
        this.conditions = conditions;
    }


    /**
     * Gets the pressure value for this MetarStruct.
     * 
     * @return pressure
     */
    public float getPressure() {
        return pressure;
    }


    /**
     * Sets the pressure value for this MetarStruct.
     * 
     * @param pressure
     */
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }


    /**
     * Gets the temp_air value for this MetarStruct.
     * 
     * @return temp_air
     */
    public int getTemp_air() {
        return temp_air;
    }


    /**
     * Sets the temp_air value for this MetarStruct.
     * 
     * @param temp_air
     */
    public void setTemp_air(int temp_air) {
        this.temp_air = temp_air;
    }


    /**
     * Gets the temp_dewpoint value for this MetarStruct.
     * 
     * @return temp_dewpoint
     */
    public int getTemp_dewpoint() {
        return temp_dewpoint;
    }


    /**
     * Sets the temp_dewpoint value for this MetarStruct.
     * 
     * @param temp_dewpoint
     */
    public void setTemp_dewpoint(int temp_dewpoint) {
        this.temp_dewpoint = temp_dewpoint;
    }


    /**
     * Gets the temp_relhum value for this MetarStruct.
     * 
     * @return temp_relhum
     */
    public int getTemp_relhum() {
        return temp_relhum;
    }


    /**
     * Sets the temp_relhum value for this MetarStruct.
     * 
     * @param temp_relhum
     */
    public void setTemp_relhum(int temp_relhum) {
        this.temp_relhum = temp_relhum;
    }


    /**
     * Gets the visibility value for this MetarStruct.
     * 
     * @return visibility
     */
    public float getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this MetarStruct.
     * 
     * @param visibility
     */
    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }


    /**
     * Gets the wind_friendly value for this MetarStruct.
     * 
     * @return wind_friendly
     */
    public java.lang.String getWind_friendly() {
        return wind_friendly;
    }


    /**
     * Sets the wind_friendly value for this MetarStruct.
     * 
     * @param wind_friendly
     */
    public void setWind_friendly(java.lang.String wind_friendly) {
        this.wind_friendly = wind_friendly;
    }


    /**
     * Gets the wind_direction value for this MetarStruct.
     * 
     * @return wind_direction
     */
    public int getWind_direction() {
        return wind_direction;
    }


    /**
     * Sets the wind_direction value for this MetarStruct.
     * 
     * @param wind_direction
     */
    public void setWind_direction(int wind_direction) {
        this.wind_direction = wind_direction;
    }


    /**
     * Gets the wind_speed value for this MetarStruct.
     * 
     * @return wind_speed
     */
    public int getWind_speed() {
        return wind_speed;
    }


    /**
     * Sets the wind_speed value for this MetarStruct.
     * 
     * @param wind_speed
     */
    public void setWind_speed(int wind_speed) {
        this.wind_speed = wind_speed;
    }


    /**
     * Gets the wind_speed_gust value for this MetarStruct.
     * 
     * @return wind_speed_gust
     */
    public int getWind_speed_gust() {
        return wind_speed_gust;
    }


    /**
     * Sets the wind_speed_gust value for this MetarStruct.
     * 
     * @param wind_speed_gust
     */
    public void setWind_speed_gust(int wind_speed_gust) {
        this.wind_speed_gust = wind_speed_gust;
    }


    /**
     * Gets the raw_data value for this MetarStruct.
     * 
     * @return raw_data
     */
    public java.lang.String getRaw_data() {
        return raw_data;
    }


    /**
     * Sets the raw_data value for this MetarStruct.
     * 
     * @param raw_data
     */
    public void setRaw_data(java.lang.String raw_data) {
        this.raw_data = raw_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetarStruct)) return false;
        MetarStruct other = (MetarStruct) obj;
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
            this.time == other.getTime() &&
            ((this.cloud_friendly==null && other.getCloud_friendly()==null) || 
             (this.cloud_friendly!=null &&
              this.cloud_friendly.equals(other.getCloud_friendly()))) &&
            this.cloud_altitude == other.getCloud_altitude() &&
            ((this.cloud_type==null && other.getCloud_type()==null) || 
             (this.cloud_type!=null &&
              this.cloud_type.equals(other.getCloud_type()))) &&
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              this.conditions.equals(other.getConditions()))) &&
            this.pressure == other.getPressure() &&
            this.temp_air == other.getTemp_air() &&
            this.temp_dewpoint == other.getTemp_dewpoint() &&
            this.temp_relhum == other.getTemp_relhum() &&
            this.visibility == other.getVisibility() &&
            ((this.wind_friendly==null && other.getWind_friendly()==null) || 
             (this.wind_friendly!=null &&
              this.wind_friendly.equals(other.getWind_friendly()))) &&
            this.wind_direction == other.getWind_direction() &&
            this.wind_speed == other.getWind_speed() &&
            this.wind_speed_gust == other.getWind_speed_gust() &&
            ((this.raw_data==null && other.getRaw_data()==null) || 
             (this.raw_data!=null &&
              this.raw_data.equals(other.getRaw_data())));
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
        _hashCode += getTime();
        if (getCloud_friendly() != null) {
            _hashCode += getCloud_friendly().hashCode();
        }
        _hashCode += getCloud_altitude();
        if (getCloud_type() != null) {
            _hashCode += getCloud_type().hashCode();
        }
        if (getConditions() != null) {
            _hashCode += getConditions().hashCode();
        }
        _hashCode += new Float(getPressure()).hashCode();
        _hashCode += getTemp_air();
        _hashCode += getTemp_dewpoint();
        _hashCode += getTemp_relhum();
        _hashCode += new Float(getVisibility()).hashCode();
        if (getWind_friendly() != null) {
            _hashCode += getWind_friendly().hashCode();
        }
        _hashCode += getWind_direction();
        _hashCode += getWind_speed();
        _hashCode += getWind_speed_gust();
        if (getRaw_data() != null) {
            _hashCode += getRaw_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetarStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "airport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloud_friendly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "cloud_friendly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloud_altitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "cloud_altitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloud_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "cloud_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pressure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "pressure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temp_air");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "temp_air"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temp_dewpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "temp_dewpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temp_relhum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "temp_relhum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "visibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wind_friendly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "wind_friendly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wind_direction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "wind_direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wind_speed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "wind_speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wind_speed_gust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "wind_speed_gust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raw_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "raw_data"));
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
