package com.institute.serviceimpl;
import java.util.*;

import com.institute.*;
import com.institute.model.Batch;
import com.institute.model.Course;
import com.institute.model.Faculty;
import com.institute.model.Student;
import com.institute.servicel.Service;
public class ServiceImplementation implements Service
{
  Scanner sc=new Scanner(System.in);
    List list=new ArrayList();
   
  
	
    public void addCourse()
    {
    	Course cr=new Course();
    	System.out.println("enter course");
    	String courseName=sc.next();
    	cr.setCname(courseName);
    	System.out.println("enter course id");
    	int courseId=sc.nextInt();
    	cr.setCid(courseId);
    
    	list.add(cr);
    	System.out.println("course added sussessfuly");
    }
    public void viewCourse()
    {
      Iterator itr=list.iterator();
      System.out.println("course list");
      while(itr.hasNext())
      {
    	Course c=(Course)itr.next();
    	
    	System.out.println("course id="+c.getCid());
    	System.out.println("course name="+c.getCname());
      }
     }
    List list1=new ArrayList();
    public void addFaculty()
    { Faculty fy=new Faculty();
    	System.out.println("enter  faculty name");
    	String facultyName=sc.next();
    	fy.setFname(facultyName);
    	System.out.println("enter faculty id");
    	int facultyId=sc.nextInt();
    	fy.setFid(facultyId);
    
    	list1.add(fy);
    	System.out.println("faculty added successfuly");
    }
    public void viewFaculty()
    {
    	 Iterator itr=list1.iterator();
         System.out.println("Faculty list");
         while(itr.hasNext())
         {
       	Faculty f=(Faculty)itr.next();
       	System.out.println("faculty id="+f.getFid());
       	System.out.println("faculty name="+f.getFname());
    }
    }
      List list2=new ArrayList();
    public void addStudent()
    { Student s=new Student();
    	System.out.println("enter Student name");
    	String studentName=sc.next();
    	s.setSname(studentName);
    	System.out.println("enter student id");
    	int studentId=sc.nextInt();
    	s.setSid(studentId);
    
    	list2.add(s);
    	System.out.println("student added successfuly");
    }
    public void viewStudent()
    {
    	 Iterator itr=list2.iterator();
         System.out.println("Student list");
         while(itr.hasNext())
         {
       	Student s=(Student)itr.next();
       	System.out.println("Student id="+s.getSid());
       	System.out.println("Student name="+s.getSname());
    }
    }
    List list4=new ArrayList();
    public void addBatch()
    {Batch b=new Batch();
    	System.out.println("enter batch");
    	String BatchName=sc.next();
    	b.setBname(BatchName);
    	System.out.println("enter batch id");
    	int BatchId=sc.nextInt();
    	b.setBid(BatchId);
    
    	list4.add(b);
    	System.out.println("batch added successfuly");
    }
    public void viewBatch()
    {
    	 Iterator itr=list4.iterator();
         System.out.println("Batch list");
         while(itr.hasNext())
         {
       	Batch b=(Batch)itr.next();
       	System.out.println("Batch id="+b.getBid());
       	System.out.println("batch name="+b.getBname());
    }
    }	
    }
    
	
	

