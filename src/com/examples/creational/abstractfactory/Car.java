package com.examples.creational.abstractfactory;

public class Car {
	
	public Car(Location location){

	    this.location = location;
	  }

	  private Location location = null;
	 
	  //getters and setters
	 
	  @Override
	  public String toString() {
	    return "Car built in - "+location;
	  }

}
