package com.comparatortreeset;
import java.util.*;

public class Test
{
    public static void main(String[] args) 
    {
    
   Set<Student>s=null;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your choice 1-rollno,2-name");
  int ch=sc.nextInt();
  switch(ch)
  {
	  case 1:
	  {
		  s=new TreeSet<>(new RollNofort());
		  break;
		  
	  }
	  case 2:
	  {
		  s=new TreeSet<>(new Namefort());
		  break;
	  }}
	  
	  Student stu=new Student();
      stu.setRollno(1);
      stu.setName("parag");
      
      Student stu1=new Student(); 
      stu1.setRollno(2);
      stu1.setName("amit");
      
      Student stu2=new Student();
      stu2.setRollno(3);
      stu2.setName("amay");
      
      s.add(stu2);
      s.add(stu1);
      s.add(stu);
      
      for(Student s1:s)
      {
      System.out.println(s1.getRollno());
      System.out.println(s1.getName());
      	
      }



    }}

  
	
	


