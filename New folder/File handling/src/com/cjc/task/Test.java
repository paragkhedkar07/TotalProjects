package com.cjc.task;
import java.io.*;
public class Test
{
public static void main(String[] args) throws IOException
{
	FileReader f=new FileReader("C:\\Users\\Parag\\OneDrive\\Desktop\\java\\data.txt");
	BufferedReader b=new BufferedReader(f);
	Student [] sarray=new Student[10];
	    int count=0;
	String s=b.readLine();
	while(s!=null)
	{
		System.out.println(s);
		String []s1=s.split(",");
		Student s2=new Student();
		s2.setId(Integer.parseInt(s1[0]));
		s2.setName(s1[1]);
		s2.setAddr(s1[2]);
		sarray[count]=s2;
		count++;
		s=b.readLine();
	}
	 
	b.close();
}
}
