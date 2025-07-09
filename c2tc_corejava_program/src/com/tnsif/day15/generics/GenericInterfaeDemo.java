package com.tnsif.day15.generics;

public class GenericInterfaeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float arr[] = { 3.22f, 6.8f, 222.8f, 88.9f, 6.0f };
		MinMax<Float> objOne = new MinMaxlmpl<Float>(arr);
		//retrieving Minimum and Maximum element from float array
		System.out.println("Minimum value is : " + objOne.min());
		System.out.println("Maximum value is : " + objOne.max());
		
	
		String arrOne[] = { "Ankit", "Pooja", "Neha", "Sakshi", "Amol" };
		MinMax<String> objTwo = new MinMaxlmpl<String>(arrOne);
		//retrieving Minimum and Maximum element from String array
		System.out.println("Minimum value is : " + objTwo.min());
		System.out.println("Maximum value is : " + objTwo.max());
		
		Person p[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		MinMax<Person> objThree = new MinMaxlmpl<Person>(p);
		//retrieving Minimum and Maximum element from array of person objects
		System.out.println("Minimum value is : " + objThree.min());
		System.out.println("Maximum value is : " + objThree.max());

	}

}
