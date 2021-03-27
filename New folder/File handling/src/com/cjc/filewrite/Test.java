package com.cjc.filewrite;

import java.io.*;


public class Test 
{
	public static void main(String[] args)throws IOException
	  {
		File f=new File("C:\\cjc\\vfhn.txt");
		    f.createNewFile();
		FileWriter f1=new FileWriter(f);  
		           f1.write("abc");
		           f1.write("\r\n");
		           f1.write("65");
		           f1.write("34");
		           f1.write("56");
		         
		         char [] c={'x','y','z'};
		             f1.write(c);
		       
		           f1.flush();
		           f1.close();
		        
		           
		           
	  }
}
