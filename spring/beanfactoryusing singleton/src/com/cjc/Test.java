package com.cjc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		
		 Resource r=new ClassPathResource("bean.xml");
				
		  BeanFactory b=new XmlBeanFactory(r);
		   Student s=(Student)b.getBean("a"); 
		       System.out.println(s);
		        
		             
		       Student s1=(Student)b.getBean("a") ;
		       System.out.println(s1);
		        
			
		}
}
