package com.removeduplicateelement;
import java.util.*;
public class Test 
{
public static void main(String[] args) 
{
  List list=new ArrayList();
       list.add(5);
       list.add(10);
       list.add(5);
       list.add(10);
       list.add(20);
       System.out.println(list);
       Set s=new HashSet(list);
       System.out.println(s);
       
       Set s1=new LinkedHashSet(list);
       System.out.println(s1);
	
	
	
}
}
