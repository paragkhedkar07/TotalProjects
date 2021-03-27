package com.resourse;

import java.util.Scanner;

public class Test 
{
public static void main(String[] args) 
{
	Scanner sc=null;
	System.out.println("main--start");
	try 
	{
		sc=new Scanner(System.in);
	   int x=10/sc.nextInt();
	
	}
/*	catch(ArithmeticException e)
	{
		System.out.println("catch block");
	}*/
	
	finally
	{
		System.out.println("finally");
		sc.close();
	}
}


	
	
}
