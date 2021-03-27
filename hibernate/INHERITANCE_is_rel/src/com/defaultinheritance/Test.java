package com.defaultinheritance;

import org.hibernate.Session;

public class Test 
{
  public static void main(String[] args) {
	  
	  Karve karve= new Karve();
	        karve.setId(01);
	        karve.setSname("parag");
	        karve.setCname("java");
	        karve.setWeek("bc102");
	  
	 Akurdi akurdi=new Akurdi();
	        akurdi.setId(56);
	        akurdi.setSname("pravin");
	        akurdi.setCname("python");
	        akurdi.setReg("bh234");
	        
	      Session session=HibernateUtil.getSessionFactory().openSession();  
	              session.save(karve);
	              session.save(akurdi);
	              
	              session.beginTransaction().commit();
	  
	 }
  }
