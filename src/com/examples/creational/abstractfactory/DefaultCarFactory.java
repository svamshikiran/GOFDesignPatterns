package com.examples.creational.abstractfactory;

public class DefaultCarFactory {

	public static Car buildCar() {
		// TODO Auto-generated method stub
		return new Car(Location.DEFAULT);
	}

}
