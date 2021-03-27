package com.hashmappractice;
import java.util.*;
public class Test2 
{
  public static void main(String[] args) 
  {
	  Map<Integer,String>m=new HashMap<>();
	  System.out.println(m.put(1,"java"));
	  System.out.println(m.put(2,"python"));
	  System.out.println(m.put(1,"testing"));
      
Set<Integer>keys=m.keySet();	
System.out.println(keys);
Iterator<Integer>itr=keys.iterator();
while(itr.hasNext())
{
Integer key=itr.next();
String val=m.get(key);
System.out.println(key);
System.out.println(val);
	
	
}
  
	  
	
	  
	  
}
	
	
}
