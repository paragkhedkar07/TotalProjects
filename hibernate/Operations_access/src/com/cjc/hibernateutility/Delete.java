package com.cjc.hibernateutility;

import org.hibernate.Session;

public class Delete 
{
	public static void main(String[] args) {
		
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	    Student stu=session.get(Student.class,7);
	                session.delete(stu);
	                session.beginTransaction().commit();
	                
	
	
	}
	
	
}
