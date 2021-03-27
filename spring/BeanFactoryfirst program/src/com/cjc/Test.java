package com.cjc;

import javax.annotation.Resources;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
  public static void main(String[] args) 
  {
	Resource r=new ClassPathResource("bean.xml");
	 BeanFactory b=new XmlBeanFactory(r);
Connection con=(Connection)b.getBean("a");
	       con.commit();
	       con.rollback();
	       
	      Resource r1=new ClassPathResource("bean.xml");
	  	 BeanFactory b1=new XmlBeanFactory(r1);
	       Connection con1=(Connection)b1.getBean("b");
	       con1.commit();
	       con1.rollback(); 
}

	
}
