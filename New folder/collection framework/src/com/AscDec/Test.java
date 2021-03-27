  package com.AscDec;
import java.util.*;

public class Test 
{
public static void main(String[] args) 
{
	ArrayList list=new ArrayList();
	          list.add(29);
	          list.add(34);
	          list.add(89);
	          list.add(45);
	          list.add(22);
	          list.add(55);
	          
	 System.out.println("numbers in the list are="+list);
	 
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
	
   System.out.println("Numbers in Ascending orderds are="+list);
  
  for(int j=0;j<list.size();j++)
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
  
   System.out.println("Numbers in descending orders are="+list);  
}
}
