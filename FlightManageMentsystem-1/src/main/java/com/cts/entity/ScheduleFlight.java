package com.cts.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class ScheduleFlight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long scheduleFlightId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Flight flight;
	
	private long availableSeats;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Schedule schedule;
	
	public ScheduleFlight() {
		

	}

	
	
	public ScheduleFlight(Flight flight, long availableSeats, Schedule schedule) {
		super();
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}



	@Override
	public String toString() {
		return "ScheduleFlight [flight=" + flight + ", availableSeats=" + availableSeats + ", schedule=" + schedule
				+ "]";
	}



	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public long getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(long availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	

}
