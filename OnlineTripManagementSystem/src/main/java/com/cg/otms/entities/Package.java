package com.cg.otms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Package {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int packageId;
	
	
	@Column(name="package_name", length=25)
	private String packageName;
	
	
	@Column(name="package_description", length=50)
	private String packageDescription;
	
	
	@Column(name="package_type", length=50)
	private String packageType;
	
	
	@Column(name="package_cost")
	private double packageCost;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="payment_id", referencedColumnName="packageId")
	private  PaymentDetails  payment;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ticket_id", referencedColumnName="ticketId")
	private TicketDetails ticket;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="hotel_id", referencedColumnName="hotelId")
	private Hotel hotel;
	
	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Package(int packageId, String packageName, String packageDescription, String packageType, double packageCost,
			PaymentDetails payment, TicketDetails ticket, Hotel hotel) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.payment = payment;
		this.ticket = ticket;
		this.hotel = hotel;
	}
	
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	public PaymentDetails getPayment() {
		return payment;
	}
	public void setPayment(PaymentDetails payment) {
		this.payment = payment;
	}
	public TicketDetails getTicket() {
		return ticket;
	}
	public void setTicket(TicketDetails ticket) {
		this.ticket = ticket;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost + ", payment="
				+ payment + ", ticket=" + ticket + ", hotel=" + hotel + "]";
	}

}

