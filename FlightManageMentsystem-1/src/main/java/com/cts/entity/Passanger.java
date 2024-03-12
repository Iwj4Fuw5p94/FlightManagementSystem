package com.cts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passanger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long pnrNumber;
	private String passangerName;
	private long passangerAge;
	private long passangerUIN;
	private double luggage;
	
	
	public Passanger() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Passanger(long pnrNumber, String passangerName, long passangerAge, long passangerUIN, double luggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passangerName = passangerName;
		this.passangerAge = passangerAge;
		this.passangerUIN = passangerUIN;
		this.luggage = luggage;
	}


	public long getPnrNumber() {
		return pnrNumber;
	}


	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}


	public String getPassangerName() {
		return passangerName;
	}


	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}


	public long getPassangerAge() {
		return passangerAge;
	}


	public void setPassangerAge(long passangerAge) {
		this.passangerAge = passangerAge;
	}


	public long getPassangerUIN() {
		return passangerUIN;
	}


	public void setPassangerUIN(long passangerUIN) {
		this.passangerUIN = passangerUIN;
	}


	public double getLuggage() {
		return luggage;
	}


	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}


	@Override
	public String toString() {
		return "Passanger [pnrNumber=" + pnrNumber + ", passangerName=" + passangerName + ", passangerAge="
				+ passangerAge + ", passangerUIN=" + passangerUIN + ", luggage=" + luggage + "]";
	}
	
	

}
