package com.logicalDescending;

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
		     int temp=0;
		    
		     for(int j=0;j<list.size();j++) //[8,2,5,10,4]
		     {
		    	for(int i=0;i<list.size();i++)
		    	{
		    	  if((int)list.get(j)>(int)list.get(i))
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

		
	
		



