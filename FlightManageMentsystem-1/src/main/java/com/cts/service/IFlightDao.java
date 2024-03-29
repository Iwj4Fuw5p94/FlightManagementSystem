package com.cts.service;

import java.util.List;

import com.cts.entity.Flight;
import com.cts.exceptions.FlightNotFoundEXception;

public interface IFlightDao {
public Flight addFlight(Flight flight);
	
	public Flight modifyFlight(Flight flight);
	
	public Flight viewFlight(long flightNumber) throws FlightNotFoundEXception;
	
	public List<Flight> viewFlights();
	
	public void deleteFlight(long flightNumber);
		

}
