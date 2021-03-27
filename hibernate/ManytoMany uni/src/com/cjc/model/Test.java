package com.cjc.model;

import org.hibernate.Session;

public class Test 
{
   public static void main(String[] args) {
	
	Course c1=new Course();
	       c1.setName("java");
	       
    Course c2=new Course();
	       c2.setName("python");
	       
	Student s=new Student();
	        s.setName("parag");
	        s.setAddr("karvenagar");
	        
	        s.getScourse().add(c1);
	        s.getScourse().add(c2);
	        
	       
	   Session session=HibernateUtil.getSessionFactory().openSession();
	           session.save(s);
	           session.beginTransaction().commit();
	   }
	
	
}
