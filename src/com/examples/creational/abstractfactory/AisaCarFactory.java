package com.examples.creational.abstractfactory;

public class AisaCarFactory {

	public static Car buildCar(CarType carType) {
		return new Car(Location.ASIA, carType);
	}

}
