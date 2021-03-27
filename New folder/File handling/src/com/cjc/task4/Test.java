package com.cjc.task4;

import java.io.*;

public class Test 
{

	public static void main(String[] args) throws IOException
	{
	
		FileReader f1=new FileReader("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\file1.txt");
		FileReader f2=new FileReader("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\file2.txt");
		BufferedReader b1=new BufferedReader(f1);
		BufferedReader b2=new BufferedReader(f2);
		PrintWriter p=new PrintWriter("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\file4.txt");
		String s1=b1.readLine();
		String s2=b2.readLine();
		while(s1!=null||s2!=null)
		{
			p.println(s1);
			p.println(s2);
			System.out.println(s1);
			System.out.println(s2);
			s1=b1.readLine();
			
		 	s2=b2.readLine();
		 	
		}	
		 	p.flush();
		 	p.close();
		 	
		

	
	}}