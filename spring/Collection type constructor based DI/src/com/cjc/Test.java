package com.cjc;

/*import java.util.List;
import java.util.Map;
import java.util.Set;*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) {
		
	
  ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
Student s=apc.getBean("s",Student.class);  
  System.out.println(s);
 
/*  List <String>l=s.getMyList();
  for(String s1:l)
  {
	  System.out.println(s1);
	  
  }
  
  Set <String>set=s.getMySet();
  for(String s2:set)
  {
	  System.out.println(s2);
	  
  }
  
  Map <String,String>map=s.getMyMap();
  
  Set<String>keys=map.keySet();
  for(String key:keys)
  {
	  System.out.println(key);
	  String s3=map.get(key);
	  System.out.println(s3);
	  
  }
  
  
	}*/
	}	
}
