/**
 * FlightXML2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class FlightXML2Locator extends org.apache.axis.client.Service implements com.flightaware.flightxml.soap.FlightXML2.FlightXML2 {

/**
 * FlightXML2 Web Services
 */

    public FlightXML2Locator() {
    }


    public FlightXML2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FlightXML2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FlightXML2Soap
    private java.lang.String FlightXML2Soap_address = "http://flightxml.flightaware.com/soap/FlightXML2/op";

    public java.lang.String getFlightXML2SoapAddress() {
        return FlightXML2Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FlightXML2SoapWSDDServiceName = "FlightXML2Soap";

    public java.lang.String getFlightXML2SoapWSDDServiceName() {
        return FlightXML2SoapWSDDServiceName;
    }

    public void setFlightXML2SoapWSDDServiceName(java.lang.String name) {
        FlightXML2SoapWSDDServiceName = name;
    }

    public com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap getFlightXML2Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FlightXML2Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFlightXML2Soap(endpoint);
    }

    public com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap getFlightXML2Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.flightaware.flightxml.soap.FlightXML2.FlightXML2SoapStub _stub = new com.flightaware.flightxml.soap.FlightXML2.FlightXML2SoapStub(portAddress, this);
            _stub.setPortName(getFlightXML2SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFlightXML2SoapEndpointAddress(java.lang.String address) {
        FlightXML2Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.flightaware.flightxml.soap.FlightXML2.FlightXML2SoapStub _stub = new com.flightaware.flightxml.soap.FlightXML2.FlightXML2SoapStub(new java.net.URL(FlightXML2Soap_address), this);
                _stub.setPortName(getFlightXML2SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FlightXML2Soap".equals(inputPortName)) {
            return getFlightXML2Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightXML2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightXML2Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FlightXML2Soap".equals(portName)) {
            setFlightXML2SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
