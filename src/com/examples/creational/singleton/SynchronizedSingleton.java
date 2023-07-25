package com.examples.creational.singleton;

//Threadsafe
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance = null;
    
    private SynchronizedSingleton() {
    	
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if(instance == null){
        	instance = new SynchronizedSingleton();
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("This is print message in SynchronizedSingleton Class");
    }
}
