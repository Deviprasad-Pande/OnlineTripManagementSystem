package com.cg.tms.entities;

<<<<<<< HEAD
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * Hotel POJO class
 * 
 */
@Entity
@Table(name = "hotel")
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
public class Hotel {
<<<<<<< HEAD

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
=======
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hotelId ;
    @Column(name = "hotel_name",nullable = false,unique=true)
	private String hotelName;
    @Column(name = "hotel_type",nullable = false)
	private String hotelType;
    
	private String hotelDescription;
    @Column(name = "add_ress",nullable = false,length = 100)
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
	private String address;
<<<<<<< HEAD
	private String description;
=======

    @Column(name = "re_nt",nullable = false)
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
	private double rent;
<<<<<<< HEAD
	private String profile;
=======

    @Column(name = "status",nullable = false)
	private String status;
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
	
	@OneToMany
	private List<Feedback> feedbacks;

	// no-arg constructor
	public Hotel() {

	}

	// parameterized constructor
	public Hotel(String name, String address, String description, double rent,String profile, List<Feedback> feedbacks) {
		this.name = name;
		this.address = address;
		this.description = description;
		this.rent = rent;
		this.profile = profile;
		this.feedbacks = feedbacks;
	}

	// getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
	
	

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", description=" + description
				+ ", rent=" + rent + "]";
	}

}