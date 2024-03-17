package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Airport;

@Repository
public interface IAirportDao extends JpaRepository<Airport,Long>{
	

}
