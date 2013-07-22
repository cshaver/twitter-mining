/**
 * TrackExStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class TrackExStruct  implements java.io.Serializable {
    private java.lang.String faFlightID;

    private int timestamp;

    private float latitude;

    private float longitude;

    private int groundspeed;

    private int altitude;

    private java.lang.String altitudeStatus;

    private java.lang.String updateType;

    private java.lang.String altitudeChange;

    public TrackExStruct() {
    }

    public TrackExStruct(
           java.lang.String faFlightID,
           int timestamp,
           float latitude,
           float longitude,
           int groundspeed,
           int altitude,
           java.lang.String altitudeStatus,
           java.lang.String updateType,
           java.lang.String altitudeChange) {
           this.faFlightID = faFlightID;
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
     * Gets the faFlightID value for this TrackExStruct.
     * 
     * @return faFlightID
     */
    public java.lang.String getFaFlightID() {
        return faFlightID;
    }


    /**
     * Sets the faFlightID value for this TrackExStruct.
     * 
     * @param faFlightID
     */
    public void setFaFlightID(java.lang.String faFlightID) {
        this.faFlightID = faFlightID;
    }


    /**
     * Gets the timestamp value for this TrackExStruct.
     * 
     * @return timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TrackExStruct.
     * 
     * @param timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the latitude value for this TrackExStruct.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this TrackExStruct.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this TrackExStruct.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this TrackExStruct.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the groundspeed value for this TrackExStruct.
     * 
     * @return groundspeed
     */
    public int getGroundspeed() {
        return groundspeed;
    }


    /**
     * Sets the groundspeed value for this TrackExStruct.
     * 
     * @param groundspeed
     */
    public void setGroundspeed(int groundspeed) {
        this.groundspeed = groundspeed;
    }


    /**
     * Gets the altitude value for this TrackExStruct.
     * 
     * @return altitude
     */
    public int getAltitude() {
        return altitude;
    }


    /**
     * Sets the altitude value for this TrackExStruct.
     * 
     * @param altitude
     */
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }


    /**
     * Gets the altitudeStatus value for this TrackExStruct.
     * 
     * @return altitudeStatus
     */
    public java.lang.String getAltitudeStatus() {
        return altitudeStatus;
    }


    /**
     * Sets the altitudeStatus value for this TrackExStruct.
     * 
     * @param altitudeStatus
     */
    public void setAltitudeStatus(java.lang.String altitudeStatus) {
        this.altitudeStatus = altitudeStatus;
    }


    /**
     * Gets the updateType value for this TrackExStruct.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this TrackExStruct.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }


    /**
     * Gets the altitudeChange value for this TrackExStruct.
     * 
     * @return altitudeChange
     */
    public java.lang.String getAltitudeChange() {
        return altitudeChange;
    }


    /**
     * Sets the altitudeChange value for this TrackExStruct.
     * 
     * @param altitudeChange
     */
    public void setAltitudeChange(java.lang.String altitudeChange) {
        this.altitudeChange = altitudeChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackExStruct)) return false;
        TrackExStruct other = (TrackExStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faFlightID==null && other.getFaFlightID()==null) || 
             (this.faFlightID!=null &&
              this.faFlightID.equals(other.getFaFlightID()))) &&
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
        if (getFaFlightID() != null) {
            _hashCode += getFaFlightID().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(TrackExStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TrackExStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faFlightID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "faFlightID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
