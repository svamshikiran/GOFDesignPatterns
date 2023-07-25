package com.examples.creational.abstractfactory;

public class AisaCarFactory {

	public static Car buildCar() {
		return new Car(Location.ASIA);
	}

}
