package com.tnsif.day4.thirdpackage;

public class StudentDemo {

	public static void main(String[] args) {
	Student st = Student.getObj();
	
	st.setId(101);
	st.setName ("mani");
	
	Student st1 = Student.getObj();
	System.out.println(st1);
	System.out.println(st);

	}

}
