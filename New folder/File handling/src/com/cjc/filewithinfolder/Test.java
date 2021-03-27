package com.cjc.filewithinfolder;

import java.io.*;


public class Test {
	public static void main(String[] args)    throws IOException
	  {
		File f=new File("C:\\cjc"); 
		     f.mkdir();
		     System.out.println("folder created");
		//File f1=new File("C:\\cjc","xyz.txt");
		     File f1=new File(f,"xyz.txt");
		     f1.createNewFile();
		     System.out.println("file created");
		  
		  
		  
	}
		
	
	
	
}
