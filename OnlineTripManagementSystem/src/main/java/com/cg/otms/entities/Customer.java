package com.cg.otms.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * Customer POJO class
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

//@Table(name = "customers_detail")
public class Customer extends User {

	private String name;
	private String address;
	private String mobileNo;
	//@Column(nullable = false, unique = true)
	private String email;

	// no-arg constructor
	
}
