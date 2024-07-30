package com.examples.creational.singleton;

import java.util.List;

//Eager or Early Initialization of the object
public class UserDetails {
	
	//class variable
    private static final UserDetails instance = new UserDetails();
    
    
    private UserDetails() {
    	//logic to pull the user details from DB
    	//keep it in the users variable
    }

    public static UserDetails getInstance() {
        return instance;
    }

    public void printMessage(){
        System.out.println("This is print message in SecondSingleton Class");
    }
    
}
