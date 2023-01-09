package com.axis.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import com.axis.entity.Car;

import com.axis.repository.CarRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarSerImpl implements CarService {
	@Autowired
	private CarRepository carRepository;
	//@Autowired
	//private TransactionTemplate transactionTemplate;

	@Override
	public Mono<Car> getCarByEngineNo(long engineNo) {
		Mono<Car> carMono=Mono.justOrEmpty(carRepository.findById(engineNo));
		return carMono;
		
		
		
	}

	@Override
	public Flux<Car> getAllCars() {
		
		return Flux.defer(()->Flux.fromIterable(this.carRepository.findAll()));
	}
    
	@Override
	public void saveCar(Car car) {
		carRepository.save(car);
		
	}
    @Transactional
	@Override
	public void updateCar(long engineNo, Car updatedCar) {
    	carRepository.updateCarInfo(updatedCar.getName(),updatedCar.getFuelType() , updatedCar.getEngCap(),updatedCar.getMileage(),
    			updatedCar.getEngineNo());
		
	}

	@Override
	public void deleteCarByEngineNo(long engineNo) {
		// TODO Auto-generated method stub
		
	}

}
