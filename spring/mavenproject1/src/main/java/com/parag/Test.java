package com.parag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
	
  ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
  Connection con=(Connection)apc.getBean("a");
              con.commit();
              con.rollback();
	
	
}
}