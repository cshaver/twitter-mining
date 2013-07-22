package com.flightaware.flightxml.soap.FlightXML2;

public class FlightXML2SoapProxy implements com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap {
  private String _endpoint = null;
  private com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap flightXML2Soap = null;
  
  public FlightXML2SoapProxy() {
    _initFlightXML2SoapProxy();
  }
  
  public FlightXML2SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlightXML2SoapProxy();
  }
  
  private void _initFlightXML2SoapProxy() {
    try {
      flightXML2Soap = (new com.flightaware.flightxml.soap.FlightXML2.FlightXML2Locator()).getFlightXML2Soap();
      if (flightXML2Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flightXML2Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flightXML2Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flightXML2Soap != null)
      ((javax.xml.rpc.Stub)flightXML2Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap getFlightXML2Soap() {
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap;
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AircraftTypeResults aircraftType(com.flightaware.flightxml.soap.FlightXML2.AircraftTypeRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.aircraftType(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoResults airlineFlightInfo(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightInfoRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.airlineFlightInfo(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesResults airlineFlightSchedules(com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.airlineFlightSchedules(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AirlineInfoResults airlineInfo(com.flightaware.flightxml.soap.FlightXML2.AirlineInfoRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.airlineInfo(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AirlineInsightResults airlineInsight(com.flightaware.flightxml.soap.FlightXML2.AirlineInsightRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.airlineInsight(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AirportInfoResults airportInfo(com.flightaware.flightxml.soap.FlightXML2.AirportInfoRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.airportInfo(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AllAirlinesResults allAirlines(com.flightaware.flightxml.soap.FlightXML2.AllAirlinesRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.allAirlines(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.AllAirportsResults allAirports(com.flightaware.flightxml.soap.FlightXML2.AllAirportsRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.allAirports(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.ArrivedResults arrived(com.flightaware.flightxml.soap.FlightXML2.ArrivedRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.arrived(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckResults blockIdentCheck(com.flightaware.flightxml.soap.FlightXML2.BlockIdentCheckRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.blockIdentCheck(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsResults countAirportOperations(com.flightaware.flightxml.soap.FlightXML2.CountAirportOperationsRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.countAirportOperations(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsResults countAllEnrouteAirlineOperations(com.flightaware.flightxml.soap.FlightXML2.CountAllEnrouteAirlineOperationsRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.countAllEnrouteAirlineOperations(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteResults decodeFlightRoute(com.flightaware.flightxml.soap.FlightXML2.DecodeFlightRouteRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.decodeFlightRoute(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.DecodeRouteResults decodeRoute(com.flightaware.flightxml.soap.FlightXML2.DecodeRouteRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.decodeRoute(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.DeleteAlertResults deleteAlert(com.flightaware.flightxml.soap.FlightXML2.DeleteAlertRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.deleteAlert(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.DepartedResults departed(com.flightaware.flightxml.soap.FlightXML2.DepartedRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.departed(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.EnrouteResults enroute(com.flightaware.flightxml.soap.FlightXML2.EnrouteRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.enroute(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.FleetArrivedResults fleetArrived(com.flightaware.flightxml.soap.FlightXML2.FleetArrivedRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.fleetArrived(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.FleetScheduledResults fleetScheduled(com.flightaware.flightxml.soap.FlightXML2.FleetScheduledRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.fleetScheduled(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.FlightInfoResults flightInfo(com.flightaware.flightxml.soap.FlightXML2.FlightInfoRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.flightInfo(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.FlightInfoExResults flightInfoEx(com.flightaware.flightxml.soap.FlightXML2.FlightInfoExRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.flightInfoEx(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.GetAlertsResults getAlerts(com.flightaware.flightxml.soap.FlightXML2.GetAlertsRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.getAlerts(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.GetFlightIDResults getFlightID(com.flightaware.flightxml.soap.FlightXML2.GetFlightIDRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.getFlightID(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackResults getHistoricalTrack(com.flightaware.flightxml.soap.FlightXML2.GetHistoricalTrackRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.getHistoricalTrack(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.GetLastTrackResults getLastTrack(com.flightaware.flightxml.soap.FlightXML2.GetLastTrackRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.getLastTrack(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoResults inboundFlightInfo(com.flightaware.flightxml.soap.FlightXML2.InboundFlightInfoRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.inboundFlightInfo(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.InFlightInfoResults inFlightInfo(com.flightaware.flightxml.soap.FlightXML2.InFlightInfoRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.inFlightInfo(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceResults latLongsToDistance(com.flightaware.flightxml.soap.FlightXML2.LatLongsToDistanceRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.latLongsToDistance(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingResults latLongsToHeading(com.flightaware.flightxml.soap.FlightXML2.LatLongsToHeadingRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.latLongsToHeading(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.MapFlightResults mapFlight(com.flightaware.flightxml.soap.FlightXML2.MapFlightRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.mapFlight(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.MapFlightExResults mapFlightEx(com.flightaware.flightxml.soap.FlightXML2.MapFlightExRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.mapFlightEx(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.MetarResults metar(com.flightaware.flightxml.soap.FlightXML2.MetarRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.metar(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.MetarExResults metarEx(com.flightaware.flightxml.soap.FlightXML2.MetarExRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.metarEx(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.NTafResults NTaf(com.flightaware.flightxml.soap.FlightXML2.NTafRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.NTaf(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointResults registerAlertEndpoint(com.flightaware.flightxml.soap.FlightXML2.RegisterAlertEndpointRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.registerAlertEndpoint(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsResults routesBetweenAirports(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.routesBetweenAirports(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExResults routesBetweenAirportsEx(com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.routesBetweenAirportsEx(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.ScheduledResults scheduled(com.flightaware.flightxml.soap.FlightXML2.ScheduledRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.scheduled(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.SearchResults search(com.flightaware.flightxml.soap.FlightXML2.SearchRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.search(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightResults searchBirdseyeInFlight(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyeInFlightRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.searchBirdseyeInFlight(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsResults searchBirdseyePositions(com.flightaware.flightxml.soap.FlightXML2.SearchBirdseyePositionsRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.searchBirdseyePositions(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.SearchCountResults searchCount(com.flightaware.flightxml.soap.FlightXML2.SearchCountRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.searchCount(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.SetAlertResults setAlert(com.flightaware.flightxml.soap.FlightXML2.SetAlertRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.setAlert(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeResults setMaximumResultSize(com.flightaware.flightxml.soap.FlightXML2.SetMaximumResultSizeRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.setMaximumResultSize(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.TafResults taf(com.flightaware.flightxml.soap.FlightXML2.TafRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.taf(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.TailOwnerResults tailOwner(com.flightaware.flightxml.soap.FlightXML2.TailOwnerRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.tailOwner(parameters);
  }
  
  public com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoResults zipcodeInfo(com.flightaware.flightxml.soap.FlightXML2.ZipcodeInfoRequest parameters) throws java.rmi.RemoteException{
    if (flightXML2Soap == null)
      _initFlightXML2SoapProxy();
    return flightXML2Soap.zipcodeInfo(parameters);
  }
  
  
}