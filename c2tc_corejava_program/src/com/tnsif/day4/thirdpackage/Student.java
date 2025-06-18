package com.tnsif.day4.thirdpackage;

public class Student {
private static Student obj = new Student();
 private int id;
 private String name;
 
public static Student getObj() {
	return obj;
}
public static void setObj(Student obj) {
	Student.obj = obj;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + "]";
}
private Student() {
	super();
	// TODO Auto-generated constructor stub
}


}