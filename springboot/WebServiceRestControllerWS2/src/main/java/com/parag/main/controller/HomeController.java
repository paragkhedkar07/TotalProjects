package com.parag.main.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parag.main.model.Student;

@RestController
public class HomeController {
	@RequestMapping("/")
	public Student logincheck()
	{
		Student s=new Student();
		s.setRollno(45);
		s.setName("parag");
		s.setAddress("kn");
				
		return s;
		
	}	}