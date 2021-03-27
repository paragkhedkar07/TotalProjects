package com.cjc.student;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil 
{
  private static SessionFactory sessionFactory;
  private static StandardServiceRegistry registry;
   
  public static SessionFactory getSessionFactory()
  {
	  if(sessionFactory==null)
	  {
		 registry=new StandardServiceRegistryBuilder().configure().build();
		 MetadataSources mds=new MetadataSources(registry);
		 Metadata md=mds.getMetadataBuilder().build();
		 sessionFactory=md.getSessionFactoryBuilder().build();
		  	  
	  }
	
	  
	  return sessionFactory;
	  
  }
	
	
}
