package com.tnsif.day13.threads;

public class UsingRunnable implements Runnable {

	Thread thread;
	int low, high;
	String msg;
	public UsingRunnable( int low, int high, String msg) {
		super();
		thread = new Thread(this,"child Thread");
		this.low = low;
		this.high = high;
		this.msg = msg;
		thread.start();
	}
	@Override
	public void run() {
		for(int i=low;i<=high;i++) {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Errror:"+e.getMessage());
			
		}
		System.out.println(msg+" "+i);
	}
	
}
}