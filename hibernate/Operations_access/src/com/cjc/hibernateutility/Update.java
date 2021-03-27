package com.cjc.hibernateutility;

import org.hibernate.Session;

public class Update 
{
	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		    Student stu=session.get(Student.class,2);
		                 stu.setAddr("pune");
		                session.update(stu);
		                session.beginTransaction().commit();
		                
		
		
		}
		
	
	
}
