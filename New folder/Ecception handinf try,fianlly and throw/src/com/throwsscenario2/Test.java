package com.throwsscenario2;

public class Test
{
public void m1()throws ClassNotFoundException
{
  Class.forName("Test");
  System.out.println("m1--");
}
public void m2()throws ClassNotFoundException
{
	m1();
}
public static void main(String[] args) 
{
	Test t=new Test();
	 try{
		 t.m2();
		 
	 }
	catch(ClassNotFoundException e)
	{
		
		System.out.println("catch---block");
	}
	
}	
}
