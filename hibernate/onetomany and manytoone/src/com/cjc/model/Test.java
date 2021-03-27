package com.cjc.model;

import org.hibernate.Session;

public class Test 
{
   public static void main(String[] args) {
	
	  Department dt=new Department();
	              dt.setName("CSE");
	              
	  Employee e1=new Employee();
	           
	           e1.setName("parag");
	           e1.setDesignation("softwareengg");
	           
	           
	           Employee e2=new Employee();
	           
	           e2.setName("amay");
	           e2.setDesignation("teamleader");
	            
	         e1.setDept(dt);
	         e2.setDept(dt);
	   
	         dt.getSemp().add(e1);
	         dt.getSemp().add(e2);
	   
	     
	   Session session=HibernateUtil.getSessionFactory().openSession();
	           session.save(dt);
	           session.beginTransaction().commit();
	   }
	
	
}
