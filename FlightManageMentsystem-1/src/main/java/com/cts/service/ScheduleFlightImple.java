	package com.cts.service;

import java.time.LocalDate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.IScheduledFlightDao;
import com.cts.entity.Airport;
import com.cts.entity.Flight;
import com.cts.entity.Schedule;
import com.cts.entity.ScheduleFlight;

@Service
public class ScheduleFlightImple implements IScheduledFlightDaoImpl{
	
	@Autowired
	IScheduledFlightDao iScheduledFlightDao;
	
	@Override
	public ScheduleFlight scheduleFlight(ScheduleFlight scheduleFlight) {
		
		return iScheduledFlightDao.save(scheduleFlight);
	}

	@Override
	public List<ScheduleFlight> viewScheduleFlights(Airport aipAirportFrom, Airport airportTo, LocalDate localDate) {
		return null;
	}

	@Override
	public ScheduleFlight viewScheduleFlight(long flightNumber) {
		
		return iScheduledFlightDao.findById(flightNumber).orElse(null);
	}

	@Override
	public List<ScheduleFlight> viewScheduleFlights() {
		return iScheduledFlightDao.findAll();
	}

	@Override
	public ScheduleFlight modifyScheduleFlight(Flight flight, Schedule schedule, long flightNumber) {

		return null;
	}

	@Override
	public ScheduleFlight deleteScheduleFlight(Flight flightNumber) {
		return null;
	}

	

}
