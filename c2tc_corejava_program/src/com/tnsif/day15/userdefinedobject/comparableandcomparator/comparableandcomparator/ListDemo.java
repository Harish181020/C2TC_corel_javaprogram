package com.tnsif.day15.userdefinedobject.comparableandcomparator.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// Adding User Defined objects into ArrayList
		List<student> studentList = new ArrayList<student>();
		student s1 = new student(11, "Pooja", 78);
		studentList.add(s1);
		s1 = new student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new student(41, "Neha", 72);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n" + studentList);

		System.out.println("---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);

		// Using Comparable interface
		Collections.sort(studentList);

		System.out.println("---------------Student Details After Sorting-------------------");
		System.out.println(studentList);

		// Adding Person objects into ArrayList
		List<person> personList = new ArrayList<person>();
		person p1 = new person("Abhijit", "Mumbai");
		personList.add(p1);

		p1 = new person("Milind", "Pune");
		personList.add(p1);

		p1 = new person("Saurav", "Bangalore");
		personList.add(p1);

		p1 = new person("Madhur", "Delhi");
		personList.add(p1);

		System.out.println("Person list is as follows\n" + personList);

		// Using Comparator interface
		System.out.println("---------------Person Details Before Sorting-------------------");
		System.out.println(personList);

		Comparator<person> pComp=new SortByName();
		Collections.sort(personList,pComp );
		System.out.println("---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);
		
		pComp=new SortByCity();
		Collections.sort(personList, pComp);
		System.out.println("---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);
	}

}
