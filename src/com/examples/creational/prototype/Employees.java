package com.examples.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	private List<String> empList;
	
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list){
		this.empList=list;
	}
	
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("vinsys");
		empList.add("java");
		empList.add("design");
		empList.add("patterns");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Employees clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			temp.addAll(empList);
			return new Employees(temp);
	}
}