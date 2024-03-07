package com.cts.dao;

import java.util.List;

import com.cts.entity.Airport;

public interface IAirportDaoImpl{
	
	public List<Airport> viewAirports();
	
	public Airport viewAirport(String airportCode);

}
