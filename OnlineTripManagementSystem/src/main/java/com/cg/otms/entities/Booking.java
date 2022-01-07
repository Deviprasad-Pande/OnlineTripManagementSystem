package com.cg.otms.entities;



public class Booking {

	private int bookingId;
	private String description;
	private String bookingType;
	private String bookingTitle;
	private  int userId;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Booking(int bookingId, String description, String bookingType, String bookingTitle, int userId) {
		super();
		this.bookingId = bookingId;
		this.description = description;
		this.bookingType = bookingType;
		this.bookingTitle = bookingTitle;
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", description=" + description + ", bookingType=" + bookingType
				+ ", bookingTitle=" + bookingTitle + ", userId=" + userId + "]";
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getBookingType() {
		return bookingType;
	}


	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}


	public String getBookingTitle() {
		return bookingTitle;
	}


	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}



	
	
	
	
	
}
