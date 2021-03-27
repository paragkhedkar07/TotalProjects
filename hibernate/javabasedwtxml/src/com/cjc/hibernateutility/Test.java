package com.cjc.hibernateutility;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test 
{
  public static void main(String[] args) {
	
	  SessionFactory sf=HibernateUtil.getSessionFactory();
	//  Session session=HibernateUtil.getSessionFactory().openSession();
	  Session session=sf.openSession();
	   session.load(Student.class,1);
	  
	        Student s=new Student();
	        s.setRollno(1);
	        s.setName("prg");
	        s.setAddr("kv");
	        session.save(s);
	        
	  session.beginTransaction().commit();
	  sf.close();
	  
	  
	  
	  
	  
	/*  List<Student>list=session.createQuery("From Student",Student.class).getResultList();
	  
	  for(Student stu:list)
	  {
		  
		  System.out.println(stu.getRollno());
		  System.out.println(stu.getName());
		  System.out.println(stu.getAddr());
	  }
	  */
	  
	  
	  
	  
	  
	  
}
	
	
	
	
}
