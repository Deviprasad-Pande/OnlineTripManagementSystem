package com.cg.otms.entities;

public class Bus {
	
	private int busid;
	private String bustype;
	private String busnumber;
	private int capacity;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int busid, String bustype, String busnumber, int capacity) {
		super();
		this.busid = busid;
		this.bustype = bustype;
		this.busnumber = busnumber;
		this.capacity = capacity;
	}
	public int getBusid() {
		return busid;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public String getBusnumber() {
		return busnumber;
	}
	public void setBusnumber(String busnumber) {
		this.busnumber = busnumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bus [busid=" + busid + ", bustype=" + bustype + ", busnumber=" + busnumber + ", capacity=" + capacity
				+ "]";
	}

	
}
