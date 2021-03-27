package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
	  Student s=apc.getBean("stu", Student.class);
	  System.out.println(s.getRollno());
	  System.out.println(s.getName());
	  System.out.println(s.getAddress());
	  System.out.println(s.getCollegeName());
	  
	  ApplicationContext apc1=new ClassPathXmlApplicationContext("bean1.xml");
	  Student s1=apc1.getBean("stu1", Student.class);
	  System.out.println(s1.getRollno());
	  System.out.println(s1.getName());
	  System.out.println(s1.getAddress());
	  System.out.println(s1.getCollegeName());
	  
	  ApplicationContext apc2=new ClassPathXmlApplicationContext("bean2.xml");
	  Student s2=apc2.getBean("stu2", Student.class);
	  System.out.println(s2.getRollno());
	  System.out.println(s2.getName());
	  System.out.println(s2.getAddress());
	  System.out.println(s2.getCollegeName());
	
	
}
}
