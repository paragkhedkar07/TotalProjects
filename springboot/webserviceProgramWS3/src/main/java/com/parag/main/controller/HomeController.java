package com.parag.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parag.main.model.Student;

@RestController
public class HomeController 
{
	@CrossOrigin("*")
  @RequestMapping("/logdata/{uid}/{pid}")
  
	  public List logincheck(@PathVariable("uid") String uid, @PathVariable("pid") String pid)
	  {
		System.out.println(uid+""+pid);
	    Student s=new Student();
	    s.setName("parag");
	    s.setAddr("kn");
	    
	    List l=new ArrayList();
	    		l.add(s);
	       return l;
	  
	  }  
	  
  
	
	

}
