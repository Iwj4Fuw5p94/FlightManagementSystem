package com.cts.service;

import java.time.LocalDate;
import java.util.List;

import com.cts.entity.Airport;
import com.cts.entity.Flight;
import com.cts.entity.Schedule;
import com.cts.entity.ScheduleFlight;

public class ScheduleFlightImple implements IScheduledFlightDaoImpl{

	@Override
	public ScheduleFlight scheduleFlight(ScheduleFlight scheduleFlight) {
		return null;
	}

	@Override
	public List<ScheduleFlight> viewScheduleFlights(Airport aipAirportFrom, Airport airportTo, LocalDate localDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduleFlight> viewScheduleFlight(long flightNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduleFlight> viewScheduleFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScheduleFlight modifyScheduleFlight(Flight flight, Schedule schedule, long flightNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteScheduleFlight(Flight flightNumber) {
		// TODO Auto-generated method stub
		
	}

}
