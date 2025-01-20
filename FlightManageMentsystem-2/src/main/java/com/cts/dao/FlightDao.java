package com.cts.dao;

import java.util.List;import org.hibernate.type.TrueFalseConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.entity.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight,Long> {
//	@Query(value ='select * from Flights where ',nativeQuery = true)
//	public List<Flight> searchFlight(String from,String to); 
	
}
