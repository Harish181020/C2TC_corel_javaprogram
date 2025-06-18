package com.tnsif.day4.thirdpackage;

public class PrivateConstructorDemo {
	public static void main(String s[]) {
		
		MyClass m=MyClass.getObject();
		m.setId(10);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}
