package com.scenario2;

public class Test
{
  public int m1()
  {
	try
	{
		 int x=10;
	 System.out.println("try---start--");
	 return 10;
	}
	finally
	{
		int x=30;
	 System.out.println("finally---start--"+x);	
	}
  }
	public static void main(String[] args) 
	{
	  Test t=new Test();
	   int x= t.m1();
	   System.out.println(x);
 	}  
}
