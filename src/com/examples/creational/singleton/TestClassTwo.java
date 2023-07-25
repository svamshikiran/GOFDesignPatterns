package com.examples.creational.singleton;

public class TestClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass firstInstance = SingletonClass.getInstance();
		SingletonClass secondInstance = SingletonClass.getInstance();
		firstInstance.properties.get("");
	}

}


// Cache Implementation
// Property file initialization
// Read Only

/*
 * Eager Initialization
 * Lazy Initialization
 * Static Block
 * Threadsafe
 */