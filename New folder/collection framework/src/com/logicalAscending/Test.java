package com.logicalAscending;
import java.util.*;

public class Test 
{
public static void main(String[] args) 
{
   ArrayList list=new ArrayList();
     list.add(30);
     list.add(3);
     list.add(78);
     list.add(25);
     list.add(55);
     
     System.out.println(list);
     
     int temp=0;
     for(int j=0;j<list.size();j++)
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
