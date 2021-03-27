package com.cjc.Task2;

import java.io.*;

public class Test 
{

	public static void main(String[] args) throws IOException
	{
		FileReader f=new FileReader("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\file1.txt");
		BufferedReader b=new BufferedReader(f);
		PrintWriter p=new PrintWriter("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\file3.txt");
		 
		String s=b.readLine();
		while(s!=null)
		{
			System.out.println(s);
			 p.println(s);
			s=b.readLine();
		}
		FileReader f1=new FileReader("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\file2.txt");
		BufferedReader b1=new BufferedReader(f1);
		
		String s1=b1.readLine();
		while(s1!=null)
		{
			System.out.println(s1);
			 p.println(s1);
			s1=b1.readLine();
		}
		
		
		 b.close();
		b1.close();
		p.flush();
		p.close();
	}
}
