package com.cg.otms.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.tms.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

	
	
	
	
}
