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
import org.springframework.web.bind.annotation.PostMapping;
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
	public Airport findAirport(@PathVariable String airportCode){
		logger.info("find airport successfully run");
		return airportImple.viewAirport(airportCode);
		
	}
	
	@PostMapping("/addairport")
	public Airport addairport(@RequestBody Airport airport) {
		if(airport==null) {
			throw new NullPointerException();	
		}
		return airportImple.addAirport(airport);
	}
}


//package com.cts.controller;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.cts.entity.Airport;
//import com.cts.service.AirportImple;
//
//@RestController
//@RequestMapping("/api/airport")
//@CrossOrigin("*")
//public class AirportController {
//    
//    private static final Logger logger = LoggerFactory.getLogger(AirportController.class);
//    
//    @Autowired
//    private AirportImple airportImple;
//    
//    @PostMapping("/addairport")
//    public ResponseEntity<?> addAirport(@RequestBody(required = true) Airport airport) {
//        // Validate input
//        if (airport == null) {
//            logger.error("Received null airport object");
//            return ResponseEntity
//                .badRequest()
//                .body("Airport details cannot be null");
//        }
//        
//        try {
//            // Log airport details before saving
//            logger.info("Attempting to add airport: {}", airport);
//            
//            // Save airport
//            Airport savedAirport = airportImple.addAirport(airport);
//            
//            // Return saved airport with created status
//            return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(savedAirport);
//        } catch (Exception e) {
//            // Log the full error
//            logger.error("Error adding airport", e);
//            
//            // Return internal server error
//            return ResponseEntity
//                .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .body("Failed to add airport: " + e.getMessage());
//        }
//    }
//}







































