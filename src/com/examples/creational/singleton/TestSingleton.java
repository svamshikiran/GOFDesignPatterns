package com.examples.creational.singleton;

public class TestSingleton {

    public static void main(String[] args) {

    	SingletonClass singletonObj =  SingletonClass.getInstance();    	
    	
    	singletonObj.getStudentList().forEach(student-> {
    		System.out.println("ROLL NO: "+student.getRollno());
    	});
    	
    	SingletonClass singletonObjTwo = SingletonClass.getInstance();
    	
    	System.out.println("----------------------------");
    	singletonObjTwo.getStudentList().forEach(student-> {
    		System.out.println("STUDENT NAME: "+student.getName());
    	});

    }
}
