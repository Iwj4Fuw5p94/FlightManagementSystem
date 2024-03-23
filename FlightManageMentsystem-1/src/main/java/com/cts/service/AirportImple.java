package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.entity.Airport;

public class AirportImple implements IAirport{
	@Autowired
	IAirport iAirport;
	
	@Override
	public List<Airport> viewAirports() {
		
		return null;
	}

	@Override
	public Airport viewAirport(String airportCode) {
		return null;
	}

}
