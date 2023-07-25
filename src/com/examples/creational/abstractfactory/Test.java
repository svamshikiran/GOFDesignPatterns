package com.examples.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {

		System.out.println(CarFactory.buildCar(Location.ASIA));
		System.out.println(CarFactory.buildCar(Location.DEFAULT));
		System.out.println(CarFactory.buildCar(Location.USA));
	}
}
