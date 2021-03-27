package com.Hashmapemployeetask;
import java.util.*;
public class Task 
{
  public static void main(String[] args) 
{
	  Map <Integer,Employee>m=new HashMap();
	         Employee e=new Employee();
	                e.setId(5);
	                e.setName("parag");
	                e.setSalary(25000);
	                 m.put(1,e);
	                 
	         Employee e1=new Employee();
	                  e1.setId(20);
	                  e1.setName("atul");
	                  e1.setSalary(30000);
	                  m.put(2,e1);
	                  
	         Employee e2=new Employee();
	                  e2.setId(30);
	                  e2.setName("arpit");
	                  e2.setSalary(20000);
	                  m.put(3,e2);
	
	                 
	                 Set<Integer>keys=m.keySet();	
	                 
	                 Iterator<Integer>itr=keys.iterator();
	                 while(itr.hasNext())
	                 {
	                 Integer key=itr.next();
	                 Employee val=m.get(key);
	                // System.out.println(key);
	                // System.out.println(val);
	                 System.out.println(val.getId());
	                 System.out.println(val.getName());
	                 System.out.println(val.getSalary());
	                 
	                 }
	                   
	  
	  
}
	
	
}
