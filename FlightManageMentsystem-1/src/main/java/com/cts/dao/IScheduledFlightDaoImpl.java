package com.cts.dao;

import java.time.LocalDate;
import java.util.List;

import com.cts.entity.Airport;
import com.cts.entity.Flight;
import com.cts.entity.Schedule;
import com.cts.entity.ScheduleFlight;

public interface IScheduledFlightDaoImpl{
	
	public ScheduleFlight scheduleFlight(ScheduleFlight scheduleFlight);
	
	public List<ScheduleFlight> viewScheduleFlights(Airport aipAirportFrom,Airport airportTo,LocalDate localDate);
	
	public List<ScheduleFlight> viewScheduleFlight(long flightNumber);
	
	public List<ScheduleFlight> viewScheduleFlights();
	
	public ScheduleFlight modifyScheduleFlight(Flight flight,Schedule schedule,long flightNumber);
	
	public void deleteScheduleFlight(Flight flightNumber);
	
	
	
	
	
	
}
