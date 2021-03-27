package com.studentsobjecthashmap;
import java.util.*;
public class Test 
{
  public static void main(String[] args) 
{
	Map<String,Student>smap=new HashMap<>();
	   Student peter=new Student();
	           peter.setRollno(2);
	           peter.setName("peter");
	           
	   Student alex=new Student();
	           alex.setRollno(5);
	           alex.setName("alex");
	           
	          smap.put("peter",peter);
	          smap.put("alex",alex);
	          
	  Set<String>keys=smap.keySet();
	    System.out.println(keys);
	 
	  Iterator<String>itr=keys.iterator();
	         while(itr.hasNext())
	         {
	        	String key=itr.next();
	        	//System.out.println(key);
	        	
	       Student stu=smap.get(key);
	       System.out.println(stu.getRollno());
	       System.out.println(stu.getName());
	           
	        	 
	        	 
	         }
	 
	  
	  
}
	
	
	
	
}
