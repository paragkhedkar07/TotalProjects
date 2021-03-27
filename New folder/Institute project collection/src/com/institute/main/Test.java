package com.institute.main;

import java.util.Scanner;

import com.institute.serviceimpl.ServiceImplementation;
import com.institute.servicel.Service;

public class Test 
{
  public static void main(String[] args) 
  {
	    Service service=new ServiceImplementation();  
  
	    
	  Scanner sc=new Scanner(System.in);
	  System.out.println("\n");
	  System.out.println("press 1 to addcourse");
	  System.out.println("press 2 to viewcourse"); 
	  System.out.println("press 3 to addfaculty");
	  System.out.println("press 4 to viewfaculty");
	  System.out.println("press 5 to addstudent");
	  System.out.println("press 6 to viewstudent");
	  System.out.println("press 7 to addbatch");
	  System.out.println("press 8 to viewbatch");
	  
	  
	  
	  while(true)
	  {
		  System.out.println("enter your choice");
		  int choice=sc.nextInt();
	  switch(choice)
	  {
	  case 1:service.addCourse();
	         break;
	  case 2:service.viewCourse();
      break;
	  case 3:service.addFaculty();
      break;
	  case 4:service.viewFaculty();
      break;
	  case 5:service.addStudent();
      break;
	  case 6:service.viewStudent();
      break;
	  case 7:service.addBatch();
      break;
	  
	  case 8:service.viewBatch();
      break;
	  
      default:System.exit(0);
	  }
	  
	  
	    }
	}
}
