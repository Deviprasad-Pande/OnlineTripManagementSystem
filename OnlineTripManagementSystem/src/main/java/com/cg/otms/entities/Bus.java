package com.cg.otms.entities;

public class Bus {
	
	private int busId;
	private String busType;
	private String busNumber;
	private int capacity;
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
