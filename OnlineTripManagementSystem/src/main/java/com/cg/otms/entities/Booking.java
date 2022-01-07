package com.cg.otms.entities;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	private String description;
	
	@Column(name = "booking_type",nullable = false,length = 10)
	private String bookingType;
	@Column(name = "booking_title",nullable = false)
	private String bookingTitle;
	private  LocalDate bookingDate;
	private  int userId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id",table = "Package")
	private Package pack;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",table = "User")
	private User user;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, String description, String bookingType, String bookingTitle, LocalDate bookingDate,
			int userId, Package pack, User user) {
		super();
		this.bookingId = bookingId;
		this.description = description;
		this.bookingType = bookingType;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.userId = userId;
		this.pack = pack;
		this.user = user;
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

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Package getPack() {
		return pack;
	}

	public void setPack(Package pack) {
		this.pack = pack;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", description=" + description + ", bookingType=" + bookingType
				+ ", bookingTitle=" + bookingTitle + ", bookingDate=" + bookingDate + ", userId=" + userId + ", pack="
				+ pack + ", user=" + user + "]";
	}
	
	
	
}
