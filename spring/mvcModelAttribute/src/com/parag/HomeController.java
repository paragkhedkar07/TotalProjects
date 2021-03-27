package com.parag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController 
{
@RequestMapping("/reg/{un}")
  public String loginCheck(@PathVariable("un")String uname)
  {
	System.out.println(uname);
	return "success";
	
  }
	
	
}
