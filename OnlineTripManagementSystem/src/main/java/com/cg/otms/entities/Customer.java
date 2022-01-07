package com.cg.tms.entities;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * Customer POJO class
 * 
 */
@Entity
@Table(name = "customers_detail")
public class Customer extends User {

	private String name;
=======
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private  int customerId;

	@Column(name = "customer_name",nullable = false,length = 25)
	private String customerName;
	@Column(name = "pass_word",nullable = false,length = 15)
	private String  customerPassword;

	@Column(name = "addr",nullable = false,length = 100)
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
	private String address;

	@Column(name = "mobile_no.",nullable = false,unique=true,length = 10)
	private String mobileNo;
<<<<<<< HEAD
	@Column(nullable = false, unique = true)
=======

	@Column(name = "e_mail",nullable = false,unique=true,length = 50)
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
	private String email;
<<<<<<< HEAD

	// no-arg constructor
=======
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId",table = "User")
	private User user;
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
	public Customer() {

	}

	// parameterized constructor
	public Customer(String name, String address, String mobileNo, String email, String username, String password) {
		super(username, password);
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	// getters setters
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
<<<<<<< HEAD
=======
	public Customer(int customerId, String customerName, String customerPassword, String address, String mobileNo,
			String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
	}
>>>>>>> branch 'master' of https://github.com/Deviprasad-Pande/OnlineTripManagementSystem.git
}
