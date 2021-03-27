package com.cjc.filesize;
import java.io.*;
public class Test 
{
  public static void main(String[] args) throws IOException
 {
	File f=new File("cjc.txt");
	System.out.println("size of file in bytes="+f.length());
	System.out.println("size of file in kilobytes="+(double)f.length()/1024);
	System.out.println("size of file in meghabytes="+(double)f.length()/(1024*1024));
	  
}
	
	
	
}
