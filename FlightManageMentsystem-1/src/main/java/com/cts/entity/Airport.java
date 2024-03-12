package com.cts.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long airportno;
	
	private String airportName;
	
	private String airportCode;
	
	private String airportLocation;
	
	
	public Airport() {
	}
	
	
	public Airport(String airportName, String airportCode, String airportLocation) {
		super();
		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
	}


	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}


	@Override
	public String toString() {
		return "Airport [airportName=" + airportName + ", airportCode=" + airportCode + ", airportLocation="
				+ airportLocation + "]";
	}
		

}
