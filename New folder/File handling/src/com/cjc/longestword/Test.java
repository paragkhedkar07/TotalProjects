package com.cjc.longestword;

import java.io.*;

public class Test
{
  public static void main(String[] args) throws IOException
 {
	BufferedReader b=new BufferedReader(new FileReader("avg.txt"));
	String s=b.readLine();
	String longest="";
	 while(s!=null)
	 {
	   String[]word=s.split("");
	  for(int i=0;i<=word.length;i++)
	  {
		
		 if(longest.length()<word[i].length())
		 {  
			 longest=word[i];
			 
		 }	 
	  }
		 s=b.readLine();
	  
	   
	     
		 
	 }
	  System.out.println("longest sentense in given file is="+longest);
	  
	  
}
	
	
	
}
