  package com.cjc.Bufferedreader;

import java.io.*;


public class Test
{
public static void main(String[] args) throws IOException
{
	FileReader f=new FileReader("cjc.txt");
	BufferedReader b=new BufferedReader(f);
	//      b.read();
	/*  String s=b.readLine();
	  System.out.println(s);
	s=b.readLine();
	System.out.println(s);
	s=b.readLine();
	System.out.println(s);
	  b.close(); */
	String s=b.readLine();
	while(s!=null)
	{
		System.out.println(s);
		s=b.readLine();
	}
	 b.close();
	
	
	
}
	
}
