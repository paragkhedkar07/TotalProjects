package com.cjc.client;
import java.util.Scanner;
import com.cjc.service.Operation;
public class Test 
{
  public static void main(String a[])
  {
	  Operation o=new Operation();
	  while(true)
	  {
		System.out.println("1=Create new acc");  
		System.out.println("2=Deposite money");  
		System.out.println("3=Withdraw");
		System.out.println("4=view balance");
		System.out.println("5=view detailes");
		System.out.println("6=Exit");
		
		System.out.println("$$$$$$$$$$$$$$");
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice from 1 to 3");
		 int n=sc.nextInt();
		 switch(n)
		 {
		 case 1:
			 o.addAccount();
			   break;
		 case 2:
			 o.deposite();
                break;
		 case 3:
			 o.withdraw();
		        break;
		 case 4:
			 o.viewBalance();
			    break;
			    
		 case 5:
			 o.viewDetailes();
			     break;
			     
		 case 6:
			 System.exit(0);
			 
		 default:
				System.out.println("your input is wrong");
	}
}
	   }
	
}
