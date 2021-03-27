package com.cjc;


import java.sql.Connection;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) {
		
	
 Resource r=new ClassPathResource("bean.xml");
		
  BeanFactory b=new XmlBeanFactory(r);
   Student s=(Student)b.getBean("a",Student.class);  
           s.m1();
           s.m2();
             
	
	
}
}