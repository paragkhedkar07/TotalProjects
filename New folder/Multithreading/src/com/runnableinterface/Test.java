package com.runnableinterface;

public class Test 
{
  public static void main(String[] args) {
	
	  MyRunnable mr=new MyRunnable();
	  Thread t=new Thread(mr);
	  
	         t.start();
	         for(int i = 1;i<100;i++)
	         {
	        	 System.out.println("main----");
	         }
	  
	  
	  
	  
}
	
	
	
}
