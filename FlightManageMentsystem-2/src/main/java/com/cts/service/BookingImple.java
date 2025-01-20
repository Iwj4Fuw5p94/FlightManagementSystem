package com.cts.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.IBookingDao;
import com.cts.entity.Booking;

@Service
public class BookingImple implements IBooking{
	
	private static final Logger logger=LoggerFactory.getLogger(BookingImple.class);
	
	@Autowired
	IBookingDao iBookingDao;
	

	@Override
	public Booking addBooking(Booking booking) {
	
		return iBookingDao.save(booking);
	}

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
