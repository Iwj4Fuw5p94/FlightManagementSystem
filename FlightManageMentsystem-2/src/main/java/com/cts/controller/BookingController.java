package com.cts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Booking;
import com.cts.exceptions.UserNotFoundException;
import com.cts.service.IBooking;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BookingController{
	
	private static final Logger logger=LoggerFactory.getLogger(BookingController.class);
	@Autowired
	IBooking iBooking;
	
	@PostMapping("/addBooking")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) throws UserNotFoundException{
		Booking booking2=iBooking.addBooking(booking);
		return ResponseEntity.status(HttpStatus.CREATED).body(booking2); 
	}
	
	@PutMapping("/modifyBooking")
	public ResponseEntity<Booking> modifyBooking(@RequestBody Booking booking){
		Booking booking2= iBooking.modifyBooking(booking);
		return ResponseEntity.status(HttpStatus.OK).body(booking2);
	}
	
	@GetMapping("/viewBooking")
	public ResponseEntity<List<Booking>> viewBooking(){
		List<Booking> booking= iBooking.viewBookings();
		return ResponseEntity.status(HttpStatus.OK).body(booking);	
	}
	
	@DeleteMapping("/deleteBooking{bookingId}")
	public ResponseEntity<String> deleteBooking(@PathVariable long bookingId){
	   iBooking.deleteBooking(bookingId);

		return ResponseEntity.status(HttpStatus.OK).body("Booking Delete Successfully");
	}
	
	
	
}
