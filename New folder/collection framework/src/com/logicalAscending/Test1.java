package com.logicalAscending;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		     
		     list.add(40);
		     list.add(56);
		     list.add(34);
		     list.add(13);
		     list.add(4);
		     System.out.println(list);
		     
		/*  int x=(int)list.get(0);
		   System.out.println(x);
		   
		   String s=(String)list.get(3);
		   System.out.println(s);*/
		     int temp=0;
		    
		     for(int j=0;j<list.size();j++) //[8,2,5,10,4]
		     {
		    	for(int i=0;i<list.size();i++)
		    	{
		    	  if((int)list.get(j)<(int)list.get(i))
		    	  {
		    		  temp=(int)list.get(i);
		    	      list.set(i,list.get(j));
		    	      list.set(j,temp);
		    		
		    	}
		    	  }
		    	}
		    	 System.out.println(list);
		    	 
		     
		   
		}
}
