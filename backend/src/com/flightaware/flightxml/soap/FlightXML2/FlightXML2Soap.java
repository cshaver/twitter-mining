/**
 * FlightXML2Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.flightaware.flightxml.soap.FlightXML2;

public interface FlightXML2Soap extends java.rmi.Remote {
    public com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults aircraftType(com.flightaware.flightxml.soap.FlightXML2.AircraftTypeRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults airlineFlightInfo(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults airlineFlightSchedules(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults airlineInfo(com.flightaware.flightxml.soap.FlightXML2.AirlineInfoRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults airlineInsight(com.flightaware.flightxml.soap.FlightXML2.AirlineInsightRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults airportInfo(com.flightaware.flightxml.soap.FlightXML2.AirportInfoRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults allAirlines(com.flightaware.flightxml.soap.FlightXML2.AllAirlinesRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults allAirports(com.flightaware.flightxml.soap.FlightXML2.AllAirportsRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.ArrivedResults arrived(com.flightaware.flightxml.soap.FlightXML2.ArrivedRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults blockIdentCheck(com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults countAirportOperations(com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults countAllEnrouteAirlineOperations(com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults decodeFlightRoute(com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults decodeRoute(com.flightaware.flightxml.soap.FlightXML2.DecodeRouteRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults deleteAlert(com.flightaware.flightxml.soap.FlightXML2.DeleteAlertRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.DepartedResults departed(com.flightaware.flightxml.soap.FlightXML2.DepartedRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.EnrouteResults enroute(com.flightaware.flightxml.soap.FlightXML2.EnrouteRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults fleetArrived(com.flightaware.flightxml.soap.FlightXML2.FleetArrivedRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults fleetScheduled(com.flightaware.flightxml.soap.FlightXML2.FleetScheduledRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults flightInfo(com.flightaware.flightxml.soap.FlightXML2.FlightInfoRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults flightInfoEx(com.flightaware.flightxml.soap.FlightXML2.FlightInfoExRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults getAlerts(com.flightaware.flightxml.soap.FlightXML2.GetAlertsRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults getFlightID(com.flightaware.flightxml.soap.FlightXML2.GetFlightIDRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults getHistoricalTrack(com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults getLastTrack(com.flightaware.flightxml.soap.FlightXML2.GetLastTrackRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults inboundFlightInfo(com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults inFlightInfo(com.flightaware.flightxml.soap.FlightXML2.InFlightInfoRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults latLongsToDistance(com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults latLongsToHeading(com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.MapFlightResults mapFlight(com.flightaware.flightxml.soap.FlightXML2.MapFlightRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults mapFlightEx(com.flightaware.flightxml.soap.FlightXML2.MapFlightExRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.MetarResults metar(com.flightaware.flightxml.soap.FlightXML2.MetarRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.MetarExResults metarEx(com.flightaware.flightxml.soap.FlightXML2.MetarExRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.NTafResults NTaf(com.flightaware.flightxml.soap.FlightXML2.NTafRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults registerAlertEndpoint(com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults routesBetweenAirports(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults routesBetweenAirportsEx(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.ScheduledResults scheduled(com.flightaware.flightxml.soap.FlightXML2.ScheduledRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.SearchResults search(com.flightaware.flightxml.soap.FlightXML2.SearchRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults searchBirdseyeInFlight(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults searchBirdseyePositions(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.SearchCountResults searchCount(com.flightaware.flightxml.soap.FlightXML2.SearchCountRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.SetAlertResults setAlert(com.flightaware.flightxml.soap.FlightXML2.SetAlertRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults setMaximumResultSize(com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.TafResults taf(com.flightaware.flightxml.soap.FlightXML2.TafRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults tailOwner(com.flightaware.flightxml.soap.FlightXML2.TailOwnerRequest parameters) throws java.rmi.RemoteException;
    public com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults zipcodeInfo(com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoRequest parameters) throws java.rmi.RemoteException;
}
