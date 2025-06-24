package com.tnsif.day7.Covarient;

public class CovariantOverloadingDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws CloneNotSupportedException
		{
			// new student object created
			Student student1 = new Student(1, "MCA", "Kapil");
			student1.printData();

			// Student object created using clone method
			// assuming type casting is required
		//	Student student2 = (Student) student1.clone();
			//student2.printData();
		
		 //using covariant return type no need to type cast 
		  Student student2 =student1.clone(); 
		  Student2.setName("Sachin"); 
		  Student2.setRollNo(2);
		  Student2.printData();
		 		
		}

