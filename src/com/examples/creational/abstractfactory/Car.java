package com.examples.creational.abstractfactory;

public class Car {
	
	public Car(Location location, CarType cartype){

	    this.location = location;
	    this.carType = cartype;
	  }

	  private Location location = null;
	  
	  private CarType carType = null;
	 
	  //getters and setters
	 
	  @Override
	  public String toString() {
	    return "Car "+carType+" - built in - "+location;
	  }

}
