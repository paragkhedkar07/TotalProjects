package com.cjc.howmanyfilesandname;

import java.io.File;
import java.io.IOException;

public class Test
{
	public static void main(String[] args)    throws IOException
	  {
		File f=new File("C:\\Windows"); 
		String [] fname=f.list();
		for(int i=0;i<fname.length;i++)
		{
		System.out.println(fname[i]);
		     
		} 
		  
	}
		
}
