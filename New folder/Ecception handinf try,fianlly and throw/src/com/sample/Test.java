package com.sample;

public class Test {
	
	public int m1()
	{
		System.out.println("m1--start");
		if(true)
 		return 10;
		System.out.println("hello");
		return 20;
		
	}
	public static void main(String args[])
	{
	   Test t=new Test();
	      int x= t.m1();
	      System.out.println(x);
		
	}

}
