package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.FlightDao;
import com.cts.entity.Flight;
import com.cts.exceptions.FlightNotFoundEXception;
@Service
@Transactional
public class FlightServiceImpl implements IFlightDao {
	
	@Autowired
	FlightDao flightDao;

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightDao.save(flight);
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightDao.save(flight);
	}

	@Override
	public Flight viewFlight(long flightNumber) throws FlightNotFoundEXception {
		// TODO Auto-generated method stub
		return flightDao.findById(flightNumber).orElseThrow(()->new FlightNotFoundEXception("flight not found"));
	}

	@Override
	public List<Flight> viewFlights() {
		return flightDao.findAll();
	}

	@Override
	public void deleteFlight(long flightNumber){
		flightDao.deleteById(flightNumber);
		
	}
	

}
