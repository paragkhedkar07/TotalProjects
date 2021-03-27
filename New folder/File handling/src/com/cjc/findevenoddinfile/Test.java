package com.cjc.findevenoddinfile;

import java.io.*;

public class Test
{
  public static void main(String[] args) throws IOException
 {
	BufferedReader b=new BufferedReader(new FileReader("cjc.txt"));
	String s=b.readLine();
	 int count=0;
	 while(s!=null)
	 {
	   String[]no=s.split(",");
	  for(int i=0;i<=no.length;i++)
	  {
		 int n=Integer.parseInt(no[i]);
		 if(n%2==0)
		 {  count++;
			 System.out.println(n);
			 
		 }	 
	  }
		 s=b.readLine();
	  
	   
	     
		 
	 }
	  System.out.println("total no even no is="+count);
	  
	  
}
	
	
	
}
