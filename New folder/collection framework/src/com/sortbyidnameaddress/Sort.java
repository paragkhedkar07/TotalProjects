package com.sortbyidnameaddress;

import java.util.Comparator;

public class Sort implements Comparator
{
  public int compare(Object o1,Object o2)
  {
	 Employee e=(Employee)o1;
	 Employee e1=(Employee)o2;
	 
	 if(e.getId()-e1.getId()==0)
	 {
	   if(e.getName().compareTo(e1.getName())==0)
	   {
		System.out.println("sorted by address:---");   
		  return e.getAddress().compareTo(e1.getAddress()); 
		   
	}
	   else
	   {
		   System.out.println("sorted by Name:---");   
			  return e.getName().compareTo(e1.getName());  
		   
	   }
	   }
	   else
	   {
		   System.out.println("sorted by Id:---");   
			  return e.getId()-e1.getId();   
		   
		   
	   }
		 
	 }
	 
	  
	  
	  
	  
	  
  }
	
	
	
	
