package com.hashmap;
import java.util.*;
public class Test1 
{
public static void main(String[] args) {
	
	Map<String,String>m=new HashMap<>();
	                  m.put("aa","java");
	                  m.put("bb","python");
	                  m.put("cc","c++");
	                  
              Set<String>keys=m.keySet();	
	            System.out.println(keys);
	           Iterator<String>itr=keys.iterator();
	            while(itr.hasNext())
	            {
	            String key=itr.next();
	            String val=m.get(key);
	            System.out.println(key);
	            System.out.println(val);
	            	
	            	
	            }
	        
	
	
	
}
}
