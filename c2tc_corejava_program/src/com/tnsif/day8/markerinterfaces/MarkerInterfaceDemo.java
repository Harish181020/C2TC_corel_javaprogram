package com.tnsif.day8.markerinterfaces;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			
	}

}
