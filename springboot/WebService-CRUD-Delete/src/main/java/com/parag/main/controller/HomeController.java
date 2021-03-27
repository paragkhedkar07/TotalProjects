package com.parag.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

		@RequestMapping("/delete")
		public void deletedata(@PathVariable("rollno") int rollno)
		{
			hs.deleteuser(rollno);
		}
		
	
	
}
