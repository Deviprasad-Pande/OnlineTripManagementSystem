package com.cg.otms.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String routeId;
	

	@Column(name="route_from",nullable=false, length = 20)
	private String  routeFrom;
	
	@Column(name="route_from",nullable=false, length = 20)
	private String  routeTo;
	
	private  List<Bus> buses;
	private  LocalDateTime  departureTime;
	private  LocalDateTime   arrivalTime;
	private  LocalDate   doj;
	
	@Column(name="pickup_point",nullable=false, length =20)
	private String pickupPoint;
	

	@Column(name="fa",nullable=false)
	private  double fare;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bus_Id",table = "Bus")
	private Bus bus;
	
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",table = "User")
	private User user;
	
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
