package com.examples.creational.abstractfactory;

public class USACarFactory {
	
	public static Car buildCar(CarType carType) {
		return new Car(Location.USA, carType);
	}

}
