package com.cjc.howmanyfolderorfile;

import java.io.File;
import java.io.IOException;

public class Test
{
	public static void main(String[] args)    throws IOException
	  {
		File f=new File("C:\\Windows"); 
		String [] fname=f.list();
		System.out.println("no of files and folders="+fname.length);
		     
		  
		  
	}
		
	
}
