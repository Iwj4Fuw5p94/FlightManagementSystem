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
	public Schedule scheduleFlight(Schedule scheduleFlight) {
		return iScheduledFlightDao.save(scheduleFlight);
	}
	
	@Override
	public List<Schedule> viewScheduleFlights(Airport aipAirportFrom, Airport airportTo, LocalDate localDate) {
		return null;
	}

	@Override
	public Schedule viewScheduleFlight(long flightNumber) {
		
		return iScheduledFlightDao.findById(flightNumber).orElse(null);
	}

	@Override
	public List<Schedule> viewScheduleFlights() {
		return iScheduledFlightDao.findAll();
	}

	@Override
	public Schedule modifyScheduleFlight(Flight flight, Schedule schedule, long flightNumber) {

		return null;
	}

	@Override
	public String deleteScheduleFlight(long flightNumber) {
			iScheduledFlightDao.deleteById(flightNumber);
			return "Flight deleted successfully";
	}

	

}
