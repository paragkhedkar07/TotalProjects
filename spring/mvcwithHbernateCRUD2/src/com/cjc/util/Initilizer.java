package com.cjc.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initilizer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		
		AnnotationConfigWebApplicationContext apc=new AnnotationConfigWebApplicationContext();
		                                      apc.register(AppConfig.class);
		                                      apc.setServletContext(sc);
		                                      
		                      ServletRegistration.Dynamic d=sc.addServlet("dispatcher", new DispatcherServlet(apc)); 
		                                            d.addMapping("/");
		
		
		
		
	}

}
