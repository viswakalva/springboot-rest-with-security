package com.mmkalva.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mmkalva.api.CarsDTO;
import com.mmkalva.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService myservice;

	@GetMapping("/getCars")
	public List<CarsDTO>  greeting() {
		return myservice.fetchAllCars();
	}
	
	 @PostMapping("/addCar")
	  public HttpStatus newEmployee(@RequestBody CarsDTO CarsDTO) {
		 	 myservice.addCar(CarsDTO);
	     return HttpStatus.OK;
	  }

	

}
