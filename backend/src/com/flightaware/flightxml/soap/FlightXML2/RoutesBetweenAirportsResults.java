/**
 * RoutesBetweenAirportsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class RoutesBetweenAirportsResults  implements java.io.Serializable {
    private com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsStruct[] routesBetweenAirportsResult;

    public RoutesBetweenAirportsResults() {
    }

    public RoutesBetweenAirportsResults(
           com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsStruct[] routesBetweenAirportsResult) {
           this.routesBetweenAirportsResult = routesBetweenAirportsResult;
    }


    /**
     * Gets the routesBetweenAirportsResult value for this RoutesBetweenAirportsResults.
     * 
     * @return routesBetweenAirportsResult
     */
    public com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsStruct[] getRoutesBetweenAirportsResult() {
        return routesBetweenAirportsResult;
    }


    /**
     * Sets the routesBetweenAirportsResult value for this RoutesBetweenAirportsResults.
     * 
     * @param routesBetweenAirportsResult
     */
    public void setRoutesBetweenAirportsResult(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsStruct[] routesBetweenAirportsResult) {
        this.routesBetweenAirportsResult = routesBetweenAirportsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutesBetweenAirportsResults)) return false;
        RoutesBetweenAirportsResults other = (RoutesBetweenAirportsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routesBetweenAirportsResult==null && other.getRoutesBetweenAirportsResult()==null) || 
             (this.routesBetweenAirportsResult!=null &&
              java.util.Arrays.equals(this.routesBetweenAirportsResult, other.getRoutesBetweenAirportsResult())));
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
        if (getRoutesBetweenAirportsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutesBetweenAirportsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutesBetweenAirportsResult(), i);
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
        new org.apache.axis.description.TypeDesc(RoutesBetweenAirportsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routesBetweenAirportsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsStruct"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "data"));
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
