package com.axis.service;



import com.axis.entity.Car;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CarService {
	Mono<Car> getCarByEngineNo(long engineNo);
	Flux<Car> getAllCars();
	void saveCar(Car car);
	void updateCar(long engineNo,Car updatedCar);
	void deleteCarByEngineNo(long engineNo);
	
	
	

}
