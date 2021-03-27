package com.set;
import java.util.*;

public class Test 
{
  public static void main(String[] args) 
  {
	Set s=new HashSet();  
	s.add(5);
	s.add(6);
	s.add(20);
	s.add(5);
	System.out.println(s);
	
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
	int x=(int)itr.next();
	System.out.println(x);
		
		
	}
	  
	  
	  
	  
	  
	  
	  
}
	
}
