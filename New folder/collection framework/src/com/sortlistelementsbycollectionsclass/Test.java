package com.sortlistelementsbycollectionsclass;
import java.util.*;
public class Test 
{
public static void main(String[] args) {
	
	List list=new ArrayList();
	  list.add(4);
	  list.add(2);
	  list.add(1);
	  list.add(2);
	  list.add(8);
	
	  System.out.println(list);
	  Set s=new TreeSet(list);
	  System.out.println(s);
      
	  Collections.sort(list);
	  System.out.println(list);
}
	
}
