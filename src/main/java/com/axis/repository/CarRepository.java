package com.axis.repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.axis.entity.Car;
@Repository
public interface CarRepository extends CrudRepository<Car,Long> {
	@Modifying
	@Query("update Car set name=?1,fuelType=?2,engCap=?3,mileage=?4 where engineNo=?5")
	void updateCarInfo(String name,String fuelType,int engCap,double mileage,long engineNo);

}
