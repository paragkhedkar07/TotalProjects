package com.studentphone;

import org.hibernate.Session;

public class Test 
{
   public static void main(String[] args) 
{
	Student s=new Student();
	        s.setRollno(01);
	        s.setName("parag");
	        s.setAddr("karvenagar");
	        
	PhoneNo ph=new PhoneNo();
	        ph.setId(1);
	        ph.setPhno("8928964573");     
	        ph.setStu(s);
	        
	        
    PhoneNo ph1=new PhoneNo();
	        ph1.setId(2);
	        ph1.setPhno("9828964574");
	        ph1.setStu(s);
	                
	   s.getSphone().add(ph);
	   s.getSphone().add(ph1);
	   
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   session.save(s);
	   session.beginTransaction().commit();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
}
}