package com.webcore.app.loan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.User;
import com.webcore.app.loan.main.service.HomeService;

@RestController
public class HomeController 
{   
	
	@Autowired
	HomeService hs;
	
	public void get()
	{
		System.out.println("GET CALLED");
	}
	@PostMapping("/reg")
	public User m1(@RequestBody User u)
	{
		System.out.println(u.getUserDob());
		
		hs.savedata(u);
		return u;
	}
	
	@RequestMapping("/getdata")
		public List<User> getdata()
		{
		List<User>u=hs.getdata();
		return u;
		
		
		}
		
	
	

}
