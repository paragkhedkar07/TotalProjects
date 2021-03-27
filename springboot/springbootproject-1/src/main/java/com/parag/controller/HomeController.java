package com.parag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parag.model.Student;

@Controller
public class HomeController
{
  @RequestMapping("/")
  public String login()
  {
	  return "login";
	  
	  
  }
	
  @RequestMapping("/log")
  public String prelogin()
  {
	  return "register";
	  
	  
  }
	
  @RequestMapping("/reg")
  public String preregister(@ModelAttribute Student stu,Model m)
  {
	  m.addAttribute("data",stu);
	  
	  return "success";
	  
	  
  }
	
	
}
