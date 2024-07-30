package com.examples.creational.prototype;

import java.util.List;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emps = new Employees();
		emps.loadData();
		System.out.println("emps List: "+emps.getEmpList());
		
		
		//Use the clone method to get the Employee object
		Employees firstCopy =  emps.clone();
		List<String> firstList = firstCopy.getEmpList();
		firstList.add("new employee");
		
		System.out.println("empsNew List: "+firstList);
		
		
		Employees secondCopy = emps.clone();
		
		List<String> secondList = secondCopy.getEmpList();
		secondList.remove("design");
		
		System.out.println("empsNew1 List: "+secondList);
	}

}
