package com.waitandnotifymethod;

public class Consumer extends Thread
{
   Common c;
   public  Consumer(Common c)
   {
	  this.c=c; 
	   
   }  
	public void run()
	{
		while(true)
		{
		int data=c.consume();
		System.out.println("consumer---consume" +data);
		   try {
			sleep(1200);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
			
		}
		
		
	}
	
	
	
	
	
	
}
