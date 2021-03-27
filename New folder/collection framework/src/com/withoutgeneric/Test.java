package com.withoutgeneric;
import java.util.*;
public class Test 
{
  public static void main(String[] args) {
	
	  List mh=new ArrayList();
	       mh.add("pune");
	       mh.add("mumbai");
	       
	  List ka=new ArrayList();
	       ka.add("banglore");
	       ka.add("maisur");
	       
	  List india=new ArrayList();
	       india.add(mh);
	       india.add(ka);
	       
	  Iterator itr=india.iterator();
	  while(itr.hasNext())
	  {
		  List list=(List)itr.next();  
	 Iterator itr1=list.iterator();
	  while(itr1.hasNext())
	  {
		  String city=(String)itr1.next();
		 
		  System.out.println(city);
		  
	  }
	  
		  
	  }
}
	
	
}
