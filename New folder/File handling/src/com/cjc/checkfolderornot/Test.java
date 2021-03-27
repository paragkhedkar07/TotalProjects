package com.cjc.checkfolderornot;

import java.io.File;
import java.io.IOException;

public class Test
{
	public static void main(String[] args)    throws IOException
	  {
		File f=new File("C:cjc.txt"); 
		     
		     System.out.println(f.isFile());
		     System.out.println(f.isDirectory());
			  
		  
		  
	}
		
	

	
	
}
