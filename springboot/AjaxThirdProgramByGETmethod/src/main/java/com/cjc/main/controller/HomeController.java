package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
  public String m2(@PathVariable String uname)
  {
	  System.out.println(uname);
	  return "uname";
	  
  }
	
	
	
}
