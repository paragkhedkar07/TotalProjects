package com.cjc.student;

import org.hibernate.Session;

public class Test 
{
  public static void main(String[] args) 
  {
	Session session=HibernateUtil.getSessionFactory().openSession();
	Student stu=new Student();
	stu.setRollno(7);
	stu.setName("par");
	stu.setAddr("dsjcun");
	session.save(stu);
	session.beginTransaction().commit();
	  
	  
	  
	  
	  
}
	
	
	
	
	
	
}
