/**
 * MapFlightExRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class MapFlightExRequest  implements java.io.Serializable {
    private java.lang.String faFlightID;

    private int mapHeight;

    private int mapWidth;

    private java.lang.String[] layer_on;

    private java.lang.String[] layer_off;

    private boolean show_data_blocks;

    private boolean show_airports;

    private boolean airports_expand_view;

    private float[] latlon_box;

    public MapFlightExRequest() {
    }

    public MapFlightExRequest(
           java.lang.String faFlightID,
           int mapHeight,
           int mapWidth,
           java.lang.String[] layer_on,
           java.lang.String[] layer_off,
           boolean show_data_blocks,
           boolean show_airports,
           boolean airports_expand_view,
           float[] latlon_box) {
           this.faFlightID = faFlightID;
           this.mapHeight = mapHeight;
           this.mapWidth = mapWidth;
           this.layer_on = layer_on;
           this.layer_off = layer_off;
           this.show_data_blocks = show_data_blocks;
           this.show_airports = show_airports;
           this.airports_expand_view = airports_expand_view;
           this.latlon_box = latlon_box;
    }


    /**
     * Gets the faFlightID value for this MapFlightExRequest.
     * 
     * @return faFlightID
     */
    public java.lang.String getFaFlightID() {
        return faFlightID;
    }


    /**
     * Sets the faFlightID value for this MapFlightExRequest.
     * 
     * @param faFlightID
     */
    public void setFaFlightID(java.lang.String faFlightID) {
        this.faFlightID = faFlightID;
    }


    /**
     * Gets the mapHeight value for this MapFlightExRequest.
     * 
     * @return mapHeight
     */
    public int getMapHeight() {
        return mapHeight;
    }


    /**
     * Sets the mapHeight value for this MapFlightExRequest.
     * 
     * @param mapHeight
     */
    public void setMapHeight(int mapHeight) {
        this.mapHeight = mapHeight;
    }


    /**
     * Gets the mapWidth value for this MapFlightExRequest.
     * 
     * @return mapWidth
     */
    public int getMapWidth() {
        return mapWidth;
    }


    /**
     * Sets the mapWidth value for this MapFlightExRequest.
     * 
     * @param mapWidth
     */
    public void setMapWidth(int mapWidth) {
        this.mapWidth = mapWidth;
    }


    /**
     * Gets the layer_on value for this MapFlightExRequest.
     * 
     * @return layer_on
     */
    public java.lang.String[] getLayer_on() {
        return layer_on;
    }


    /**
     * Sets the layer_on value for this MapFlightExRequest.
     * 
     * @param layer_on
     */
    public void setLayer_on(java.lang.String[] layer_on) {
        this.layer_on = layer_on;
    }

    public java.lang.String getLayer_on(int i) {
        return this.layer_on[i];
    }

    public void setLayer_on(int i, java.lang.String _value) {
        this.layer_on[i] = _value;
    }


    /**
     * Gets the layer_off value for this MapFlightExRequest.
     * 
     * @return layer_off
     */
    public java.lang.String[] getLayer_off() {
        return layer_off;
    }


    /**
     * Sets the layer_off value for this MapFlightExRequest.
     * 
     * @param layer_off
     */
    public void setLayer_off(java.lang.String[] layer_off) {
        this.layer_off = layer_off;
    }

    public java.lang.String getLayer_off(int i) {
        return this.layer_off[i];
    }

    public void setLayer_off(int i, java.lang.String _value) {
        this.layer_off[i] = _value;
    }


    /**
     * Gets the show_data_blocks value for this MapFlightExRequest.
     * 
     * @return show_data_blocks
     */
    public boolean isShow_data_blocks() {
        return show_data_blocks;
    }


    /**
     * Sets the show_data_blocks value for this MapFlightExRequest.
     * 
     * @param show_data_blocks
     */
    public void setShow_data_blocks(boolean show_data_blocks) {
        this.show_data_blocks = show_data_blocks;
    }


    /**
     * Gets the show_airports value for this MapFlightExRequest.
     * 
     * @return show_airports
     */
    public boolean isShow_airports() {
        return show_airports;
    }


    /**
     * Sets the show_airports value for this MapFlightExRequest.
     * 
     * @param show_airports
     */
    public void setShow_airports(boolean show_airports) {
        this.show_airports = show_airports;
    }


    /**
     * Gets the airports_expand_view value for this MapFlightExRequest.
     * 
     * @return airports_expand_view
     */
    public boolean isAirports_expand_view() {
        return airports_expand_view;
    }


    /**
     * Sets the airports_expand_view value for this MapFlightExRequest.
     * 
     * @param airports_expand_view
     */
    public void setAirports_expand_view(boolean airports_expand_view) {
        this.airports_expand_view = airports_expand_view;
    }


    /**
     * Gets the latlon_box value for this MapFlightExRequest.
     * 
     * @return latlon_box
     */
    public float[] getLatlon_box() {
        return latlon_box;
    }


    /**
     * Sets the latlon_box value for this MapFlightExRequest.
     * 
     * @param latlon_box
     */
    public void setLatlon_box(float[] latlon_box) {
        this.latlon_box = latlon_box;
    }

    public float getLatlon_box(int i) {
        return this.latlon_box[i];
    }

    public void setLatlon_box(int i, float _value) {
        this.latlon_box[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapFlightExRequest)) return false;
        MapFlightExRequest other = (MapFlightExRequest) obj;
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
            this.mapHeight == other.getMapHeight() &&
            this.mapWidth == other.getMapWidth() &&
            ((this.layer_on==null && other.getLayer_on()==null) || 
             (this.layer_on!=null &&
              java.util.Arrays.equals(this.layer_on, other.getLayer_on()))) &&
            ((this.layer_off==null && other.getLayer_off()==null) || 
             (this.layer_off!=null &&
              java.util.Arrays.equals(this.layer_off, other.getLayer_off()))) &&
            this.show_data_blocks == other.isShow_data_blocks() &&
            this.show_airports == other.isShow_airports() &&
            this.airports_expand_view == other.isAirports_expand_view() &&
            ((this.latlon_box==null && other.getLatlon_box()==null) || 
             (this.latlon_box!=null &&
              java.util.Arrays.equals(this.latlon_box, other.getLatlon_box())));
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
        _hashCode += getMapHeight();
        _hashCode += getMapWidth();
        if (getLayer_on() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayer_on());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLayer_on(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLayer_off() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayer_off());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLayer_off(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isShow_data_blocks() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShow_airports() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAirports_expand_view() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLatlon_box() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLatlon_box());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLatlon_box(), i);
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
        new org.apache.axis.description.TypeDesc(MapFlightExRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightExRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faFlightID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "faFlightID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "mapHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "mapWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layer_on");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "layer_on"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layer_off");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "layer_off"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("show_data_blocks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "show_data_blocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("show_airports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "show_airports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airports_expand_view");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "airports_expand_view"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latlon_box");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "latlon_box"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
