package com.cg.otms.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.PackageBooking;

public interface IPackageBookingRepository extends JpaRepository<PackageBooking, Integer> {

	public List<PackageBooking> findAllByCustomerId(int id);

	public List<PackageBooking> findByBookingDate(LocalDate bookingDate);
}
