package com.cg.otms.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Route {
	private String routeId;
	private String  routeFrom;
	private String  routeTo;
	private  LocalDateTime  departureTime;
	private  LocalDateTime   arrivalTime;
	private  LocalDate   doj;
	private String pickupPoint;
	private  double fare;
	
	
	
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Route(String routeId, String routeFrom, String routeTo, LocalDateTime departureTime,
			LocalDateTime arrivalTime, LocalDate doj, String pickupPoint, double fare) {
		super();
		this.routeId = routeId;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.doj = doj;
		this.pickupPoint = pickupPoint;
		this.fare = fare;
	}



	public String getRouteId() {
		return routeId;
	}



	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}



	public String getRouteFrom() {
		return routeFrom;
	}



	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}



	public String getRouteTo() {
		return routeTo;
	}



	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}



	public LocalDateTime getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}



	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}



	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	public LocalDate getDoj() {
		return doj;
	}



	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}



	public String getPickupPoint() {
		return pickupPoint;
	}



	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}



	public double getFare() {
		return fare;
	}



	public void setFare(double fare) {
		this.fare = fare;
	}



	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", doj=" + doj + ", pickupPoint=" + pickupPoint
				+ ", fare=" + fare + "]";
	}
	
	
}
