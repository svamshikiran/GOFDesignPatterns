package com.examples.creational.singleton;

//Threadsafe
public class SynchronizedSingleton {

    private static final SynchronizedSingleton instance = null;

    public static synchronized SynchronizedSingleton getInstance() {
        if(instance == null){
            return new SynchronizedSingleton();
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("This is print message in SynchronizedSingleton Class");
    }
}
