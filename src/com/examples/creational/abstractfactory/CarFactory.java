package com.examples.creational.abstractfactory;

public class CarFactory {

	private CarFactory() {
		// Prevent instantiation
	}

	public static Car buildCar(Location location, CarType carType) {
		Car car = null;
		switch (location) {
		case USA:
			car = USACarFactory.buildCar(carType);
			break;
		case ASIA:
			car = AisaCarFactory.buildCar(carType);
			break;
		case DEFAULT:
			car = DefaultCarFactory.buildCar(carType);
			break;
		default:
			car = null;
		}
		
		return car;
	}

}
