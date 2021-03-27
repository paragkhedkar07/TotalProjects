package com.cjc.service;
import  com.cjc.model.Account; 
import java.util.Scanner;

public class Operation {
	int count=0;
    Account ac=new Account();
    Scanner sc=new Scanner(System.in);    
 public void addAccount()
 {
   System.out.println("enter account no");
	int s=sc.nextInt();
	    ac.setAcno(s);

	System.out.println("enter name");
     String s1=sc.next();	
	   ac.setName(s1);
	 
	System.out.println("enter address");
     String s2=sc.next();	
     ac.setAddress (s2);
	
     System.out.println("enter id");
     String s3=sc.next();	
     ac.setAddress (s3);  
     
     System.out.println("enter password");
     String s4=sc.next();	
     ac.setAddress (s4);
     
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
	double money=ac.getBalance();
	 ac.setBalance(dep+money);
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
	 if(count>0)
	 {
	System.out.println("enter amount to withdraw");
     double w=sc.nextDouble();
	if(w>=500)
	{
		if(ac.getBalance()-w>=500)
		{
	  double money =ac.getBalance();	
		ac.setBalance(money-w);
		System.out.println("Reamaning balance="+ac.getBalance());
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
		System.out.println("your acc bal is="+ac.getBalance());
	 }
	 else
		System.out.println("please create account");
	}
	
   public void viewDetailes()
   {
	if(count>0)
	{
		System.out.println("Name="+ac.getName());
		System.out.println("Account no="+ac.getAcno());
		System.out.println("Address="+ac.getAddress());
	}
	else
		System.out.println("please create account");
}
 }

