package com.examples.creational.singleton;

//Lazy initialization of the Object
public class SingletonClass {

    private static final SingletonClass instance = null;

    public static SingletonClass getInstance() {
        if(instance == null){
            return new SingletonClass();
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("This is print message in Singleton Class");
    }
}
