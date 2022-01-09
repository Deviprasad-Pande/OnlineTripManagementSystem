package com.cg.otms.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.BusBooking;

public interface IBusBookingRepository extends JpaRepository<BusBooking, Integer> {

	List<BusBooking> findByCustomerId(int id);

	List<BusBooking> findByBookingDate(LocalDate bookingDate);

	List<BusBooking> findByJourneyDate(String date);
}
