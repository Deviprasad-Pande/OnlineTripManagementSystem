package com.cg.otms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.Hotel;

public interface IHotelRepository extends JpaRepository<Hotel, Integer> {

	public Hotel findHotelsById(Integer id);

	public List<Hotel> findByAddressContaining(String city);

}
