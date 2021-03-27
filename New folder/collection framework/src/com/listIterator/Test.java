package com.listIterator;

import java.util.*;


public class Test {




public static void main(String[] args) 
{
	ArrayList list=new ArrayList();
	     
	     list.add(5);
	     list.add(10); 
	     list.add(53);
	     list.add(40);
	     list.add(1,43);
	   Iterator itr=list.iterator();
	   while(itr.hasNext())
	   {
	   int x=(int)itr.next();
	   System.out.println(x);
}

	
}
	
}