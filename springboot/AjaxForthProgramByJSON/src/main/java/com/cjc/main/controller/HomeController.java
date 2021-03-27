package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.main.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController 
{
  @RequestMapping("/")
  public String m1()
  {
	  return "index";
	  
  }
	
  @RequestMapping(value="/log/{uname}")
  @ResponseBody
  public String m2(@PathVariable String uname) throws JsonProcessingException
  {
	  System.out.println(uname);
	  
	 Student s=new Student(); 
	         s.setRollno(1);
	         s.setName("parag");
	 ObjectMapper obj=new ObjectMapper();
	 String s1=obj.writeValueAsString(s);
	  
	  return s1;
	  
  }
	
	
	
}
