package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.IScheduledFlightDao;

@RestController
@RequestMapping("/api/scheduleflight")
public class ScheduleFlightController {
	
	
	@Autowired
	IScheduledFlightDao iScheduledFlightDao;
	
	@PostMapping("/scheduleFlight")
	public ResponseEntity<String> scheduleFlight(){
		return null;
		
	}
	
	

}
