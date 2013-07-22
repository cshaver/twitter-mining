/**
 * AirlineInsightStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AirlineInsightStruct  implements java.io.Serializable {
    private java.lang.String origin;

    private java.lang.String layover;

    private java.lang.String destination;

    private java.lang.String carrier;

    private java.lang.String opcarrier;

    private int flights_scheduled;

    private int flights_performed;

    private int total_passengers;

    private int total_seats;

    private int total_payload;

    private int total_mail;

    private float percent;

    private java.lang.String fare_min;

    private java.lang.String fare_median;

    private java.lang.String fare_max;

    public AirlineInsightStruct() {
    }

    public AirlineInsightStruct(
           java.lang.String origin,
           java.lang.String layover,
           java.lang.String destination,
           java.lang.String carrier,
           java.lang.String opcarrier,
           int flights_scheduled,
           int flights_performed,
           int total_passengers,
           int total_seats,
           int total_payload,
           int total_mail,
           float percent,
           java.lang.String fare_min,
           java.lang.String fare_median,
           java.lang.String fare_max) {
           this.origin = origin;
           this.layover = layover;
           this.destination = destination;
           this.carrier = carrier;
           this.opcarrier = opcarrier;
           this.flights_scheduled = flights_scheduled;
           this.flights_performed = flights_performed;
           this.total_passengers = total_passengers;
           this.total_seats = total_seats;
           this.total_payload = total_payload;
           this.total_mail = total_mail;
           this.percent = percent;
           this.fare_min = fare_min;
           this.fare_median = fare_median;
           this.fare_max = fare_max;
    }


    /**
     * Gets the origin value for this AirlineInsightStruct.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this AirlineInsightStruct.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the layover value for this AirlineInsightStruct.
     * 
     * @return layover
     */
    public java.lang.String getLayover() {
        return layover;
    }


    /**
     * Sets the layover value for this AirlineInsightStruct.
     * 
     * @param layover
     */
    public void setLayover(java.lang.String layover) {
        this.layover = layover;
    }


    /**
     * Gets the destination value for this AirlineInsightStruct.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this AirlineInsightStruct.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the carrier value for this AirlineInsightStruct.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this AirlineInsightStruct.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the opcarrier value for this AirlineInsightStruct.
     * 
     * @return opcarrier
     */
    public java.lang.String getOpcarrier() {
        return opcarrier;
    }


    /**
     * Sets the opcarrier value for this AirlineInsightStruct.
     * 
     * @param opcarrier
     */
    public void setOpcarrier(java.lang.String opcarrier) {
        this.opcarrier = opcarrier;
    }


    /**
     * Gets the flights_scheduled value for this AirlineInsightStruct.
     * 
     * @return flights_scheduled
     */
    public int getFlights_scheduled() {
        return flights_scheduled;
    }


    /**
     * Sets the flights_scheduled value for this AirlineInsightStruct.
     * 
     * @param flights_scheduled
     */
    public void setFlights_scheduled(int flights_scheduled) {
        this.flights_scheduled = flights_scheduled;
    }


    /**
     * Gets the flights_performed value for this AirlineInsightStruct.
     * 
     * @return flights_performed
     */
    public int getFlights_performed() {
        return flights_performed;
    }


    /**
     * Sets the flights_performed value for this AirlineInsightStruct.
     * 
     * @param flights_performed
     */
    public void setFlights_performed(int flights_performed) {
        this.flights_performed = flights_performed;
    }


    /**
     * Gets the total_passengers value for this AirlineInsightStruct.
     * 
     * @return total_passengers
     */
    public int getTotal_passengers() {
        return total_passengers;
    }


    /**
     * Sets the total_passengers value for this AirlineInsightStruct.
     * 
     * @param total_passengers
     */
    public void setTotal_passengers(int total_passengers) {
        this.total_passengers = total_passengers;
    }


    /**
     * Gets the total_seats value for this AirlineInsightStruct.
     * 
     * @return total_seats
     */
    public int getTotal_seats() {
        return total_seats;
    }


    /**
     * Sets the total_seats value for this AirlineInsightStruct.
     * 
     * @param total_seats
     */
    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }


    /**
     * Gets the total_payload value for this AirlineInsightStruct.
     * 
     * @return total_payload
     */
    public int getTotal_payload() {
        return total_payload;
    }


    /**
     * Sets the total_payload value for this AirlineInsightStruct.
     * 
     * @param total_payload
     */
    public void setTotal_payload(int total_payload) {
        this.total_payload = total_payload;
    }


    /**
     * Gets the total_mail value for this AirlineInsightStruct.
     * 
     * @return total_mail
     */
    public int getTotal_mail() {
        return total_mail;
    }


    /**
     * Sets the total_mail value for this AirlineInsightStruct.
     * 
     * @param total_mail
     */
    public void setTotal_mail(int total_mail) {
        this.total_mail = total_mail;
    }


    /**
     * Gets the percent value for this AirlineInsightStruct.
     * 
     * @return percent
     */
    public float getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this AirlineInsightStruct.
     * 
     * @param percent
     */
    public void setPercent(float percent) {
        this.percent = percent;
    }


    /**
     * Gets the fare_min value for this AirlineInsightStruct.
     * 
     * @return fare_min
     */
    public java.lang.String getFare_min() {
        return fare_min;
    }


    /**
     * Sets the fare_min value for this AirlineInsightStruct.
     * 
     * @param fare_min
     */
    public void setFare_min(java.lang.String fare_min) {
        this.fare_min = fare_min;
    }


    /**
     * Gets the fare_median value for this AirlineInsightStruct.
     * 
     * @return fare_median
     */
    public java.lang.String getFare_median() {
        return fare_median;
    }


    /**
     * Sets the fare_median value for this AirlineInsightStruct.
     * 
     * @param fare_median
     */
    public void setFare_median(java.lang.String fare_median) {
        this.fare_median = fare_median;
    }


    /**
     * Gets the fare_max value for this AirlineInsightStruct.
     * 
     * @return fare_max
     */
    public java.lang.String getFare_max() {
        return fare_max;
    }


    /**
     * Sets the fare_max value for this AirlineInsightStruct.
     * 
     * @param fare_max
     */
    public void setFare_max(java.lang.String fare_max) {
        this.fare_max = fare_max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineInsightStruct)) return false;
        AirlineInsightStruct other = (AirlineInsightStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.layover==null && other.getLayover()==null) || 
             (this.layover!=null &&
              this.layover.equals(other.getLayover()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.opcarrier==null && other.getOpcarrier()==null) || 
             (this.opcarrier!=null &&
              this.opcarrier.equals(other.getOpcarrier()))) &&
            this.flights_scheduled == other.getFlights_scheduled() &&
            this.flights_performed == other.getFlights_performed() &&
            this.total_passengers == other.getTotal_passengers() &&
            this.total_seats == other.getTotal_seats() &&
            this.total_payload == other.getTotal_payload() &&
            this.total_mail == other.getTotal_mail() &&
            this.percent == other.getPercent() &&
            ((this.fare_min==null && other.getFare_min()==null) || 
             (this.fare_min!=null &&
              this.fare_min.equals(other.getFare_min()))) &&
            ((this.fare_median==null && other.getFare_median()==null) || 
             (this.fare_median!=null &&
              this.fare_median.equals(other.getFare_median()))) &&
            ((this.fare_max==null && other.getFare_max()==null) || 
             (this.fare_max!=null &&
              this.fare_max.equals(other.getFare_max())));
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
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getLayover() != null) {
            _hashCode += getLayover().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getOpcarrier() != null) {
            _hashCode += getOpcarrier().hashCode();
        }
        _hashCode += getFlights_scheduled();
        _hashCode += getFlights_performed();
        _hashCode += getTotal_passengers();
        _hashCode += getTotal_seats();
        _hashCode += getTotal_payload();
        _hashCode += getTotal_mail();
        _hashCode += new Float(getPercent()).hashCode();
        if (getFare_min() != null) {
            _hashCode += getFare_min().hashCode();
        }
        if (getFare_median() != null) {
            _hashCode += getFare_median().hashCode();
        }
        if (getFare_max() != null) {
            _hashCode += getFare_max().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineInsightStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layover");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "layover"));
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
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "opcarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flights_scheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "flights_scheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flights_performed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "flights_performed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_passengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "total_passengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "total_seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_payload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "total_payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_mail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "total_mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "fare_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare_median");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "fare_median"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "fare_max"));
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
