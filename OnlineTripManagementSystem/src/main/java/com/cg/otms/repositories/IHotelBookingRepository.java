package com.cg.otms.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.HotelBooking;

public interface IHotelBookingRepository extends JpaRepository<HotelBooking, Integer> {

	public List<HotelBooking> findAllByCustomerId(int id);

	public List<HotelBooking> findByBookingDate(LocalDate bookingDate);

}
