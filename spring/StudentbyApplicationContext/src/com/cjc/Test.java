package com.cjc;


import java.sql.Connection;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) {
		
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");

		 Student s=apc.getBean("a",Student.class);  
           s.m1();
           s.m2();
             
	
	
}
}