package com.parag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController 
{
@RequestMapping(name="/log")
  public String loginCheck()
  {
	System.out.println("parag");
	return "success";
	
  }
	
	
}
