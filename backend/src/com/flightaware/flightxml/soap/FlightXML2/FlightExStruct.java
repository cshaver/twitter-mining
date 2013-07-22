/**
 * FlightExStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class FlightExStruct  implements java.io.Serializable {
    private java.lang.String faFlightID;

    private java.lang.String ident;

    private java.lang.String aircrafttype;

    private java.lang.String filed_ete;

    private int filed_time;

    private int filed_departuretime;

    private int filed_airspeed_kts;

    private java.lang.String filed_airspeed_mach;

    private int filed_altitude;

    private java.lang.String route;

    private int actualdeparturetime;

    private int estimatedarrivaltime;

    private int actualarrivaltime;

    private java.lang.String diverted;

    private java.lang.String origin;

    private java.lang.String destination;

    private java.lang.String originName;

    private java.lang.String originCity;

    private java.lang.String destinationName;

    private java.lang.String destinationCity;

    public FlightExStruct() {
    }

    public FlightExStruct(
           java.lang.String faFlightID,
           java.lang.String ident,
           java.lang.String aircrafttype,
           java.lang.String filed_ete,
           int filed_time,
           int filed_departuretime,
           int filed_airspeed_kts,
           java.lang.String filed_airspeed_mach,
           int filed_altitude,
           java.lang.String route,
           int actualdeparturetime,
           int estimatedarrivaltime,
           int actualarrivaltime,
           java.lang.String diverted,
           java.lang.String origin,
           java.lang.String destination,
           java.lang.String originName,
           java.lang.String originCity,
           java.lang.String destinationName,
           java.lang.String destinationCity) {
           this.faFlightID = faFlightID;
           this.ident = ident;
           this.aircrafttype = aircrafttype;
           this.filed_ete = filed_ete;
           this.filed_time = filed_time;
           this.filed_departuretime = filed_departuretime;
           this.filed_airspeed_kts = filed_airspeed_kts;
           this.filed_airspeed_mach = filed_airspeed_mach;
           this.filed_altitude = filed_altitude;
           this.route = route;
           this.actualdeparturetime = actualdeparturetime;
           this.estimatedarrivaltime = estimatedarrivaltime;
           this.actualarrivaltime = actualarrivaltime;
           this.diverted = diverted;
           this.origin = origin;
           this.destination = destination;
           this.originName = originName;
           this.originCity = originCity;
           this.destinationName = destinationName;
           this.destinationCity = destinationCity;
    }


    /**
     * Gets the faFlightID value for this FlightExStruct.
     * 
     * @return faFlightID
     */
    public java.lang.String getFaFlightID() {
        return faFlightID;
    }


    /**
     * Sets the faFlightID value for this FlightExStruct.
     * 
     * @param faFlightID
     */
    public void setFaFlightID(java.lang.String faFlightID) {
        this.faFlightID = faFlightID;
    }


    /**
     * Gets the ident value for this FlightExStruct.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this FlightExStruct.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the aircrafttype value for this FlightExStruct.
     * 
     * @return aircrafttype
     */
    public java.lang.String getAircrafttype() {
        return aircrafttype;
    }


    /**
     * Sets the aircrafttype value for this FlightExStruct.
     * 
     * @param aircrafttype
     */
    public void setAircrafttype(java.lang.String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }


    /**
     * Gets the filed_ete value for this FlightExStruct.
     * 
     * @return filed_ete
     */
    public java.lang.String getFiled_ete() {
        return filed_ete;
    }


    /**
     * Sets the filed_ete value for this FlightExStruct.
     * 
     * @param filed_ete
     */
    public void setFiled_ete(java.lang.String filed_ete) {
        this.filed_ete = filed_ete;
    }


    /**
     * Gets the filed_time value for this FlightExStruct.
     * 
     * @return filed_time
     */
    public int getFiled_time() {
        return filed_time;
    }


    /**
     * Sets the filed_time value for this FlightExStruct.
     * 
     * @param filed_time
     */
    public void setFiled_time(int filed_time) {
        this.filed_time = filed_time;
    }


    /**
     * Gets the filed_departuretime value for this FlightExStruct.
     * 
     * @return filed_departuretime
     */
    public int getFiled_departuretime() {
        return filed_departuretime;
    }


    /**
     * Sets the filed_departuretime value for this FlightExStruct.
     * 
     * @param filed_departuretime
     */
    public void setFiled_departuretime(int filed_departuretime) {
        this.filed_departuretime = filed_departuretime;
    }


    /**
     * Gets the filed_airspeed_kts value for this FlightExStruct.
     * 
     * @return filed_airspeed_kts
     */
    public int getFiled_airspeed_kts() {
        return filed_airspeed_kts;
    }


    /**
     * Sets the filed_airspeed_kts value for this FlightExStruct.
     * 
     * @param filed_airspeed_kts
     */
    public void setFiled_airspeed_kts(int filed_airspeed_kts) {
        this.filed_airspeed_kts = filed_airspeed_kts;
    }


    /**
     * Gets the filed_airspeed_mach value for this FlightExStruct.
     * 
     * @return filed_airspeed_mach
     */
    public java.lang.String getFiled_airspeed_mach() {
        return filed_airspeed_mach;
    }


    /**
     * Sets the filed_airspeed_mach value for this FlightExStruct.
     * 
     * @param filed_airspeed_mach
     */
    public void setFiled_airspeed_mach(java.lang.String filed_airspeed_mach) {
        this.filed_airspeed_mach = filed_airspeed_mach;
    }


    /**
     * Gets the filed_altitude value for this FlightExStruct.
     * 
     * @return filed_altitude
     */
    public int getFiled_altitude() {
        return filed_altitude;
    }


    /**
     * Sets the filed_altitude value for this FlightExStruct.
     * 
     * @param filed_altitude
     */
    public void setFiled_altitude(int filed_altitude) {
        this.filed_altitude = filed_altitude;
    }


    /**
     * Gets the route value for this FlightExStruct.
     * 
     * @return route
     */
    public java.lang.String getRoute() {
        return route;
    }


    /**
     * Sets the route value for this FlightExStruct.
     * 
     * @param route
     */
    public void setRoute(java.lang.String route) {
        this.route = route;
    }


    /**
     * Gets the actualdeparturetime value for this FlightExStruct.
     * 
     * @return actualdeparturetime
     */
    public int getActualdeparturetime() {
        return actualdeparturetime;
    }


    /**
     * Sets the actualdeparturetime value for this FlightExStruct.
     * 
     * @param actualdeparturetime
     */
    public void setActualdeparturetime(int actualdeparturetime) {
        this.actualdeparturetime = actualdeparturetime;
    }


    /**
     * Gets the estimatedarrivaltime value for this FlightExStruct.
     * 
     * @return estimatedarrivaltime
     */
    public int getEstimatedarrivaltime() {
        return estimatedarrivaltime;
    }


    /**
     * Sets the estimatedarrivaltime value for this FlightExStruct.
     * 
     * @param estimatedarrivaltime
     */
    public void setEstimatedarrivaltime(int estimatedarrivaltime) {
        this.estimatedarrivaltime = estimatedarrivaltime;
    }


    /**
     * Gets the actualarrivaltime value for this FlightExStruct.
     * 
     * @return actualarrivaltime
     */
    public int getActualarrivaltime() {
        return actualarrivaltime;
    }


    /**
     * Sets the actualarrivaltime value for this FlightExStruct.
     * 
     * @param actualarrivaltime
     */
    public void setActualarrivaltime(int actualarrivaltime) {
        this.actualarrivaltime = actualarrivaltime;
    }


    /**
     * Gets the diverted value for this FlightExStruct.
     * 
     * @return diverted
     */
    public java.lang.String getDiverted() {
        return diverted;
    }


    /**
     * Sets the diverted value for this FlightExStruct.
     * 
     * @param diverted
     */
    public void setDiverted(java.lang.String diverted) {
        this.diverted = diverted;
    }


    /**
     * Gets the origin value for this FlightExStruct.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this FlightExStruct.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this FlightExStruct.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this FlightExStruct.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the originName value for this FlightExStruct.
     * 
     * @return originName
     */
    public java.lang.String getOriginName() {
        return originName;
    }


    /**
     * Sets the originName value for this FlightExStruct.
     * 
     * @param originName
     */
    public void setOriginName(java.lang.String originName) {
        this.originName = originName;
    }


    /**
     * Gets the originCity value for this FlightExStruct.
     * 
     * @return originCity
     */
    public java.lang.String getOriginCity() {
        return originCity;
    }


    /**
     * Sets the originCity value for this FlightExStruct.
     * 
     * @param originCity
     */
    public void setOriginCity(java.lang.String originCity) {
        this.originCity = originCity;
    }


    /**
     * Gets the destinationName value for this FlightExStruct.
     * 
     * @return destinationName
     */
    public java.lang.String getDestinationName() {
        return destinationName;
    }


    /**
     * Sets the destinationName value for this FlightExStruct.
     * 
     * @param destinationName
     */
    public void setDestinationName(java.lang.String destinationName) {
        this.destinationName = destinationName;
    }


    /**
     * Gets the destinationCity value for this FlightExStruct.
     * 
     * @return destinationCity
     */
    public java.lang.String getDestinationCity() {
        return destinationCity;
    }


    /**
     * Sets the destinationCity value for this FlightExStruct.
     * 
     * @param destinationCity
     */
    public void setDestinationCity(java.lang.String destinationCity) {
        this.destinationCity = destinationCity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightExStruct)) return false;
        FlightExStruct other = (FlightExStruct) obj;
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
            ((this.aircrafttype==null && other.getAircrafttype()==null) || 
             (this.aircrafttype!=null &&
              this.aircrafttype.equals(other.getAircrafttype()))) &&
            ((this.filed_ete==null && other.getFiled_ete()==null) || 
             (this.filed_ete!=null &&
              this.filed_ete.equals(other.getFiled_ete()))) &&
            this.filed_time == other.getFiled_time() &&
            this.filed_departuretime == other.getFiled_departuretime() &&
            this.filed_airspeed_kts == other.getFiled_airspeed_kts() &&
            ((this.filed_airspeed_mach==null && other.getFiled_airspeed_mach()==null) || 
             (this.filed_airspeed_mach!=null &&
              this.filed_airspeed_mach.equals(other.getFiled_airspeed_mach()))) &&
            this.filed_altitude == other.getFiled_altitude() &&
            ((this.route==null && other.getRoute()==null) || 
             (this.route!=null &&
              this.route.equals(other.getRoute()))) &&
            this.actualdeparturetime == other.getActualdeparturetime() &&
            this.estimatedarrivaltime == other.getEstimatedarrivaltime() &&
            this.actualarrivaltime == other.getActualarrivaltime() &&
            ((this.diverted==null && other.getDiverted()==null) || 
             (this.diverted!=null &&
              this.diverted.equals(other.getDiverted()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.originName==null && other.getOriginName()==null) || 
             (this.originName!=null &&
              this.originName.equals(other.getOriginName()))) &&
            ((this.originCity==null && other.getOriginCity()==null) || 
             (this.originCity!=null &&
              this.originCity.equals(other.getOriginCity()))) &&
            ((this.destinationName==null && other.getDestinationName()==null) || 
             (this.destinationName!=null &&
              this.destinationName.equals(other.getDestinationName()))) &&
            ((this.destinationCity==null && other.getDestinationCity()==null) || 
             (this.destinationCity!=null &&
              this.destinationCity.equals(other.getDestinationCity())));
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
        if (getAircrafttype() != null) {
            _hashCode += getAircrafttype().hashCode();
        }
        if (getFiled_ete() != null) {
            _hashCode += getFiled_ete().hashCode();
        }
        _hashCode += getFiled_time();
        _hashCode += getFiled_departuretime();
        _hashCode += getFiled_airspeed_kts();
        if (getFiled_airspeed_mach() != null) {
            _hashCode += getFiled_airspeed_mach().hashCode();
        }
        _hashCode += getFiled_altitude();
        if (getRoute() != null) {
            _hashCode += getRoute().hashCode();
        }
        _hashCode += getActualdeparturetime();
        _hashCode += getEstimatedarrivaltime();
        _hashCode += getActualarrivaltime();
        if (getDiverted() != null) {
            _hashCode += getDiverted().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getOriginName() != null) {
            _hashCode += getOriginName().hashCode();
        }
        if (getOriginCity() != null) {
            _hashCode += getOriginCity().hashCode();
        }
        if (getDestinationName() != null) {
            _hashCode += getDestinationName().hashCode();
        }
        if (getDestinationCity() != null) {
            _hashCode += getDestinationCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightExStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightExStruct"));
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
        elemField.setFieldName("aircrafttype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "aircrafttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filed_ete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filed_ete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filed_time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filed_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filed_departuretime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filed_departuretime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filed_airspeed_kts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filed_airspeed_kts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filed_airspeed_mach");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filed_airspeed_mach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filed_altitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "filed_altitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "route"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualdeparturetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "actualdeparturetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedarrivaltime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "estimatedarrivaltime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualarrivaltime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "actualarrivaltime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diverted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "diverted"));
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
        elemField.setFieldName("originName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "originName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "originCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "destinationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "destinationCity"));
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
