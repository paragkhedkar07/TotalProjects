package com.joinmethod;

public class Test 
{
public static void main(String[] args) {
	
	MyRunnable mr=new MyRunnable();
	  Thread t=new Thread(mr);		
	         t.start();
	         try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	for(int i=1;i<100;i++)
	{
		
		System.out.println("main----");
		
		
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
}
