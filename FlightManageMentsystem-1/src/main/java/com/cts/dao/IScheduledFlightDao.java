package com.cts.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.entity.Airport;
import com.cts.entity.Flight;
import com.cts.entity.Schedule;
import com.cts.entity.ScheduleFlight;
import com.cts.exceptions.FlightNotFoundEXception;

@Repository
public interface IScheduledFlightDao extends JpaRepository<ScheduleFlight, Long> {
	
	
	@Query(value = "SELECT * FROM ScheduleFlight s " +
              "JOIN schedule sc ON s.schedule_id = sc.id " +
              "WHERE sc.source_airport_id = :sourceAirportId " +
              "AND sc.destination_airport_id = :destinationAirportId " +
              "AND sc.departure_time >= :departureDate", nativeQuery = true)
	
     public List<ScheduleFlight> viewScheduleFlights(long sourceAirportId, long destinationAirportId, LocalDate departureDate) throws FlightNotFoundEXception;
}
