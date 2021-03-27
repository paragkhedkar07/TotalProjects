package com.listset;
import java.util.*;
public class Test
{
  public static void main(String[] args)
  {
	
	 List<String>mh=new ArrayList();
	             mh.add("pune");
	             mh.add("mumbai");
	             
	 Set<String>ka=new HashSet();
	            ka.add("city1");
	            ka.add("city2");
	            
	 List<Collection<String>>india=new ArrayList<>();
	                        india.add(mh);
	                        india.add(ka);
	                        
	 Iterator<Collection<String>>itr=india.iterator();
	             while(itr.hasNext())
	             {
	            Collection c=itr.next();
	            
	     Iterator<String>itr1=c.iterator();
	             while(itr1.hasNext())
	             {
	            String city=itr1.next();
	            System.out.println(city);
	            	 
	             }
	            	 
	            	 
	             }
	  
	  
}
	
	
	
}
