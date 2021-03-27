package com.sortbyidnameaddress;
import java.util.*;
public class Test
{
public static void main(String[] args) 
{
  List<Employee> s=new ArrayList<Employee>();
  
    Employee emp=new Employee();
      emp.setId(1);
      emp.setAddress("karve nagar");
      emp.setName("parag");
      
    Employee emp1=new Employee();
      emp1.setId(1);
      emp1.setAddress("karve nagar");
      emp1.setName("amit");
      
      Employee emp2=new Employee();
      emp2.setId(1);
      emp2.setAddress("karve nagar");
      emp2.setName("amay");  
	
      s.add(emp);
      s.add(emp1);
      s.add(emp2);
      
      Collections.sort(s,new Sort());
      
      for(Employee e1:s)
      {
    	  System.out.println(e1.getId());
    	  System.out.println(e1.getAddress());
    	  System.out.println(e1.getName());
    	  
    	  
    	  
    	  
      }
   }
}
