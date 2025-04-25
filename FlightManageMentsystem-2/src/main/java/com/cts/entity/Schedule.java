//package com.cts.entity;
//
//import java.time.LocalDate;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//
//@Entity(name="schedule")
//public class Schedule {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long schedduleId;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	private Airport sourceAirport;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	private Airport destinationAirport;
//	private LocalDate arrivalTime;
//	private LocalDate departureTime;
//	
//	public Schedule() {
//	}
//	
//	public Schedule(Airport sourceAirport, Airport destinationAirport, LocalDate arrivalTime, LocalDate departureTime) {
//		super();
//		this.sourceAirport = sourceAirport;
//		this.destinationAirport = destinationAirport;
//		this.arrivalTime = arrivalTime;
//		this.departureTime = departureTime;
//	}
//	
//	
//	public void setScheduleId(long scheduleId) {
//		this.schedduleId=scheduleId;
//	}
//	public long getScheduleId() {
//		return schedduleId;
//	}
//
//	public Airport getSourceAirport() {
//		return sourceAirport;
//	}
//	public void setSourceAirport(Airport sourceAirport) {
//		this.sourceAirport = sourceAirport;
//	}
//	public Airport getDestinationAirport() {
//		return destinationAirport;
//	}
//	public void setDestinationAirport(Airport destinationAirport) {
//		this.destinationAirport = destinationAirport;
//	}
//	public LocalDate getArrivalTime() {
//		return arrivalTime;
//	}
//	public void setArrivalTime(LocalDate arrivalTime) {
//		this.arrivalTime = arrivalTime;
//	}
//	public LocalDate getDepartureTime() {
//		return departureTime;
//	}
//	public void setDepartureTime(LocalDate departureTime) {
//		this.departureTime = departureTime;
//	}
//
//	@Override
//	public String toString() {
//		return "Schedule [sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport
//				+ ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
//	}
//	
//	
//
//}







package com.cts.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long schedduleId;
	private String sourceAirport;
	private String destinationAirport;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	private Airport sourceAirport;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	private Airport destinationAirport;
	private LocalDate arrivalTime;
	private LocalDate departureTime;
	
	public Schedule() {
	}

	public long getSchedduleId() {
		return schedduleId;
	}

	public void setSchedduleId(long schedduleId) {
		this.schedduleId = schedduleId;
	}

	public String getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	public Schedule(long schedduleId, String sourceAirport, String destinationAirport, LocalDate arrivalTime,
			LocalDate departureTime) {
		super();
		this.schedduleId = schedduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Schedule [schedduleId=" + schedduleId + ", sourceAirport=" + sourceAirport + ", destinationAirport="
				+ destinationAirport + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}
	

	

}

