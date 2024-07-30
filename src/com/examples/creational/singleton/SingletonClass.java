package com.examples.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//Lazy initialization of the Object
public class SingletonClass {

	private static SingletonClass instance = null;
	
	private static List<Student> studentList;

	private SingletonClass() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "");
			Statement stmt = con.createStatement();
			System.out.println("Created DB Connection....");
			ResultSet rs = stmt.executeQuery("select * from student");
			studentList = new ArrayList<>();
			while (rs.next()) {
				Student student = new Student();
				student.setRollno(rs.getInt("rollno"));
				student.setName(rs.getString("name"));
				student.setCity(rs.getString("city"));
				studentList.add(student);
			}
			System.out.println("TOTAL STUDENTS CACHED: "+studentList.size());
			
			//stuRepo.findAll()
			rs.close();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			System.out.println("CREATING A NEW INSTANCE");
			instance = new SingletonClass();
			return instance;
		}
		System.out.println("RETURNING THE CREATED INSTANCE");
		return instance;
	}

	public void printMessage() {
		System.out.println("This is print message in Singleton Class");
	}
	
	public List<Student> getStudentList(){
		return studentList;
	}

}
