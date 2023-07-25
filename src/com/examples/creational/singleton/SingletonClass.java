package com.examples.creational.singleton;

import java.util.HashMap;

//Lazy initialization of the Object
public class SingletonClass {

    private static SingletonClass instance = null;
    
    public HashMap<String, String> properties;
    
    private SingletonClass() {
    	properties = loadDataFromPropertiesFile();
    }

    public static SingletonClass getInstance() {
        if(instance == null){
        	System.out.println("CREATING A NEW INSTANCE");
            instance = new SingletonClass();
            return instance;
        }
        System.out.println("RETURNING THE CREATED INSTANCE");
        return instance;
    }

    public void printMessage(){
        System.out.println("This is print message in Singleton Class");
    }
    
    private HashMap<String, String> loadDataFromPropertiesFile() {
    	
    	//LOGIC TO READ THE PROPERTY FILE
    	return null;
    }
}
