package com.waitandnotifymethod;

public class Common 
{
  private static int value;
  private boolean flag=true;
  
  synchronized public void produce(int i)
  {
	  if(flag)
	  {
		 value=i;
	  System.out.println("producer--produce--"+value);
	     flag=false;
	     notify();
      }
	  else
	  {
		  try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
	
  }
 synchronized public int consume() 
 {
   if(flag)
   {
	   try {
		wait();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
   }
   flag=true;
   notify();
	return value;
 
}
	
	
	
}
