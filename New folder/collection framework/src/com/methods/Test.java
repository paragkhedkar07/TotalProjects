package com.methods;
import java.util.*;


public class Test
{

public static void main(String[] args) 
{
	ArrayList list=new ArrayList();
	     
	     list.add(8);
	     list.add(2);
	     list.add(5);
	     list.add(10);
	     list.add(4);
	     System.out.println(list);
	     
	/*  int x=(int)list.get(0);
	   System.out.println(x);
	   
	   String s=(String)list.get(3);
	   System.out.println(s);*/
	     
	    Iterator itr=list.iterator();
		   while(itr.hasNext())
		   {
			 
		   int val=(int)itr.next();
		   System.out.println(val);
		   
	}
}

	
}
	
