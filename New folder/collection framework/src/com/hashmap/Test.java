package com.hashmap;
import java.util.*;

public class Test 
{
  public static void main(String[] args)
  {
	Map m=new HashMap();
	    m.put(5,"java");
	    m.put(10,"python");
	    m.put(15,"spring");
	  //  System.out.println(m);
	    
	 /*   String val=(String)m.get(10);
	    System.out.println(val);  */
	  
	  Set<Integer>keys=m.keySet();
	  System.out.println(keys);
	  Iterator <Integer>itr=keys.iterator();
	  while(itr.hasNext())
	  {
		int key=itr.next();
		String val=(String)m.get(key);
		System.out.println(key);
		System.out.println(val);
		  
		  
	  }
	  
	  
	  
	  
	  
	  
	  
}
	
	
	
}
