package com.cjc.hibernateutility;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test 
{
  public static void main(String[] args) {
	
	 
	  Session session=HibernateUtil.getSessionFactory().openSession();
	  MultiIdentifierLoadAccess mid=session.byMultipleIds(Student.class);
	              
	  
	  
	  
	  List<Student>list= mid.multiLoad(2,3,1);
			  //session.createQuery("From Student",Student.class).getResultList();
	  
	  for(Student stu:list)
	  {
		  
		  System.out.println(stu.getRollno());
		  System.out.println(stu.getName());
		  System.out.println(stu.getAddr());
	  }
	  
	  //to fatch multiple data that u want
	  
	  
	  
	  
	  
}
	
	
	
	
}
