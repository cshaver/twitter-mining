/**
 * InFlightAircraftStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class InFlightAircraftStruct  implements java.io.Serializable {
    private java.lang.String faFlightID;

    private java.lang.String ident;

    private java.lang.String prefix;

    private java.lang.String type;

    private java.lang.String suffix;

    private java.lang.String origin;

    private java.lang.String destination;

    private java.lang.String timeout;

    private int timestamp;

    private int departureTime;

    private int firstPositionTime;

    private int arrivalTime;

    private float longitude;

    private float latitude;

    private float lowLongitude;

    private float lowLatitude;

    private float highLongitude;

    private float highLatitude;

    private int groundspeed;

    private int altitude;

    private int heading;

    private java.lang.String altitudeStatus;

    private java.lang.String updateType;

    private java.lang.String altitudeChange;

    private java.lang.String waypoints;

    public InFlightAircraftStruct() {
    }

    public InFlightAircraftStruct(
           java.lang.String faFlightID,
           java.lang.String ident,
           java.lang.String prefix,
           java.lang.String type,
           java.lang.String suffix,
           java.lang.String origin,
           java.lang.String destination,
           java.lang.String timeout,
           int timestamp,
           int departureTime,
           int firstPositionTime,
           int arrivalTime,
           float longitude,
           float latitude,
           float lowLongitude,
           float lowLatitude,
           float highLongitude,
           float highLatitude,
           int groundspeed,
           int altitude,
           int heading,
           java.lang.String altitudeStatus,
           java.lang.String updateType,
           java.lang.String altitudeChange,
           java.lang.String waypoints) {
           this.faFlightID = faFlightID;
           this.ident = ident;
           this.prefix = prefix;
           this.type = type;
           this.suffix = suffix;
           this.origin = origin;
           this.destination = destination;
           this.timeout = timeout;
           this.timestamp = timestamp;
           this.departureTime = departureTime;
           this.firstPositionTime = firstPositionTime;
           this.arrivalTime = arrivalTime;
           this.longitude = longitude;
           this.latitude = latitude;
           this.lowLongitude = lowLongitude;
           this.lowLatitude = lowLatitude;
           this.highLongitude = highLongitude;
           this.highLatitude = highLatitude;
           this.groundspeed = groundspeed;
           this.altitude = altitude;
           this.heading = heading;
           this.altitudeStatus = altitudeStatus;
           this.updateType = updateType;
           this.altitudeChange = altitudeChange;
           this.waypoints = waypoints;
    }


    /**
     * Gets the faFlightID value for this InFlightAircraftStruct.
     * 
     * @return faFlightID
     */
    public java.lang.String getFaFlightID() {
        return faFlightID;
    }


    /**
     * Sets the faFlightID value for this InFlightAircraftStruct.
     * 
     * @param faFlightID
     */
    public void setFaFlightID(java.lang.String faFlightID) {
        this.faFlightID = faFlightID;
    }


    /**
     * Gets the ident value for this InFlightAircraftStruct.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this InFlightAircraftStruct.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the prefix value for this InFlightAircraftStruct.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this InFlightAircraftStruct.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the type value for this InFlightAircraftStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this InFlightAircraftStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the suffix value for this InFlightAircraftStruct.
     * 
     * @return suffix
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this InFlightAircraftStruct.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the origin value for this InFlightAircraftStruct.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this InFlightAircraftStruct.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this InFlightAircraftStruct.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this InFlightAircraftStruct.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the timeout value for this InFlightAircraftStruct.
     * 
     * @return timeout
     */
    public java.lang.String getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this InFlightAircraftStruct.
     * 
     * @param timeout
     */
    public void setTimeout(java.lang.String timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the timestamp value for this InFlightAircraftStruct.
     * 
     * @return timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this InFlightAircraftStruct.
     * 
     * @param timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the departureTime value for this InFlightAircraftStruct.
     * 
     * @return departureTime
     */
    public int getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this InFlightAircraftStruct.
     * 
     * @param departureTime
     */
    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the firstPositionTime value for this InFlightAircraftStruct.
     * 
     * @return firstPositionTime
     */
    public int getFirstPositionTime() {
        return firstPositionTime;
    }


    /**
     * Sets the firstPositionTime value for this InFlightAircraftStruct.
     * 
     * @param firstPositionTime
     */
    public void setFirstPositionTime(int firstPositionTime) {
        this.firstPositionTime = firstPositionTime;
    }


    /**
     * Gets the arrivalTime value for this InFlightAircraftStruct.
     * 
     * @return arrivalTime
     */
    public int getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this InFlightAircraftStruct.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the longitude value for this InFlightAircraftStruct.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this InFlightAircraftStruct.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this InFlightAircraftStruct.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this InFlightAircraftStruct.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the lowLongitude value for this InFlightAircraftStruct.
     * 
     * @return lowLongitude
     */
    public float getLowLongitude() {
        return lowLongitude;
    }


    /**
     * Sets the lowLongitude value for this InFlightAircraftStruct.
     * 
     * @param lowLongitude
     */
    public void setLowLongitude(float lowLongitude) {
        this.lowLongitude = lowLongitude;
    }


    /**
     * Gets the lowLatitude value for this InFlightAircraftStruct.
     * 
     * @return lowLatitude
     */
    public float getLowLatitude() {
        return lowLatitude;
    }


    /**
     * Sets the lowLatitude value for this InFlightAircraftStruct.
     * 
     * @param lowLatitude
     */
    public void setLowLatitude(float lowLatitude) {
        this.lowLatitude = lowLatitude;
    }


    /**
     * Gets the highLongitude value for this InFlightAircraftStruct.
     * 
     * @return highLongitude
     */
    public float getHighLongitude() {
        return highLongitude;
    }


    /**
     * Sets the highLongitude value for this InFlightAircraftStruct.
     * 
     * @param highLongitude
     */
    public void setHighLongitude(float highLongitude) {
        this.highLongitude = highLongitude;
    }


    /**
     * Gets the highLatitude value for this InFlightAircraftStruct.
     * 
     * @return highLatitude
     */
    public float getHighLatitude() {
        return highLatitude;
    }


    /**
     * Sets the highLatitude value for this InFlightAircraftStruct.
     * 
     * @param highLatitude
     */
    public void setHighLatitude(float highLatitude) {
        this.highLatitude = highLatitude;
    }


    /**
     * Gets the groundspeed value for this InFlightAircraftStruct.
     * 
     * @return groundspeed
     */
    public int getGroundspeed() {
        return groundspeed;
    }


    /**
     * Sets the groundspeed value for this InFlightAircraftStruct.
     * 
     * @param groundspeed
     */
    public void setGroundspeed(int groundspeed) {
        this.groundspeed = groundspeed;
    }


    /**
     * Gets the altitude value for this InFlightAircraftStruct.
     * 
     * @return altitude
     */
    public int getAltitude() {
        return altitude;
    }


    /**
     * Sets the altitude value for this InFlightAircraftStruct.
     * 
     * @param altitude
     */
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }


    /**
     * Gets the heading value for this InFlightAircraftStruct.
     * 
     * @return heading
     */
    public int getHeading() {
        return heading;
    }


    /**
     * Sets the heading value for this InFlightAircraftStruct.
     * 
     * @param heading
     */
    public void setHeading(int heading) {
        this.heading = heading;
    }


    /**
     * Gets the altitudeStatus value for this InFlightAircraftStruct.
     * 
     * @return altitudeStatus
     */
    public java.lang.String getAltitudeStatus() {
        return altitudeStatus;
    }


    /**
     * Sets the altitudeStatus value for this InFlightAircraftStruct.
     * 
     * @param altitudeStatus
     */
    public void setAltitudeStatus(java.lang.String altitudeStatus) {
        this.altitudeStatus = altitudeStatus;
    }


    /**
     * Gets the updateType value for this InFlightAircraftStruct.
     * 
     * @return updateType
     */
    public java.lang.String getUpdateType() {
        return updateType;
    }


    /**
     * Sets the updateType value for this InFlightAircraftStruct.
     * 
     * @param updateType
     */
    public void setUpdateType(java.lang.String updateType) {
        this.updateType = updateType;
    }


    /**
     * Gets the altitudeChange value for this InFlightAircraftStruct.
     * 
     * @return altitudeChange
     */
    public java.lang.String getAltitudeChange() {
        return altitudeChange;
    }


    /**
     * Sets the altitudeChange value for this InFlightAircraftStruct.
     * 
     * @param altitudeChange
     */
    public void setAltitudeChange(java.lang.String altitudeChange) {
        this.altitudeChange = altitudeChange;
    }


    /**
     * Gets the waypoints value for this InFlightAircraftStruct.
     * 
     * @return waypoints
     */
    public java.lang.String getWaypoints() {
        return waypoints;
    }


    /**
     * Sets the waypoints value for this InFlightAircraftStruct.
     * 
     * @param waypoints
     */
    public void setWaypoints(java.lang.String waypoints) {
        this.waypoints = waypoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InFlightAircraftStruct)) return false;
        InFlightAircraftStruct other = (InFlightAircraftStruct) obj;
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
            ((this.ident==null && other.getIdent()==null) || 
             (this.ident!=null &&
              this.ident.equals(other.getIdent()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            this.timestamp == other.getTimestamp() &&
            this.departureTime == other.getDepartureTime() &&
            this.firstPositionTime == other.getFirstPositionTime() &&
            this.arrivalTime == other.getArrivalTime() &&
            this.longitude == other.getLongitude() &&
            this.latitude == other.getLatitude() &&
            this.lowLongitude == other.getLowLongitude() &&
            this.lowLatitude == other.getLowLatitude() &&
            this.highLongitude == other.getHighLongitude() &&
            this.highLatitude == other.getHighLatitude() &&
            this.groundspeed == other.getGroundspeed() &&
            this.altitude == other.getAltitude() &&
            this.heading == other.getHeading() &&
            ((this.altitudeStatus==null && other.getAltitudeStatus()==null) || 
             (this.altitudeStatus!=null &&
              this.altitudeStatus.equals(other.getAltitudeStatus()))) &&
            ((this.updateType==null && other.getUpdateType()==null) || 
             (this.updateType!=null &&
              this.updateType.equals(other.getUpdateType()))) &&
            ((this.altitudeChange==null && other.getAltitudeChange()==null) || 
             (this.altitudeChange!=null &&
              this.altitudeChange.equals(other.getAltitudeChange()))) &&
            ((this.waypoints==null && other.getWaypoints()==null) || 
             (this.waypoints!=null &&
              this.waypoints.equals(other.getWaypoints())));
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
        if (getIdent() != null) {
            _hashCode += getIdent().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        _hashCode += getTimestamp();
        _hashCode += getDepartureTime();
        _hashCode += getFirstPositionTime();
        _hashCode += getArrivalTime();
        _hashCode += new Float(getLongitude()).hashCode();
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLowLongitude()).hashCode();
        _hashCode += new Float(getLowLatitude()).hashCode();
        _hashCode += new Float(getHighLongitude()).hashCode();
        _hashCode += new Float(getHighLatitude()).hashCode();
        _hashCode += getGroundspeed();
        _hashCode += getAltitude();
        _hashCode += getHeading();
        if (getAltitudeStatus() != null) {
            _hashCode += getAltitudeStatus().hashCode();
        }
        if (getUpdateType() != null) {
            _hashCode += getUpdateType().hashCode();
        }
        if (getAltitudeChange() != null) {
            _hashCode += getAltitudeChange().hashCode();
        }
        if (getWaypoints() != null) {
            _hashCode += getWaypoints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InFlightAircraftStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightAircraftStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faFlightID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "faFlightID"));
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
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "prefix"));
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
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "suffix"));
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
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "timeout"));
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
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstPositionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "firstPositionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "lowLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "lowLatitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "highLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "highLatitude"));
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
        elemField.setFieldName("heading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "heading"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waypoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "waypoints"));
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
