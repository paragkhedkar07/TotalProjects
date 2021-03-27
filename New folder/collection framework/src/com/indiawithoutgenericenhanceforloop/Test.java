package com.indiawithoutgenericenhanceforloop;
 import java.util.*;

 public class Test {
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
     
  for(Object o:india)
  {
	  List l=(List)o;
	for(Object o1:l)
	{
		String city=(String)o1;
		System.out.println(city);
		
	}
	  
  }
     
     
     
}
}
