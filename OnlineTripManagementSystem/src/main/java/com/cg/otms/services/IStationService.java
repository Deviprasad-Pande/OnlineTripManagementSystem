
package com.cg.otms.services;

import java.util.List;

import com.cg.otms.entities.Station;

public interface IStationService {

	public Station addSatation(Station station);

	public List<Station> getAllStation();

	public Station updateStation(Station station);

	public String deleteById(int id);

	public Station getStationById(int id);

	public Station getStationByCode(String code);

	public Station getStationByName(String name);

}