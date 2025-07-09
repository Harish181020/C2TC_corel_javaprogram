package com.tnsif.day15.generics;

public class GenericMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj = new GenericMethod();
		Integer[] intarray = { 10, 20, 30, 40 };
		String[] str = { "java", "programming", "learning" };
		Person p[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		
		//Display Integer Array 
		obj.displayArrayElements(intarray);
		
		//Display String Array
		obj.displayArrayElements(str);
		
		//Display Person Array
		obj.displayArrayElements(p);
	}

	}