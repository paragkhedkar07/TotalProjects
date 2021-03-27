package com.throwcustomException;

import java.io.IOException;

public class Test extends AgeInvalidException
{
  public void m1(int age)throws AgeInvalidException
  {
	  if(age<0)
	  {
		  throw new AgeInvalidException("age problem");
	  }
	  
  }
  public static void main(String[] args) 
  {
	Test t=new Test();
	try
	{
		t.m1(-6);
	}
	  catch(AgeInvalidException e)
	{
		  System.out.println("catch--block="+e.getMessage());
	}
}
	
	
}
