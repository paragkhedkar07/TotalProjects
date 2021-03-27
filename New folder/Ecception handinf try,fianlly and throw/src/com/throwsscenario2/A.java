package com.throwsscenario2;

public class A 
{
public void m1() throws ClassNotFoundException
{
  Class.forName("com.throwsscenario2.A");	
  System.out.println("m1--A");
}
public void m2()
{
	try
	{
		m1();
		System.out.println("try block");
	}
	catch(ClassNotFoundException e)
	{
	System.out.println("catch--block");	
		
	}
}
public static void main(String[] args) 
{
	A a=new A();
	a.m2();
}
}
