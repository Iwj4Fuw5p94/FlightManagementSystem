package com.cts.service;

import java.util.List;

import com.cts.entity.Airport;
import com.cts.exceptions.AirportNotFoundException;

public interface IAirport{
	
	public List<Airport> viewAirports();
	
	public Airport viewAirport(String airportCode)throws AirportNotFoundException;

}
