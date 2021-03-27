package com.spacecount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test
{
  public static void main(String[] args) throws IOException
{
	   int count=0;
	  FileReader f=new FileReader("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\comcjc\\abc.txt");
		BufferedReader br=new BufferedReader(f);
	 String s=br.readLine();
	 
	 while(s!=null)
	 {
		 System.out.println(s);
		 if(s.isEmpty())
		 {
			 count++;
		 }
		 s=br.readLine();
		 
	 }
		System.out.println("total spaces are:="+count);
	  
	  
	  
	  
	  
	  
}
	
	
	
	
	
	
	
}
