package com.cg.otms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.entities.Booking;

@Repository
public interface IBookingRepository extends JpaRepository<Booking,Integer>{
	
	
	
}
