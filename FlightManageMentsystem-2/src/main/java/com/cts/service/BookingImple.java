package com.cts.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.FlightDao;
import com.cts.dao.IBookingDao;
import com.cts.dao.IScheduledFlightDao;
import com.cts.dao.IUserDao;
import com.cts.dao.UserInfoRepository;
import com.cts.entity.Booking;
import com.cts.entity.Flight;
import com.cts.exceptions.UserNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class BookingImple implements IBooking{
	
	private static final Logger logger=LoggerFactory.getLogger(BookingImple.class);
	
	@Autowired
	IBookingDao iBookingDao;
	@Autowired
	IUser iuser;
	
	@Autowired
	UserInfoRepository userRepository;
	
	@Autowired
	IScheduledFlightDao scheduleFlightRepository;
	
	@Autowired
	IUser iuserdao;
	
	@Autowired
	FlightDao flightRepository;
	
	 	@Transactional
	    @Override
	    public Booking addBooking(Booking booking) {	
	 		if (booking.getUserId() == null) {
//	 		    Long userId = booking.getUserId().getUserId();
	 			throw new UserNotFoundException("user id is null");		
	 		    // Proceed with using userId
	 		}
	 		Long userId = booking.getUserId().getUserId();
	 	    logger.info("User ID in booking object: " + userId);	 		
	 		if(iuserdao.viewUser(booking.getUserId().getUserId()).isEmpty()){
	 			System.out.println(booking.getUserId());
	 			throw new UserNotFoundException("user id not found"+userId);
	 		}
	 		System.out.println(booking.getUserId());
	 		
//	        // Check if the user exists
//	        if (!userRepository.existsById(booking.getUserId().getUserId())) {
//	            throw new IllegalArgumentException("User does not exist");
//	        }

//	         Check if the scheduled flight exists
//	        if (!scheduleFlightRepository.existsById(booking.getSchedule().getScheduleId())) {
//	            throw new IllegalArgumentException("Scheduled flight does not exist");
//	        }

	        // Merge the flight entity to reattach it to the persistence context
//	        Flight managedFlight = flightRepository.findById(booking.getFlight().getFlightNumber())
//	                .orElseThrow(() -> new IllegalArgumentException("Flight does not exist"));
//	        booking.setFlight(managedFlight);

	        // Save the booking if all checks pass
	 		logger.info("succefully executed");
	        return iBookingDao.save(booking);
	    }
	
//	@Override
//	public Booking addBooking(Booking booking) {
//		return iBookingDao.save(booking);
//	}

	@Override
	public Booking modifyBooking(Booking booking) {
		return iBookingDao.save(booking);
	}

	@Override
	public List<Booking> viewBookings() {
	
		return iBookingDao.findAll();
	}

	@Override
	public void deleteBooking(long bookingId) {
		iBookingDao.deleteById(bookingId);
		logger.info("delete booking successfully ");
	}

}
