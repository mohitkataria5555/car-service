package com.axis.exception;

public class CarNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = -2519286148040305838L;

	public CarNotFoundException() {
		super();
	}
	
	public CarNotFoundException(String message) {
		super(message);
	}
	

}
