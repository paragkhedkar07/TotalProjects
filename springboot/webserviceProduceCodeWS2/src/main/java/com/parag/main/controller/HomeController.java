package com.parag.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parag.main.model.Student;

@RestController
public class HomeController {
	
	@RequestMapping("/getalldata")
	public List login()
	{
	  Student s=new Student();
	          s.setRollno(1);
	          s.setName("parag");
	          s.setAddress("wardha");
	          
	         List l=new ArrayList();
	         l.add(s);
	         return l;
	         
	}
	@RequestMapping("/reg")
	public String register(@RequestBody Student s1)
	{
		System.out.println(s1.getAddress());
		return "welcome";
	}

}
