package com.examples.creational.singleton;

//Eager or Early Initialization of the object
public class SecondSingleton {
	
	//class variable
    private static final SecondSingleton instance = new SecondSingleton();
    
    private SecondSingleton() {
    	
    }

    public static SecondSingleton getInstance() {
        return instance;
    }

    public void printMessage(){
        System.out.println("This is print message in SecondSingleton Class");
    }
}
