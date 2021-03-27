package com.cjc.typecastingfilereader;

import java.io.FileReader;
import java.io.IOException;

public class Test {
	 public static void main(String[] args) throws IOException
	  {
		FileReader f=new FileReader("C:\\cjc\\xyz.txt");
		int c=f.read();
		System.out.println((char)f.read());
		    c=f.read();
		    System.out.println((char )c);
		        
		         
		
	}
}
