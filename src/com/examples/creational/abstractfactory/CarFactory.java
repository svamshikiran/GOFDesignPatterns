package com.examples.creational.abstractfactory;

public class CarFactory {

	private CarFactory() {
		// Prevent instantiation
	}

	public static Car buildCar(Location location) {
		Car car = null;
		switch (location) {
		case USA:
			car = USACarFactory.buildCar();
			break;
		case ASIA:
			car = AisaCarFactory.buildCar();
			break;
		case DEFAULT:
			car = DefaultCarFactory.buildCar();
			break;
		default:
			car = null;
		}
		
		return car;
	}

}
