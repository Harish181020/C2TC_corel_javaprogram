// This program to demonstrate Trainer sub class or derived
package com.tnsif.day5.singleInheritance;

public class Trainer extends Person{
	private String designation;
	private String Location; 
	public Trainer()//default constructor
	{
		super();
		this.designation = "program trainer";
		this.Location = "chennai";
	}
		public  Trainer (int Id,String Name,String City,String designation,String Location) {
		super(Id,Name,City);
		this.designation = designation;
		this.Location = Location;
		
		}
		
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Trainer [Name:"+getName()+"Id:"+getId()+"city:"+getCity()+"designation=" + designation + ", Location=" + Location + "]";
	}

}
