package com.worldhashmap;
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
    
            
            
    List<String>st1=new ArrayList<>();
    st1.add("usacity1");
    st1.add("usacity2");
    
    List<String>st2=new ArrayList<>();
    st2.add("usacity3");
    st2.add("usacity4");
    
   Map<String,List<String>>usa=new HashMap<>();
    usa.put("state1",st1);
    usa.put("state2",st2);
    
    
   Map<String,Map<String,List<String>>>world=new HashMap<>();
                  world.put("india",india);
                  world.put("usa",usa);
                  
    Set<String>keys=world.keySet();
    
    //System.out.println(keys);
    
    Iterator<String>itr=keys.iterator();
    while(itr.hasNext())
    {
    	String key=itr.next();
    	System.out.println(key);
    	
    Map<String,List<String>>m=world.get(key);
       
     Set<String>k=m.keySet();
     
     
     
     Iterator<String>itr1=k.iterator();
     while(itr1.hasNext())
    		 {
    	 String s=itr1.next();
    	 System.out.println(s);
    	 
    	 List<String> city=m.get(s);
    	 
    	 Iterator<String> itr3=city.iterator();
    while(itr3.hasNext())
    {
    	String ci=itr3.next();
    	System.out.println(ci);
    }
    
     
    	 
    	 
    	 
    		 }
    
    	
    	
    	
    	
    }
                  
    
    
                   
            
            
            
            
            
}
}
