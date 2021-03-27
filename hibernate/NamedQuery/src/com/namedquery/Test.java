package com.namedquery;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test 
{
   public static void main(String[] args) 
{
	   Session session=HibernateUtil.getSessionFactory().openSession();
	Query<Student>query=session.createNamedQuery("stu_record", Student.class);
	
	              query.setParameter("nm", "abc");
	              List<Student>list=query.getResultList();
	              
	         for(Student stu:list)
	         {
	        	 System.out.println(stu.getRollno());
	        	 System.out.println(stu.getName());
	        	 System.out.println(stu.getAddr());
	         }
	    }
	}
