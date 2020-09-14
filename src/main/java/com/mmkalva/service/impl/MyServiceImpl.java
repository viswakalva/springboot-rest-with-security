package com.mmkalva.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmkalva.api.CarsDTO;
import com.mmkalva.domain.Cars;
import com.mmkalva.repositoy.CarsRepository;
import com.mmkalva.service.MyService;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	private CarsRepository carsRepo;

	@Override
	public List<CarsDTO> fetchAllCars() {
		List<CarsDTO> carsListResponse = new ArrayList<>();
		List<Cars> carsList = carsRepo.findAll();
		for(Cars car : carsList) {
			CarsDTO carDTO = new CarsDTO();
			carDTO.setAvailable((car.getAvailability()=="Y") ? true : false);
			carDTO.setCarMake(car.getCarMake());
			carDTO.setCarModel(car.getCarModel());
			carDTO.setCarYear(car.getCarYear());
			carDTO.setPrice(car.getPrice());
			carsListResponse.add(carDTO);
		}		
		return carsListResponse;
	}

	@Override
	public void addCar(CarsDTO carDTO) {
		Cars car = new Cars();
		car.setAvailability("Y");
		car.setCarMake(carDTO.getCarMake());
		car.setCarModel(carDTO.getCarModel());
		car.setCarYear(carDTO.getCarYear());
		car.setPrice(carDTO.getPrice());
		carsRepo.save(car);
	}

}
