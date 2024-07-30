package com.examples.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {

		System.out.println(CarFactory.buildCar(Location.ASIA, CarType.LUXURY));
		System.out.println(CarFactory.buildCar(Location.DEFAULT, CarType.SMALL));
		System.out.println(CarFactory.buildCar(Location.USA, CarType.SEDAN));
	}
}
