package com.tnsif.day6;

public class studentdemo {
	static {
	System.out.println("jello");
	}
	public static void main (String[]args) {
	student st =new student();
	System.out.println(st);
	student s1 = new student();
	System.out.println(s1);
	
}
	static
	{
		System.out.println("hello static");
	}
	public static void main(char c) {
		System.out.println("hello from no args main method..");
	}
	public static void main() {
	System.out.println("hello from no args main method");
}	
	
}
