package com.throwskeyword;

public class A 
{
	public void m1()
	{
	System.out.println("m1--start");
	B b=new B();
	try{
		b.m2();
	}
	catch(ArithmeticException e)
	{
	System.out.println("catch--block");

	}}
public static void main(String[] args)
{
A a=new A();
  a.m1();
}
}
