package com.axis.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Car;
import com.axis.service.CarService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	private CarService carService;
	
@GetMapping
public Flux<Car> getAllCars(){
	return carService.getAllCars();
}

@GetMapping("/{engineNo}")
public Mono<Car> getCarByEngineNo(@PathVariable long engineNo){
	return carService.getCarByEngineNo(engineNo);
	
}
@PostMapping("/add")
public ResponseEntity<String> saveCar(@RequestBody Car car){
	carService.saveCar(car);
	return new ResponseEntity<String>("Car inserted with engNo"+car.getEngineNo(),HttpStatus.CREATED);

}






}


