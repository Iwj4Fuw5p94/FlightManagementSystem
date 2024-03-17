package com.cts.service;

import java.time.LocalDate;
import java.util.List;

import com.cts.entity.Airport;
import com.cts.entity.Flight;
import com.cts.entity.Schedule;
import com.cts.entity.ScheduleFlight;
import com.cts.exceptions.FlightNotFoundEXception;

public interface IScheduledFlightDaoImpl{
	
	public ScheduleFlight scheduleFlight(ScheduleFlight scheduleFlight);
	
	public List<ScheduleFlight> viewScheduleFlights(Airport aipAirportFrom,Airport airportTo,LocalDate localDate)throws FlightNotFoundEXception;
	
	public List<ScheduleFlight> viewScheduleFlight(long flightNumber)throws FlightNotFoundEXception;
	
	public List<ScheduleFlight> viewScheduleFlights()throws FlightNotFoundEXception;
	
	public ScheduleFlight modifyScheduleFlight(Flight flight,Schedule schedule,long flightNumber);
	
	public void deleteScheduleFlight(Flight flightNumber);
	
	
	
	
	
	
}
