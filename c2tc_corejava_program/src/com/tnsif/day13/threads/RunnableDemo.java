package com.tnsif.day13.threads;

public class RunnableDemo {

	public static void main(String[] args) {
	UsingRunnable obj = new UsingRunnable(2,10,"hellow some"); 	
    Runnable runnable = new Runnable() {
    	
    	@Override
    	public void run() {
    		System.out.println("running task from anonymous class");
    		
    	
    	}
    };
    Thread thread=new Thread(runnable);
    thread.start();
    runnable = new Runnable(){
    	@Override
    	public void run() {
    		try {
    			for(int i=1;i<=4;i++){
    				
    				System.out.println("Child thread task3:"+i);
    				Thread.sleep(1000);
    			}}
    		catch(InterruptedException e)
    		{
    			System.out.println("error");
    		}}};
    		thread = new Thread(runnable);
    		thread.start();
    				
	}
}
