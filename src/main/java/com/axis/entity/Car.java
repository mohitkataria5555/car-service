package com.axis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private long engineNo;
	private String name;
	private String fuelType;
	private int engCap;
	private double mileage;
	
	public Car() {
		
	}
	public Car(long engineNo, String name, String fuelType, int engCap, double mileage) {
		this.engineNo = engineNo;
		this.name = name;
		this.fuelType = fuelType;
		this.engCap = engCap;
		this.mileage = mileage;
	}
	public long getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(long engineNo) {
		this.engineNo = engineNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getEngCap() {
		return engCap;
	}
	public void setEngCap(int engCap) {
		this.engCap = engCap;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [engineNo=" + engineNo + ", name=" + name + ", fuelType=" + fuelType + ", engCap=" + engCap
				+ ", mileage=" + mileage + "]";
	}
	
}
