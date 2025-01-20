package com.cts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Airport;
import com.cts.service.AirportImple;



@RestController
@RequestMapping("/api/airport")
@CrossOrigin("*")
public class AirportController {
	
	private static final Logger logger=LoggerFactory.getLogger(AirportController.class);
	
	@Autowired
	AirportImple airportImple;
	
	@GetMapping("/viewAirports")
	public List<Airport> findAirports(){
		logger.info("view airport successfully run");
		return airportImple.viewAirports();
	}
	
	@GetMapping("/viewAirport{airportCode}")
	public Airport findAirport(@RequestBody @PathVariable String airportCode){
		logger.info("find airport successfully run");
		return airportImple.viewAirport(airportCode);
		
	}
	
	

}
