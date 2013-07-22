/**
 * FlightXML2SoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public class FlightXML2SoapStub extends org.apache.axis.client.Stub implements com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[47];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AircraftType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AircraftTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AircraftTypeRequest"), com.flightaware.flightxml.soap.FlightXML2.AircraftTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AircraftTypeResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AircraftTypeResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AirlineFlightInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoRequest"), com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AirlineFlightSchedules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesRequest"), com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AirlineInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoRequest"), com.flightaware.flightxml.soap.FlightXML2.AirlineInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AirlineInsight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightRequest"), com.flightaware.flightxml.soap.FlightXML2.AirlineInsightRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AirportInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoRequest"), com.flightaware.flightxml.soap.FlightXML2.AirportInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllAirlines");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesRequest"), com.flightaware.flightxml.soap.FlightXML2.AllAirlinesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllAirports");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsRequest"), com.flightaware.flightxml.soap.FlightXML2.AllAirportsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Arrived");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedRequest"), com.flightaware.flightxml.soap.FlightXML2.ArrivedRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.ArrivedResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BlockIdentCheck");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "BlockIdentCheckRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "BlockIdentCheckRequest"), com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "BlockIdentCheckResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "BlockIdentCheckResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CountAirportOperations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsRequest"), com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CountAllEnrouteAirlineOperations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAllEnrouteAirlineOperationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAllEnrouteAirlineOperationsRequest"), com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAllEnrouteAirlineOperationsResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAllEnrouteAirlineOperationsResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DecodeFlightRoute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteRequest"), com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DecodeRoute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeRouteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeRouteRequest"), com.flightaware.flightxml.soap.FlightXML2.DecodeRouteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeRouteResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeRouteResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAlert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DeleteAlertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DeleteAlertRequest"), com.flightaware.flightxml.soap.FlightXML2.DeleteAlertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DeleteAlertResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DeleteAlertResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Departed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartedRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartedRequest"), com.flightaware.flightxml.soap.FlightXML2.DepartedRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartedResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.DepartedResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartedResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Enroute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteRequest"), com.flightaware.flightxml.soap.FlightXML2.EnrouteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.EnrouteResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FleetArrived");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetArrivedRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetArrivedRequest"), com.flightaware.flightxml.soap.FlightXML2.FleetArrivedRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetArrivedResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetArrivedResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FleetScheduled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetScheduledRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetScheduledRequest"), com.flightaware.flightxml.soap.FlightXML2.FleetScheduledRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetScheduledResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetScheduledResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FlightInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoRequest"), com.flightaware.flightxml.soap.FlightXML2.FlightInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FlightInfoEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoExRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoExRequest"), com.flightaware.flightxml.soap.FlightXML2.FlightInfoExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoExResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoExResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAlerts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetAlertsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetAlertsRequest"), com.flightaware.flightxml.soap.FlightXML2.GetAlertsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetAlertsResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetAlertsResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFlightID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetFlightIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetFlightIDRequest"), com.flightaware.flightxml.soap.FlightXML2.GetFlightIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetFlightIDResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetFlightIDResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHistoricalTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetHistoricalTrackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetHistoricalTrackRequest"), com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetHistoricalTrackResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetHistoricalTrackResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLastTrack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetLastTrackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetLastTrackRequest"), com.flightaware.flightxml.soap.FlightXML2.GetLastTrackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetLastTrackResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetLastTrackResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InboundFlightInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoRequest"), com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InFlightInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoRequest"), com.flightaware.flightxml.soap.FlightXML2.InFlightInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LatLongsToDistance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToDistanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToDistanceRequest"), com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToDistanceResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToDistanceResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LatLongsToHeading");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingRequest"), com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MapFlight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightRequest"), com.flightaware.flightxml.soap.FlightXML2.MapFlightRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.MapFlightResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MapFlightEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightExRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightExRequest"), com.flightaware.flightxml.soap.FlightXML2.MapFlightExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightExResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightExResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Metar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarRequest"), com.flightaware.flightxml.soap.FlightXML2.MetarRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.MetarResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MetarEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarExRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarExRequest"), com.flightaware.flightxml.soap.FlightXML2.MetarExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarExResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.MetarExResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarExResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NTaf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "NTafRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "NTafRequest"), com.flightaware.flightxml.soap.FlightXML2.NTafRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "NTafResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.NTafResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "NTafResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RegisterAlertEndpoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointRequest"), com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoutesBetweenAirports");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsRequest"), com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoutesBetweenAirportsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExRequest"), com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledRequest"), com.flightaware.flightxml.soap.FlightXML2.ScheduledRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.ScheduledResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchRequest"), com.flightaware.flightxml.soap.FlightXML2.SearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.SearchResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchBirdseyeInFlight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightRequest"), com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchBirdseyePositions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsRequest"), com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchCountRequest"), com.flightaware.flightxml.soap.FlightXML2.SearchCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchCountResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.SearchCountResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchCountResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAlert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetAlertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetAlertRequest"), com.flightaware.flightxml.soap.FlightXML2.SetAlertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetAlertResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.SetAlertResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetAlertResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetMaximumResultSize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetMaximumResultSizeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetMaximumResultSizeRequest"), com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetMaximumResultSizeResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetMaximumResultSizeResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Taf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafRequest"), com.flightaware.flightxml.soap.FlightXML2.TafRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.TafResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TailOwner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerRequest"), com.flightaware.flightxml.soap.FlightXML2.TailOwnerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ZipcodeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoRequest"), com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoResults"));
        oper.setReturnClass(com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoResults"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

    }

    public FlightXML2SoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FlightXML2SoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FlightXML2SoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AircraftTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AircraftTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AircraftTypeResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AircraftTypeStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AircraftTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightSchedulesResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineFlightScheduleStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineFlightScheduleStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineInsightRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirlineInsightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirportInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AirportInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AirportInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AllAirlinesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirlinesResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AllAirportsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "AllAirportsResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfAirlineFlightScheduleStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineFlightScheduleStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfAirlineInsightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineInsightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfCountAirlineOperationsStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.CountAirlineOperationsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirlineOperationsStruct");
            qName2 = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfFlightRouteStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrayOfFlightRouteStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfMetarStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrayOfMetarStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfRoutesBetweenAirportsExStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrayOfRoutesBetweenAirportsExStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfRoutesBetweenAirportsStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsStruct");
            qName2 = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfTrackExStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrayOfTrackExStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrayOfTrackStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TrackStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TrackStruct");
            qName2 = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivalFlightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrivalFlightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivalStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrivalStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrivedRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ArrivedResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ArrivedResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "BlockIdentCheckRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "BlockIdentCheckResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirlineOperationsStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.CountAirlineOperationsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAirportOperationsStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAllEnrouteAirlineOperationsRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "CountAllEnrouteAirlineOperationsResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeFlightRouteResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeRouteRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DecodeRouteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DecodeRouteResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DeleteAlertRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DeleteAlertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DeleteAlertResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartedRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DepartedRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartedResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DepartedResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartureFlightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DepartureFlightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "DepartureStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.DepartureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteFlightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.EnrouteFlightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.EnrouteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.EnrouteResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "EnrouteStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.EnrouteStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetArrivedRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FleetArrivedRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetArrivedResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetScheduledRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FleetScheduledRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FleetScheduledResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertChannel");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightAlertChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertEntry");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightAlertEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightAlertListing");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightAlertListing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightExStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightExStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoExRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightInfoExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoExResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoExStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightInfoExStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightRouteStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightRouteStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "FlightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.FlightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetAlertsRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetAlertsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetAlertsResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetFlightIDRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetFlightIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetFlightIDResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetHistoricalTrackRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetHistoricalTrackResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetLastTrackRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetLastTrackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "GetLastTrackResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InboundFlightInfoResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightAircraftStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.InFlightAircraftStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.InFlightInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightInfoResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "InFlightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.InFlightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToDistanceRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToDistanceResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "LatLongsToHeadingResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightExRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MapFlightExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightExResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MapFlightRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MapFlightResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MapFlightResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarExRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MetarExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarExResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MetarExResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MetarRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MetarResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "MetarStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.MetarStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "NTafRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.NTafRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "NTafResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.NTafResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RegisterAlertEndpointResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsExStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "RoutesBetweenAirportsStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledFlightStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ScheduledFlightStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ScheduledRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ScheduledResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ScheduledStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ScheduledStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyeInFlightResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchBirdseyePositionsResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchCountRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchCountResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchCountResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SearchResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SearchResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetAlertRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SetAlertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetAlertResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SetAlertResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetMaximumResultSizeRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "SetMaximumResultSizeResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TafRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TafResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TafStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TafStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TailOwnerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TailOwnerStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TailOwnerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TrackExStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TrackExStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "TrackStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.TrackStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoResults");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://flightxml.flightaware.com/soap/FlightXML2", "ZipcodeInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults aircraftType(com.flightaware.flightxml.soap.FlightXML2.AircraftTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AircraftType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AircraftType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults airlineFlightInfo(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AirlineFlightInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AirlineFlightInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults airlineFlightSchedules(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AirlineFlightSchedules");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AirlineFlightSchedules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults airlineInfo(com.flightaware.flightxml.soap.FlightXML2.AirlineInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AirlineInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AirlineInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults airlineInsight(com.flightaware.flightxml.soap.FlightXML2.AirlineInsightRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AirlineInsight");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AirlineInsight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults airportInfo(com.flightaware.flightxml.soap.FlightXML2.AirportInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AirportInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AirportInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults allAirlines(com.flightaware.flightxml.soap.FlightXML2.AllAirlinesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AllAirlines");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AllAirlines"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults allAirports(com.flightaware.flightxml.soap.FlightXML2.AllAirportsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:AllAirports");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AllAirports"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.ArrivedResults arrived(com.flightaware.flightxml.soap.FlightXML2.ArrivedRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:Arrived");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Arrived"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.ArrivedResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.ArrivedResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.ArrivedResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults blockIdentCheck(com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:BlockIdentCheck");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BlockIdentCheck"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults countAirportOperations(com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:CountAirportOperations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CountAirportOperations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults countAllEnrouteAirlineOperations(com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:CountAllEnrouteAirlineOperations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CountAllEnrouteAirlineOperations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults decodeFlightRoute(com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:DecodeFlightRoute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DecodeFlightRoute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults decodeRoute(com.flightaware.flightxml.soap.FlightXML2.DecodeRouteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:DecodeRoute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DecodeRoute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults deleteAlert(com.flightaware.flightxml.soap.FlightXML2.DeleteAlertRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:DeleteAlert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAlert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.DepartedResults departed(com.flightaware.flightxml.soap.FlightXML2.DepartedRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:Departed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Departed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.DepartedResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.DepartedResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.DepartedResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.EnrouteResults enroute(com.flightaware.flightxml.soap.FlightXML2.EnrouteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:Enroute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Enroute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.EnrouteResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.EnrouteResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.EnrouteResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults fleetArrived(com.flightaware.flightxml.soap.FlightXML2.FleetArrivedRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:FleetArrived");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FleetArrived"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults fleetScheduled(com.flightaware.flightxml.soap.FlightXML2.FleetScheduledRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:FleetScheduled");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FleetScheduled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults flightInfo(com.flightaware.flightxml.soap.FlightXML2.FlightInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:FlightInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FlightInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults flightInfoEx(com.flightaware.flightxml.soap.FlightXML2.FlightInfoExRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:FlightInfoEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FlightInfoEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults getAlerts(com.flightaware.flightxml.soap.FlightXML2.GetAlertsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:GetAlerts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAlerts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults getFlightID(com.flightaware.flightxml.soap.FlightXML2.GetFlightIDRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:GetFlightID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetFlightID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults getHistoricalTrack(com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:GetHistoricalTrack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetHistoricalTrack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults getLastTrack(com.flightaware.flightxml.soap.FlightXML2.GetLastTrackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:GetLastTrack");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLastTrack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults inboundFlightInfo(com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:InboundFlightInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "InboundFlightInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults inFlightInfo(com.flightaware.flightxml.soap.FlightXML2.InFlightInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:InFlightInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "InFlightInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults latLongsToDistance(com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:LatLongsToDistance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LatLongsToDistance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults latLongsToHeading(com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:LatLongsToHeading");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LatLongsToHeading"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.MapFlightResults mapFlight(com.flightaware.flightxml.soap.FlightXML2.MapFlightRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:MapFlight");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MapFlight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.MapFlightResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.MapFlightResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.MapFlightResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults mapFlightEx(com.flightaware.flightxml.soap.FlightXML2.MapFlightExRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:MapFlightEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MapFlightEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.MetarResults metar(com.flightaware.flightxml.soap.FlightXML2.MetarRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:Metar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Metar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.MetarResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.MetarResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.MetarResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.MetarExResults metarEx(com.flightaware.flightxml.soap.FlightXML2.MetarExRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:MetarEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MetarEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.MetarExResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.MetarExResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.MetarExResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.NTafResults NTaf(com.flightaware.flightxml.soap.FlightXML2.NTafRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:NTaf");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NTaf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.NTafResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.NTafResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.NTafResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults registerAlertEndpoint(com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:RegisterAlertEndpoint");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RegisterAlertEndpoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults routesBetweenAirports(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:RoutesBetweenAirports");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RoutesBetweenAirports"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults routesBetweenAirportsEx(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:RoutesBetweenAirportsEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RoutesBetweenAirportsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.ScheduledResults scheduled(com.flightaware.flightxml.soap.FlightXML2.ScheduledRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:Scheduled");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Scheduled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.ScheduledResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.ScheduledResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.ScheduledResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.SearchResults search(com.flightaware.flightxml.soap.FlightXML2.SearchRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:Search");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.SearchResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults searchBirdseyeInFlight(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:SearchBirdseyeInFlight");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchBirdseyeInFlight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults searchBirdseyePositions(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:SearchBirdseyePositions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchBirdseyePositions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.SearchCountResults searchCount(com.flightaware.flightxml.soap.FlightXML2.SearchCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:SearchCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchCountResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.SearchCountResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.SearchCountResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.SetAlertResults setAlert(com.flightaware.flightxml.soap.FlightXML2.SetAlertRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:SetAlert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetAlert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.SetAlertResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.SetAlertResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.SetAlertResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults setMaximumResultSize(com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:SetMaximumResultSize");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetMaximumResultSize"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.TafResults taf(com.flightaware.flightxml.soap.FlightXML2.TafRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:Taf");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Taf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.TafResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.TafResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.TafResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults tailOwner(com.flightaware.flightxml.soap.FlightXML2.TailOwnerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:TailOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TailOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults zipcodeInfo(com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FlightXML2:ZipcodeInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ZipcodeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
