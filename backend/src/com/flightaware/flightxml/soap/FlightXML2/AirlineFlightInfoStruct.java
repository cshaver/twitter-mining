/**
 * AirlineFlightInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class AirlineFlightInfoStruct  implements java.io.Serializable {
    private java.lang.String faFlightID;

    private java.lang.String ident;

    private java.lang.String[] codeshares;

    private java.lang.String tailnumber;

    private java.lang.String meal_service;

    private java.lang.String gate_orig;

    private java.lang.String gate_dest;

    private java.lang.String terminal_orig;

    private java.lang.String terminal_dest;

    private java.lang.String bag_claim;

    private int seats_cabin_first;

    private int seats_cabin_business;

    private int seats_cabin_coach;

    public AirlineFlightInfoStruct() {
    }

    public AirlineFlightInfoStruct(
           java.lang.String faFlightID,
           java.lang.String ident,
           java.lang.String[] codeshares,
           java.lang.String tailnumber,
           java.lang.String meal_service,
           java.lang.String gate_orig,
           java.lang.String gate_dest,
           java.lang.String terminal_orig,
           java.lang.String terminal_dest,
           java.lang.String bag_claim,
           int seats_cabin_first,
           int seats_cabin_business,
           int seats_cabin_coach) {
           this.faFlightID = faFlightID;
           this.ident = ident;
           this.codeshares = codeshares;
           this.tailnumber = tailnumber;
           this.meal_service = meal_service;
           this.gate_orig = gate_orig;
           this.gate_dest = gate_dest;
           this.terminal_orig = terminal_orig;
           this.terminal_dest = terminal_dest;
           this.bag_claim = bag_claim;
           this.seats_cabin_first = seats_cabin_first;
           this.seats_cabin_business = seats_cabin_business;
           this.seats_cabin_coach = seats_cabin_coach;
    }


    /**
     * Gets the faFlightID value for this AirlineFlightInfoStruct.
     * 
     * @return faFlightID
     */
    public java.lang.String getFaFlightID() {
        return faFlightID;
    }


    /**
     * Sets the faFlightID value for this AirlineFlightInfoStruct.
     * 
     * @param faFlightID
     */
    public void setFaFlightID(java.lang.String faFlightID) {
        this.faFlightID = faFlightID;
    }


    /**
     * Gets the ident value for this AirlineFlightInfoStruct.
     * 
     * @return ident
     */
    public java.lang.String getIdent() {
        return ident;
    }


    /**
     * Sets the ident value for this AirlineFlightInfoStruct.
     * 
     * @param ident
     */
    public void setIdent(java.lang.String ident) {
        this.ident = ident;
    }


    /**
     * Gets the codeshares value for this AirlineFlightInfoStruct.
     * 
     * @return codeshares
     */
    public java.lang.String[] getCodeshares() {
        return codeshares;
    }


    /**
     * Sets the codeshares value for this AirlineFlightInfoStruct.
     * 
     * @param codeshares
     */
    public void setCodeshares(java.lang.String[] codeshares) {
        this.codeshares = codeshares;
    }

    public java.lang.String getCodeshares(int i) {
        return this.codeshares[i];
    }

    public void setCodeshares(int i, java.lang.String _value) {
        this.codeshares[i] = _value;
    }


    /**
     * Gets the tailnumber value for this AirlineFlightInfoStruct.
     * 
     * @return tailnumber
     */
    public java.lang.String getTailnumber() {
        return tailnumber;
    }


    /**
     * Sets the tailnumber value for this AirlineFlightInfoStruct.
     * 
     * @param tailnumber
     */
    public void setTailnumber(java.lang.String tailnumber) {
        this.tailnumber = tailnumber;
    }


    /**
     * Gets the meal_service value for this AirlineFlightInfoStruct.
     * 
     * @return meal_service
     */
    public java.lang.String getMeal_service() {
        return meal_service;
    }


    /**
     * Sets the meal_service value for this AirlineFlightInfoStruct.
     * 
     * @param meal_service
     */
    public void setMeal_service(java.lang.String meal_service) {
        this.meal_service = meal_service;
    }


    /**
     * Gets the gate_orig value for this AirlineFlightInfoStruct.
     * 
     * @return gate_orig
     */
    public java.lang.String getGate_orig() {
        return gate_orig;
    }


    /**
     * Sets the gate_orig value for this AirlineFlightInfoStruct.
     * 
     * @param gate_orig
     */
    public void setGate_orig(java.lang.String gate_orig) {
        this.gate_orig = gate_orig;
    }


    /**
     * Gets the gate_dest value for this AirlineFlightInfoStruct.
     * 
     * @return gate_dest
     */
    public java.lang.String getGate_dest() {
        return gate_dest;
    }


    /**
     * Sets the gate_dest value for this AirlineFlightInfoStruct.
     * 
     * @param gate_dest
     */
    public void setGate_dest(java.lang.String gate_dest) {
        this.gate_dest = gate_dest;
    }


    /**
     * Gets the terminal_orig value for this AirlineFlightInfoStruct.
     * 
     * @return terminal_orig
     */
    public java.lang.String getTerminal_orig() {
        return terminal_orig;
    }


    /**
     * Sets the terminal_orig value for this AirlineFlightInfoStruct.
     * 
     * @param terminal_orig
     */
    public void setTerminal_orig(java.lang.String terminal_orig) {
        this.terminal_orig = terminal_orig;
    }


    /**
     * Gets the terminal_dest value for this AirlineFlightInfoStruct.
     * 
     * @return terminal_dest
     */
    public java.lang.String getTerminal_dest() {
        return terminal_dest;
    }


    /**
     * Sets the terminal_dest value for this AirlineFlightInfoStruct.
     * 
     * @param terminal_dest
     */
    public void setTerminal_dest(java.lang.String terminal_dest) {
        this.terminal_dest = terminal_dest;
    }


    /**
     * Gets the bag_claim value for this AirlineFlightInfoStruct.
     * 
     * @return bag_claim
     */
    public java.lang.String getBag_claim() {
        return bag_claim;
    }


    /**
     * Sets the bag_claim value for this AirlineFlightInfoStruct.
     * 
     * @param bag_claim
     */
    public void setBag_claim(java.lang.String bag_claim) {
        this.bag_claim = bag_claim;
    }


    /**
     * Gets the seats_cabin_first value for this AirlineFlightInfoStruct.
     * 
     * @return seats_cabin_first
     */
    public int getSeats_cabin_first() {
        return seats_cabin_first;
    }


    /**
     * Sets the seats_cabin_first value for this AirlineFlightInfoStruct.
     * 
     * @param seats_cabin_first
     */
    public void setSeats_cabin_first(int seats_cabin_first) {
        this.seats_cabin_first = seats_cabin_first;
    }


    /**
     * Gets the seats_cabin_business value for this AirlineFlightInfoStruct.
     * 
     * @return seats_cabin_business
     */
    public int getSeats_cabin_business() {
        return seats_cabin_business;
    }


    /**
     * Sets the seats_cabin_business value for this AirlineFlightInfoStruct.
     * 
     * @param seats_cabin_business
     */
    public void setSeats_cabin_business(int seats_cabin_business) {
        this.seats_cabin_business = seats_cabin_business;
    }


    /**
     * Gets the seats_cabin_coach value for this AirlineFlightInfoStruct.
     * 
     * @return seats_cabin_coach
     */
    public int getSeats_cabin_coach() {
        return seats_cabin_coach;
    }


    /**
     * Sets the seats_cabin_coach value for this AirlineFlightInfoStruct.
     * 
     * @param seats_cabin_coach
     */
    public void setSeats_cabin_coach(int seats_cabin_coach) {
        this.seats_cabin_coach = seats_cabin_coach;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineFlightInfoStruct)) return false;
        AirlineFlightInfoStruct other = (AirlineFlightInfoStruct) obj;
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
            ((this.codeshares==null && other.getCodeshares()==null) || 
             (this.codeshares!=null &&
              java.util.Arrays.equals(this.codeshares, other.getCodeshares()))) &&
            ((this.tailnumber==null && other.getTailnumber()==null) || 
             (this.tailnumber!=null &&
              this.tailnumber.equals(other.getTailnumber()))) &&
            ((this.meal_service==null && other.getMeal_service()==null) || 
             (this.meal_service!=null &&
              this.meal_service.equals(other.getMeal_service()))) &&
            ((this.gate_orig==null && other.getGate_orig()==null) || 
             (this.gate_orig!=null &&
              this.gate_orig.equals(other.getGate_orig()))) &&
            ((this.gate_dest==null && other.getGate_dest()==null) || 
             (this.gate_dest!=null &&
              this.gate_dest.equals(other.getGate_dest()))) &&
            ((this.terminal_orig==null && other.getTerminal_orig()==null) || 
             (this.terminal_orig!=null &&
              this.terminal_orig.equals(other.getTerminal_orig()))) &&
            ((this.terminal_dest==null && other.getTerminal_dest()==null) || 
             (this.terminal_dest!=null &&
              this.terminal_dest.equals(other.getTerminal_dest()))) &&
            ((this.bag_claim==null && other.getBag_claim()==null) || 
             (this.bag_claim!=null &&
              this.bag_claim.equals(other.getBag_claim()))) &&
            this.seats_cabin_first == other.getSeats_cabin_first() &&
            this.seats_cabin_business == other.getSeats_cabin_business() &&
            this.seats_cabin_coach == other.getSeats_cabin_coach();
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
        if (getCodeshares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodeshares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodeshares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTailnumber() != null) {
            _hashCode += getTailnumber().hashCode();
        }
        if (getMeal_service() != null) {
            _hashCode += getMeal_service().hashCode();
        }
        if (getGate_orig() != null) {
            _hashCode += getGate_orig().hashCode();
        }
        if (getGate_dest() != null) {
            _hashCode += getGate_dest().hashCode();
        }
        if (getTerminal_orig() != null) {
            _hashCode += getTerminal_orig().hashCode();
        }
        if (getTerminal_dest() != null) {
            _hashCode += getTerminal_dest().hashCode();
        }
        if (getBag_claim() != null) {
            _hashCode += getBag_claim().hashCode();
        }
        _hashCode += getSeats_cabin_first();
        _hashCode += getSeats_cabin_business();
        _hashCode += getSeats_cabin_coach();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineFlightInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoStruct"));
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
        elemField.setFieldName("codeshares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "codeshares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tailnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "tailnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meal_service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "meal_service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gate_orig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "gate_orig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gate_dest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "gate_dest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminal_orig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "terminal_orig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminal_dest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "terminal_dest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bag_claim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "bag_claim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_cabin_first");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "seats_cabin_first"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_cabin_business");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "seats_cabin_business"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_cabin_coach");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "seats_cabin_coach"));
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
