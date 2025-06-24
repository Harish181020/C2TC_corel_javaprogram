package com.tnsif.day8.instanceofinheritance;

public class Samsung implements Phone  {

	@Override
	public void call() {
    System.out.println("Call using Samsung");
		
	}

	@Override
	public void sms() {
	System.out.println("sms using Samsung");
		
	}
 
 
}
