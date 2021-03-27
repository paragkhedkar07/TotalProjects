package com.scenario1;

public class Test
{
  public int m1()
  {
	try
	{
	 System.out.println("try---start--");
	 return 10;
	}
	finally
	{
	 System.out.println("finally---start--");	
	}
  }
	public static void main(String[] args) 
	{
	  Test t=new Test();
	   int x= t.m1();
	   System.out.println(x);
 	}  
}
