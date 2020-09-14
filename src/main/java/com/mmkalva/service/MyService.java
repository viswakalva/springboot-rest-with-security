package com.mmkalva.service;

import java.util.List;

import com.mmkalva.api.CarsDTO;

public interface MyService {
	
	public List<CarsDTO> fetchAllCars();
	
	public void addCar(CarsDTO carDTO);

}
