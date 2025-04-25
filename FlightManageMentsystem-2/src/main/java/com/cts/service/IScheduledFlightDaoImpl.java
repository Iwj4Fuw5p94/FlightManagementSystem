package com.cts.service;

import java.time.LocalDate;
import java.util.List;

import com.cts.entity.Airport;
import com.cts.entity.Flight;
import com.cts.entity.Schedule;
import com.cts.entity.ScheduleFlight;
import com.cts.exceptions.FlightNotFoundEXception;

public interface IScheduledFlightDaoImpl{
	
	public Schedule scheduleFlight(Schedule scheduleFlight);
	
	public List<Schedule> viewScheduleFlights(Airport aipAirportFrom,Airport airportTo,LocalDate localDate)throws FlightNotFoundEXception;
	
	public Schedule viewScheduleFlight(long flightNumber)throws FlightNotFoundEXception;
	
	public List<Schedule> viewScheduleFlights()throws FlightNotFoundEXception;
	
	public Schedule modifyScheduleFlight(Flight flight,Schedule schedule,long flightNumber);
	
//	doubt i have 
	public String deleteScheduleFlight(long flightNumber);
	
	
	
	
	
	
}
