package com.Additionandconcatination;
import java.util.*;
public class Test 
{
   public static void main(String[] args) 
   {    String con="";
         int add=0;
		List list=new ArrayList();
		     list.add(10);
		     list.add(20);
		     list.add("abc");
		     list.add("xyz");
		     list.add(50);
		     list.add("pqr");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
		Object o=itr.next();
		if(o instanceof String)
		{
			String s=(String)o;
			 con=con+s;
			
			//System.out.println(a);
		}
		else if(o instanceof Integer)
		{
			int i=(int)o;
			add=add+i;
		
			//System.out.println(q);
		}	
		}
		System.out.println(con);
		System.out.println(add);	
		
		
		
		
	}
}
