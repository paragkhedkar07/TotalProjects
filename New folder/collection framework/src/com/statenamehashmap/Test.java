package com.statenamehashmap;
import java.util.*;
public class Test {
public static void main(String[] args)
{
	List<String>mh=new ArrayList<>();
	            mh.add("pune");
	            mh.add("mumbai");
	            
	List<String>jh=new ArrayList<>();
	            jh.add("Ranchi");
	            jh.add("lohardaga");
	            
    Map<String,List<String>>india=new HashMap<>();
                india.put("maharastra",mh);
                india.put("jharkhand",jh);
                
           Set<String>keys=india.keySet();
           System.out.println(keys);
           
       Iterator<String>itr=keys.iterator();
              while(itr.hasNext())
              {
            String key=itr.next();
            System.out.println(key);
            
      List<String>list=india.get(key);
          Iterator<String>itr1=list.iterator();
          while(itr1.hasNext())
          {
        	String city=itr1.next();
        	System.out.println(city);
        	  
        	  
          }
            	  
            	  
              }
	
	
	
}
}
