package com.cg.otms.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * Admin POJO class
 * done
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


//@Table(name = "admin_details")
public class Admin extends User {

	private String name;
	private String address;
	private String mobileNo;
	private String email;

//    private String password;


	
	
	
}
