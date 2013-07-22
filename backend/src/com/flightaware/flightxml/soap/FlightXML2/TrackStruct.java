/**
 * TrackStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class TrackStruct  implements java.io.Serializable {
    private int timestamp;

    private float latitude;

    private float longitude;

    private int groundspeed;

    private int altitude;

    private java.lang.String altitudeStatus;

    private java.lang.String updateType;

    private java.lang.String altitudeChange;

    public TrackStruct() {
    }

    public TrackStruct(
           int timestamp,
           float latitude,
           float longitude,
           int groundspeed,
           int altitude,
           java.lang.String altitudeStatus,
           java.lang.String updateType,
           java.lang.String altitudeChange) {
           this.timestamp = timestamp;
           this.latitude = latitude;
           this.longitude = longitude;
           this.groundspeed = groundspeed;
           this.altitude = altitude;
           this.altitudeStatus = altitudeStatus;
           this.updateType = updateType;
           this.altitudeChange = altitudeChange;
    }


    /**
     * Gets the timestamp value for this TrackStruct.
     * 
     * @return timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TrackStruct.
     * 
     * @param timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the latitude value for this TrackStruct.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this TrackStruct.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this TrackStruct.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this TrackStruct.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the groundspeed value for this TrackStruct.
     * 
     * @return groundspeed
     */
    public int getGroundspeed() {
        return groundspeed;
    }


    /**
     * Sets the groundspeed value for this TrackStruct.
     * 
     * @param groundspeed
     */
    public void setGroundspeed(int groundspeed) {
        this.groundspeed = groundspeed;
    }


    /**
     * Gets the altitude value for this TrackStruct.
     * 
     * @return altitude
     */
    public int getAltitude() {
        return altitude;
    }


    /**
     * Sets the altitude value for this TrackStruct.
     * 
     * @param altitude
     */
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }


    /**
     * Gets the altitudeStatus value for this TrackStruct.
     * 
     * @return altitudeStatus
     */
    public java.lang.String getAltitudeStatus() {
        return altitudeStatus;
    }


    /**
     * Sets the altitudeStatus value for this TrackStruct.
     * 
     * @param altitudeStatus
     */
    public void setAltitudeStatus(java.lang.String altitudeStatus) {
        this.altitudeStatus = altitudeStatus;
    }


    /**
     * Gets the updateType value for this TrackStruct.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this TrackStruct.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }


    /**
     * Gets the altitudeChange value for this TrackStruct.
     * 
     * @return altitudeChange
     */
    public java.lang.String getAltitudeChange() {
        return altitudeChange;
    }


    /**
     * Sets the altitudeChange value for this TrackStruct.
     * 
     * @param altitudeChange
     */
    public void setAltitudeChange(java.lang.String altitudeChange) {
        this.altitudeChange = altitudeChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackStruct)) return false;
        TrackStruct other = (TrackStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.timestamp == other.getTimestamp() &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            this.groundspeed == other.getGroundspeed() &&
            this.altitude == other.getAltitude() &&
            ((this.altitudeStatus==null && other.getAltitudeStatus()==null) || 
             (this.altitudeStatus!=null &&
              this.altitudeStatus.equals(other.getAltitudeStatus()))) &&
            ((this.updateType==null && other.getUpdateType()==null) || 
             (this.updateType!=null &&
              this.updateType.equals(other.getUpdateType()))) &&
            ((this.altitudeChange==null && other.getAltitudeChange()==null) || 
             (this.altitudeChange!=null &&
              this.altitudeChange.equals(other.getAltitudeChange())));
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
        _hashCode += getTimestamp();
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        _hashCode += getGroundspeed();
        _hashCode += getAltitude();
        if (getAltitudeStatus() != null) {
            _hashCode += getAltitudeStatus().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        if (getAltitudeChange() != null) {
            _hashCode += getAltitudeChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TrackStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groundspeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "groundspeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "altitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altitudeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "altitudeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "updateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altitudeChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "altitudeChange"));
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
