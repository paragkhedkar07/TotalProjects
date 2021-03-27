package com.cjc.task1;

import java.io.*;


public class Test {
	public static void main(String[] args)    throws IOException
	  {
		File f=new File("C:\\cjc"); 
		     f.mkdir();
		     System.out.println("folder created");
		     
		
		     File f1=new File(f,"xyz.txt");
		     f1.createNewFile();
		    System.out.println("file created");
		    
		    File f2=new File(f,"abc.txt");
		     f2.createNewFile();
		     System.out.println("file created");
		     
		    File f3=new File(f,"pqr.csv");
		    f3.createNewFile();
		    System.out.println("file created");
		    
		File f4=new File(f,"Java");
		 f4.mkdir();
	     System.out.println("folder created");
		  
	     File f5=new File(f,"Hadoop");
		 f.mkdir();
	     System.out.println("folder created"); 
	     
	     
	     File f6=new File(f5,"spark");
		 f6.mkdir();
	     System.out.println("folder created"); 
	     
		  
	}
		
	
	
	
}
