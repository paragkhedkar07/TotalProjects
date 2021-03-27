package com.braindata.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.braindata.service.Service;
import com.braindata.serviceimpl.Operation;

public class Test 
{
   public static void main(String[] args) throws ClassNotFoundException, SQLException 
{

	  Service s=new Operation();
	  
		  while(true)
		  {
			System.out.println("1=insert data");  
			System.out.println("2=retrive data");  
			System.out.println("3=update data");
			System.out.println("4=delete data");
		    System.out.println("5Exit");   
	   
			System.out.println("$$$$$$$$$$$$$$");
			  Scanner sc=new Scanner(System.in);
				System.out.println("enter your choice from 1 to 4");
				 int n=sc.nextInt();
				 switch(n)
				 {
				 case 1:
					 s.insertData();
					   break;
				 case 2:
					 s.retriveData();
		                break;
				 case 3:
					 s.updateData();
				        break;
				 case 4:
					 s.deleteData();
					    break;
					    
				 case 5:
					 System.exit(0);
					 
				 default:
						System.out.println("your input is wrong");
			}
		}
	   
}
	
	
	
	
	
	
	
}
