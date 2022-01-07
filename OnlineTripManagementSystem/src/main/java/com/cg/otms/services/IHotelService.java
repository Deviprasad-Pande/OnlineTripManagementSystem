package com.cg.otms.services;

import java.util.List;

import com.cg.otms.entities.Hotel;

public interface IHotelService {

	public Hotel addHotel(Hotel hotel);

	public List<Hotel> getAllHotel();

	public Hotel updateHotel(Hotel hotel);

	public String delete(int id);

	public Hotel getHotelById(int id);

	public List<Hotel> getHotelsByCityName(String city);

}