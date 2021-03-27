package com.maplistsetgeneric;
import java.util.*;
public class Test {
public static void main(String[] args) 
{
	List<String>mh=new ArrayList();
	            mh.add("pune");
	            mh.add("mumbai");
	            
	Set<String>ka=new HashSet();
	           ka.add("city1");
	           ka.add("city2");
	           
	Map<String,Collection<String>>india=new HashMap<>(); 
	                    india.put("maharastra",mh);
	                    india.put("karnataka",ka);
	                    
	 Set<String>keys=india.keySet();
	 System.out.println(keys);
	 Iterator<String>itr=keys.iterator();
	        while(itr.hasNext())
	        {
	        	 String key=itr.next();
	             System.out.println(key);
	             
	         Collection<String>cl=india.get(key);
	           Iterator<String>itr1=cl.iterator();
	           while(itr1.hasNext())
	           {
	         	String city=itr1.next();
	         	System.out.println(city);
	         	  
	         	  
	           }
	       }
}
}
