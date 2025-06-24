package com.tnsif.day8.instanceofinheritance;

public class Jio implements Phone {

	@Override
	public void call() {
    System.out.println("Call using Jio");
		
	}

	@Override
	public void sms() {
	System.out.println("sms using Jio");
		
	}

	}