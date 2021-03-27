package com.cjc.filereadfullfiles;

import java.io.FileReader;
import java.io.IOException;

public class Test {
	 public static void main(String[] args) throws IOException
	  {
		FileReader f=new FileReader("C:\\cjc\\xyz.txt");
		int c=f.read();
		while(c>=0)
		{
		System.out.println((char)f.read());
		    c=f.read();
		}
		        
		  f.close();        
		
	}
}
