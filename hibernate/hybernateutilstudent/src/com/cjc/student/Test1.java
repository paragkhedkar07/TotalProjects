package com.cjc.student;

import org.hibernate.Session;

public class Test1 
{
	public static void main(String[] args) {
		
	
  Session session=HibernateUtil.getSessionFactory().openSession();
  
  Student stu=session.get(Student.class, 1);
  System.out.println(stu);
    if(stu!=null)
    {
    	System.out.println(stu.getRollno());
    	System.out.println(stu.getName());
    	System.out.println(stu.getAddr());
    }
	
	
	}
	
}
