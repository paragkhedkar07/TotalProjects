package com.cjc.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test 
{ 
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration().configure();
	SessionFactory	sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Employee e=new Employee();
	session.save(e);
	session.beginTransaction().commit();
		
		
		
		
		
		
	}

	
	
	
}
