package com.customchecktask;

import java.util.Scanner;

public class Numbercheck extends Exception
{  
	
	private int val1,val2;
    
	public Numbercheck(int val1,int val2) throws InvalidNumberException
{
	
	 if(val1<0||val2<0)
	 {
		throw new InvalidNumberException("number less than zero");
	 }
	 else
	 {
		 this.val1=val1;
		 this.val2=val2;
		 
	 }
		 
}
public int displaygreater() throws InvalidNumberException
  {
	 if(val1>val2)
	 return val1;
	 else
    return val2;
		 
 }
	  

	public static void main(String[] args) 
	{  
		try{
		Numbercheck nc=new Numbercheck(34,67);
		int v=nc.displaygreater();
		System.out.println("greater number="+v);
		
	}
		catch(InvalidNumberException e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}
	
}
