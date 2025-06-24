package com.tnsif.day8.instanceofinheritance;

public class Executor {

	public static void main(String[] args) {
	
		Phone P1 = PhoneFactory.createPhone("Samsung");
		P1.call();
		P1.sms();
		
		P1 = PhoneFactory.createPhone("Jio");
		P1.call();
		P1.sms();
	}
}
