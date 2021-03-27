package com.worldtask;

import java .util.*;
public class Test {
public static void main(String[] args) {
	
	List<String>mh=new ArrayList<>();
	            mh.add("pune");
	            mh.add("mumbai");
	            
	 List<String>ka=new ArrayList<>();
	            ka.add("banglore");
	            ka.add("maisur");            
	
	List<List<String>>india=new ArrayList<>();
	            india.add(mh);
	            india.add(ka);
	            
	List<String>state1=new ArrayList<>();
	            state1.add("c1");
	            state1.add("c2");
	            
	 List<String>state2=new ArrayList<>();
	            state2.add("c3");
	            state2.add("c4");            
	
	List<List<String>>usa=new ArrayList<>();
	            usa.add(state1);
	            usa.add(state2);
	            
	List<List<List<String>>>world=new ArrayList<>();
	            world.add(india);
	            world.add(usa);            
	                        
	Iterator<List<List<String>>>itr=world.iterator();
	        while(itr.hasNext())
	        {
	        List<List<String>>country=itr.next();
	        Iterator<List<String>>itr1=country.iterator();
	          while(itr1.hasNext())
	          {
	       List<String>city=itr1.next();
	       Iterator<String>itr2=city.iterator();
	        while(itr2.hasNext())
	        {
	        String s=itr2.next();
	        	System.out.println(s);
	        }
	        	  
	        	  
	          }
	        	
	        }
	            
	
}
}
