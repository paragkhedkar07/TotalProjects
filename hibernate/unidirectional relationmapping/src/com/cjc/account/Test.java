package com.cjc.account;

import org.hibernate.Session;

public class Test 
{
   public static void main(String[] args) {
	
	   Accountplus acp=new Accountplus();
	               acp.setAcpid(101);
	               acp.setAmt(50000);
	               
	   Account ac=new Account();
	           ac.setAcno(1);
	           ac.setName("parag");
	           ac.setAcp(acp);
	           
	  
	   Session session=HibernateUtil.getSessionFactory().openSession();
	           session.save(ac);
	           session.beginTransaction().commit();
	   
	   
	   
	   
	   
}
	
	
}
