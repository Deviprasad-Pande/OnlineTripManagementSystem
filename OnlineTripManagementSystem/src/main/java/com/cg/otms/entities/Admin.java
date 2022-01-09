package com.cg.otms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


  /*@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  adminId;
	
	@Column(name = "name",nullable = false,length = 50)
	private String adminName;
	@Column(name = "pass_word",nullable = false,length = 10)
	private String password;
	@Column(name = "email",nullable = false,unique = true,length = 50)
    @Table(name = "admin_details")
    */
   public class Admin extends User {

	private String name;
	private String address;
	private String mobileNo;

	private String email;

	// no-arg constructor
	public Admin() {

	}

	// parameterized constructor
	public Admin(String name, String address, String mobileNo, String email, String username, String password) {
		super(username, password);
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	// getter and setter
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + super.getId() + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", email=" + email + "]";
	}
}
