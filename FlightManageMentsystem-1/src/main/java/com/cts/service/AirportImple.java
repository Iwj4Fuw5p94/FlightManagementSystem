package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.IAirportDao;
import com.cts.entity.Airport;
@Service
public class AirportImple implements IAirport{
	@Autowired
	IAirportDao iAirport;
	
	@Override
	public List<Airport> viewAirports() {
		
		return iAirport.findAll();
	}

	@Override
	public Airport viewAirport(String airportCode) {
		return iAirport.findByAirportCode(airportCode);
	}

}
