package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) {
		
	
  ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
  Student s=apc.getBean("stu",Student.class);
 System.out.println(s.getRollno());
 System.out.println(s.getName());
 System.out.println("address:-");
 System.out.println(s.getAddr().getCityname());
 System.out.println(s.getAddr().getAreaname());
	}
	
}
