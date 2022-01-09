package com.cg.otms.services;

import java.util.List;

import com.cg.otms.entities.Bus;

public interface IBusService {

	public Bus addBus(Bus bus);

	public List<Bus> getAllBus();

	public Bus updateBus(Bus bus);

	public String delete(int id);

	public Bus getBusById(int id);

	public Bus getBusByBusNumber(String busNumber);
}