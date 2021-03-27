package com.stringtask;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
{      
        
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your first string");
		  String s1=sc.next();
 
	   System.out.println("enter your first string");
		 String s2=sc.next();
		 try{
			int a= Integer.parseInt(s1);
		     int b= Integer.parseInt(s2);
		     int c=a+b;
		     System.out.println(c); 
		 }
		 catch(Exception v)
		 {    
			 System.out.println(s1+s2);
			 sc.close();
		 }
		 
 
	
}
}