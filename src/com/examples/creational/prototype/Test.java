package com.examples.creational.prototype;

import java.util.List;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emps = new Employees();
		emps.loadData();
		System.out.println("emps List: "+emps.getEmpList());
		
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("new employee");
		
		System.out.println("empsNew List: "+list);
		
		
		Employees empsNew1 = (Employees) emps.clone();
		
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("design");
		
		System.out.println("empsNew1 List: "+list1);
	}

}
