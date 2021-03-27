package com.throwkeywordexception;

public class Test 
{
  
public void m1(int age)
  {
	  if(age<0)
	  {
	  throw new ArithmeticException("Ageproblem");
	  }
	  
  }
  public static void main(String[] args) 
  {
	Test t=new Test();
	try
	{
		t.m1(-5);
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch--block"+e.getMessage());
	}
}
	
	
}
