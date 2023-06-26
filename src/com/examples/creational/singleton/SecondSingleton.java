package com.examples.creational.singleton;

//Eager or Early Initialization of the object
public class SecondSingleton {

    private static final SecondSingleton instance = new SecondSingleton();

    public static SecondSingleton getInstance() {
        return instance;
    }

    public void printMessage(){
        System.out.println("This is print message in SecondSingleton Class");
    }
}
