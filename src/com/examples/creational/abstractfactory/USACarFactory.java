package com.examples.creational.abstractfactory;

public class USACarFactory {
	
	public static Car buildCar() {
		return new Car(Location.USA);
	}

}
