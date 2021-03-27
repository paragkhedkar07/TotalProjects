package com.cjc.Operation;
import com.cjc.account.*;
import java.util.*;

public class Operation 
{ int count=0;
	 Scanner sc=new Scanner(System.in);
	 Account ac=new Account();
  public void CreateAccount()
  {
	System.out.println("please enter your Account no");
	  String s=sc.next();
	  ac.setAcNo(s);
	  
	System.out.println("please enter your name");  
	  String s1=sc.next();
	  ac.setName(s1);
	  
	  System.out.println("please enter your addr");  
	  String s2=sc.next(); 
	  ac.setAddr(s2);
	  
	  System.out.println("please enter your gender"); 
	   String s3=sc.next();
	   
	  ac.setGender(s3);
	  
	  System.out.println("please enter your age"); 
	  int age=sc.nextInt();
	  if(age>=18)
	  {
		  System.out.println("account will be create");
	  }
	  else
	  {
		  System.out.println("you are not elligible to create acc");
	  }
		  ac.setAge(age);
	   
	  System.out.println("please enter your  mNo in 10 digit");  
	  String s5=sc.next();
	  ac.setMno(s5);
	  
	   System.out.println("enter amount greater than 500 rs for acc no");
      double bal=sc.nextDouble();
        if(bal>=1000)
        {
     	 ac.setBalance(bal);  
     }
        else
     	 System.out.println("enter amount above 1000");
         count++;
  }
  
	
  public void deposite()
  {  
     if (count>0) 
     {
System.out.println(" enter amount you wish to deposite ");
     double dep=sc.nextDouble();
	 if(dep>0)
	 {
	double amount=ac.getBalance();
	 ac.setBalance(dep+amount);
	 System.out.println("your updated balance="+ac.getBalance());
	 }
 else
   System.out.println("you must need to deposite positive amount");
  }
 else
 System.out.println("please create account");
}
			
			
	public void withdraw()
	{
		if (count>0)
		{
			System.out.println("enter amount you wish to withdraw");
			double wit=sc.nextDouble();
			if(wit>=500)
			{
			
				if(ac.getBalance()-wit>=500)
				{
				double amount=ac.getBalance();
				ac.setBalance(amount-wit);
				System.out.println("remaining balance="+ac.getBalance());
			}
			else
				System.out.println("you dont have sufficient bal to withdraw");
		}
		else
			System.out.println("your amount is not enough to withdraw");
		}
		else
			System.out.println("please create account");
	}
		public void viewBalance()
		{
			if(count>0)
			{
				System.out.println("your balance is="+ac.getBalance());
				
			}
			else
				System.out.println("please create account");
		}	
		
		
			 public void viewDetailes()
			   {
				if(count>0)
				{
					System.out.println("Name="+ac.getName());
					System.out.println("Acno="+ac.getAcNo());
					System.out.println("Address="+ac.getAddr());
				}
				else
					System.out.println("please create account");
			}
			
			
			
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

