package com.cts.controller;

import java.util.List;

import org.hibernate.annotations.ValueGenerationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.IScheduledFlightDao;
import com.cts.entity.Schedule;
import com.cts.entity.ScheduleFlight;
import com.cts.exceptions.FlightNotFoundEXception;
import com.cts.service.IScheduledFlightDaoImpl;

@RestController
@RequestMapping("/api/scheduleflight")
@CrossOrigin("*")
public class ScheduleFlightController {
	
	
	@Autowired
	IScheduledFlightDaoImpl iScheduledFlightDaoImpl;
	
	@PostMapping("/add")
	public Schedule scheduleFlight(@RequestBody Schedule scheduleFlight){
		return iScheduledFlightDaoImpl.scheduleFlight(scheduleFlight);	
	}
	
	@GetMapping("/viewScheduleFlights")
	public List<Schedule> viewScheduleFlights() throws FlightNotFoundEXception{
		return iScheduledFlightDaoImpl.viewScheduleFlights();
	}
	
	@GetMapping("/viewScheduleFlight{flightNumber}")
	public Schedule viewScheduleFlight(@PathVariable long flightNumber) throws FlightNotFoundEXception{
		return iScheduledFlightDaoImpl.viewScheduleFlight(flightNumber);
	}
	
}
