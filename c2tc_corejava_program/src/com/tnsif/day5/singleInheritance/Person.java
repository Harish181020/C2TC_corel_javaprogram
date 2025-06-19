package com.tnsif.day5.singleInheritance;

public class Person {
	
 private String Name;
 private int Id;
 private String City; 


public Person () {
	this.Id=101;
	this.Name = "unknown";
	this.City = "chennai";
}
public Person(int Id,String name,String City) {
}
public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}
@Override
public String toString() {
	return "Person [Name=" + Name + ", Id=" + Id + ", City=" + City + ", getName()=" + getName() + ", getId()="
			+ getId() + ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";

}
}