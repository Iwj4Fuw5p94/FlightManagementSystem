package com.cts.service;

import java.util.List;

import com.cts.entity.Booking;

public interface IBookingDao{
	
	public Booking addBooking(Booking booking);
	
	public Booking modifyBooking(Booking booking);
	
	public List<Booking> viewBookings();
	
	public void deleteBooking(long bookingId);
	
	
	
	
}
