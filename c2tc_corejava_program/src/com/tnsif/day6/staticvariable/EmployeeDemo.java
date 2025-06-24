package com.tnsif.day6.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// string and int.
		System.out.println(Employee.companyName);
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Deep", 321);
		System.out.println(e);
	}
}
