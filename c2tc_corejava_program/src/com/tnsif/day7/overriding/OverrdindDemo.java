package com.tnsif.day7.overriding;

public class OverrdindDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;

//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

	}


