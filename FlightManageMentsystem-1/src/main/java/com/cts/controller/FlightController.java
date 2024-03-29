package com.cts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Flight;
import com.cts.exceptions.FlightNotFoundEXception;
import com.cts.service.FlightServiceImpl;
import com.cts.service.IFlightDao;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class FlightController {
	
	Logger logger=LoggerFactory.getLogger(FlightController.class);
	@Autowired
	IFlightDao iFlightDao;
	
	@PostMapping("/addFlight")
	public ResponseEntity<String> addFlight(Flight flight){
		iFlightDao.addFlight(flight);
		logger.info("add flight to the database");
		return ResponseEntity.status(HttpStatus.CREATED).body("Flight Added Successfully");
	}
	
	@PutMapping("/modifyFlight")
	public ResponseEntity<Flight> modifyFlight(Flight flight){
		Flight flight2 = iFlightDao.modifyFlight(flight);
		return ResponseEntity.status(HttpStatus.OK).body(flight2);
	}
	
	@GetMapping("/viewFlight")
	public ResponseEntity<Flight> viewFlight(@PathVariable long flightNumber) throws FlightNotFoundEXception{
		Flight flight= iFlightDao.viewFlight(flightNumber);
		return ResponseEntity.status(HttpStatus.OK).body(flight);
	}
	
	
	@GetMapping("/viewFlights")
	public ResponseEntity<List<Flight>> viewFlights(){
		List<Flight> flight2 =iFlightDao.viewFlights();
		return ResponseEntity.status(HttpStatus.OK).body(flight2);
	}

	@DeleteMapping("/deleteFlight/{flightNumber}")
	public ResponseEntity<String> deleteFlight(@PathVariable long flightNumber) {
	    iFlightDao.deleteFlight(flightNumber);
	    return ResponseEntity.status(HttpStatus.OK).body("Flight Deleted Successfully");
	}


}
