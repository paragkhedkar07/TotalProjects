package com.cjc.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan
@Configuration
public class AppConfig 
{
  @Bean
  public  InternalResourseViewResolver ir()
  {
	  InternalResourceViewResolver irvr=new InternalResourceViewResolver();
	                    irvr.setSuffix(".jsp");
	                    
	                    return irvr;
	  
	  
	  
	  
	  
  }
}
