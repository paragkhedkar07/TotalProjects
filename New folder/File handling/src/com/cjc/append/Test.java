package com.cjc.append;
import java.io.*;
public class Test 
{
  public static void main(String[] args)throws IOException
  {
	  
  FileWriter fw=new FileWriter("C:\\cjc\\xyz.txt",true);
     fw.write(97);
	 fw.flush();
	 fw.close();
	  
}
	
	
}
