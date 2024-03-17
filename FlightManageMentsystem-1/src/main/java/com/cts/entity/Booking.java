package com.cts.entity;

import java.time.LocalDate;
import java.util.List;


import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

//@Entity
public class Booking {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingId;
	@OneToOne(cascade = CascadeType.ALL)
	private User userId;
	
	private LocalDate bookingDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pnrNumber")
	
	
	private List<Passanger> passangerList;
	
	private double ticketCost;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightNumber")
	private Flight flight;
	
	private long noOfPassangers;
	
	public Booking() {
		
	}

	public Booking(long bookingId, User userId, LocalDate bookingDate, List<Passanger> passangerList, double ticketCost,
			Flight flight, long noOfPassangers) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.passangerList = passangerList;
		this.ticketCost = ticketCost;
		this.flight = flight;
		this.noOfPassangers = noOfPassangers;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public List<Passanger> getPassangerList() {
		return passangerList;
	}

	public void setPassangerList(List<Passanger> passangerList) {
		this.passangerList = passangerList;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public long getNoOfPassangers() {
		return noOfPassangers;
	}

	public void setNoOfPassangers(long noOfPassangers) {
		this.noOfPassangers = noOfPassangers;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
				+ ", passangerList=" + passangerList + ", ticketCost=" + ticketCost + ", flight=" + flight
				+ ", noOfPassangers=" + noOfPassangers + "]";
	}
	
		

}
