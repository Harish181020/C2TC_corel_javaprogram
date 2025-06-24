package com.tnsif.day6.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass o1 = new MyClass();
		System.out.println(o1);

		// static method with class name
		MyClass.display();

		MyClass o2 = new MyClass();
		System.out.println(o2);
		MyClass.display();
		MyClass o3 = new MyClass();
		System.out.println(o3);
		MyClass.display();


	}

}
