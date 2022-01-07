package com.cg.otms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cg.otms.entities.Travels;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busId;
	
	@Column(name="Bus Type",nullable=false)
	private String busType;
	
	
	@Column(name="Bus Number",nullable=false,unique=true,length=20)
	private String busNumber;
	

	@Column(name="Capacity",nullable=false)
	private int capacity;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="travels_id", table="Travels")
	private Travels travel;
	
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int busId, String busType, String busNumber, int capacity) {
		super();
		this.busId = busId;
		this.busType = busType;
		this.busNumber = busNumber;
		this.capacity = capacity;
	}
	public int getbusId() {
		return busId;
	}
	public void setbusId(int busId) {
		this.busId = busId;
	}
	public String getbusType() {
		return busType;
	}
	public void setbusType(String busType) {
		this.busType = busType;
	}
	public String getbusNumber() {
		return busNumber;
	}
	public void setbusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bus [busid=" + busId + ", bustype=" + busType + ", busnumber=" + busNumber + ", capacity=" + capacity
				+ "]";
	}

	
}
