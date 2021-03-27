package com.parag.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parag.main.model.Student;
import com.parag.main.service.HomeService;

@RestController
public class HomeController
{
	 @Autowired
	  HomeService hs;
	 
	 
	 

	@RequestMapping("/getdata")
		 public String getData(@RequestBody Student stu)
		 {
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
			hs.getData(stu);
			
				return "getdata successful";
				
			}
	
	
	
}
