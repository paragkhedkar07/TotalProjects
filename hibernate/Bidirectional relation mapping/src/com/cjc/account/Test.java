package com.cjc.account;

import org.hibernate.Session;

public class Test 
{
   public static void main(String[] args) {
	
	   Accountplus acp=new Accountplus();
	               acp.setAcpid(102);
	               acp.setAmt(60000);
	               
	   Account ac=new Account();
	           ac.setAcno(5);
	           ac.setName("prg");
	           
	           ac.setAcp(acp);
	           acp.setAccount(ac);
	           
	  
	   Session session=HibernateUtil.getSessionFactory().openSession();
	           session.save(ac);
	           session.beginTransaction().commit();
	   
	   
	   
	   
	   
}
	
	
}
