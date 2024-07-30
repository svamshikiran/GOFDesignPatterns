package com.examples.creational.singleton;

import java.util.List;

//Early initialization of the Object
public class SingletonEarly {

	private static SingletonEarly instance = new SingletonEarly();

	private SingletonEarly() {

	}

	public static SingletonEarly getInstance() {
		return instance;
	}

	public void printMessage() {
		System.out.println("This is print message in Singleton Class");
	}

}
