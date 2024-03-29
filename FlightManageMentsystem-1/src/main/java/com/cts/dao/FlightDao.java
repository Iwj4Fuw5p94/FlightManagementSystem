package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight,Long> {
	
	
}
