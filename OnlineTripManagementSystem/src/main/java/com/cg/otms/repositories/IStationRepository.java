package com.cg.otms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.Station;

public interface IStationRepository extends JpaRepository<Station, Integer> {

	public Station findByCode(String code);

	public Station findByName(String name);

}