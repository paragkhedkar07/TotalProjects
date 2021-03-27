package com.filereadandsort;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args)    throws IOException
	  {
		
		Set<FileDemo>fd=new TreeSet(new Sort());
		File f=new File("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\cjc"); 
		String [] s=f.list();
		for(int i=0;i<s.length;i++)
		{
			File f1=new File(f,s[i]);
			String fname=f1.getName();
			long size=f1.length();
			
			FileDemo fg=new FileDemo();
			         fg.setLength((int)size);
			         fg.setName(fname);
		//System.out.println(s[i]);
	//	System.out.println((long)f1.length()/1024);
		fd.add(fg);
	} 
		for(FileDemo ff:fd) 
		{
			System.out.println(ff.getName()+" "+ff.getLength());
			
		}
	}
}
