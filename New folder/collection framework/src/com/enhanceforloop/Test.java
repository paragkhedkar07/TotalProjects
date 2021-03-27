package com.enhanceforloop;
import java.util.*;
public class Test 
{
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	   list.add("abc");
	   list.add("xyz");
	   list.add("PQR");
	/*Iterator<String>itr=list.iterator();
	   while(itr.hasNext())
	   {
		 String val=itr.next();
		 System.out.println(val);
		   
		   
	   }*/
	   
	   for(String s:list)
	   {
		   System.out.println(s);
		   
	   }
	   
}
}
