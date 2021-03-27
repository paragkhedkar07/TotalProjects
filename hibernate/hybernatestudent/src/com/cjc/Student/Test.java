package com.cjc.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

public class Test 
{
  public static void main(String[] args) {
	
	  StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	  MetadataSources mds=new MetadataSources(registry);
	  Metadata md=mds.getMetadataBuilder().build();
	  SessionFactory sessionf=md.getSessionFactoryBuilder().build();
	  Session session=sessionf.openSession();
	  
	  Student stu=new Student();
	          stu.setRollno(1);
	          stu.setName("parag");
	          stu.setAddr("karvenagar");
	          session.save(stu);
	          session.beginTransaction().commit();
	                      // to store data in db
	  
}
	
}

