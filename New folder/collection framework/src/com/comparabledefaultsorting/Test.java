package com.comparabledefaultsorting;
import java.util.*;
public class Test
{
public static void main(String[] args) 
{
	Set<Student1>s=new TreeSet<>();
	
	Student1 stu=new Student1();
	        stu.setRollno(1);
	        stu.setName("parag");
	        
	Student1 stu1=new Student1(); 
	        stu1.setRollno(2);
	        stu1.setName("amit");
	        
	Student1 stu2=new Student1();
	        stu2.setRollno(3);
	        stu2.setName("amay");
	        
	        s.add(stu2);
	        s.add(stu1);
	        s.add(stu);
	        
	        for(Student1 s1:s)
	        {
	        System.out.println(s1.getRollno());
	        System.out.println(s1.getName());
	        	
	        }
	
	
	
	
	
}
}
