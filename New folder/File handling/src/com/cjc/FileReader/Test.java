package com.cjc.FileReader;
import java.io.*;
public class Test 
{
  public static void main(String[] args) throws IOException
  {
	FileReader f=new FileReader("C:\\cjc\\xyz.txt");
	 System.out.println(f.read());
	 System.out.println(f.read()); 
	 System.out.println(f.read()); 
	 System.out.println(f.read()); 
	 System.out.println(f.read()); 
	         
}
	
	
	
}
