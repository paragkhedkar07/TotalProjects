package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.service.ServiceI;


	
	@RestController
	public class HomeController 
	{
		@Autowired
		ServiceI si ;
		@PostMapping("/hh")
		public void get() {
			System.out.println("get called");
		}
		
		@PostMapping("/regs")
		public Branch savedata(@RequestBody Branch b) 
		{
			System.out.println(b.getBranchName());
			System.out.println(b.getBranchAddress().getCity());
			si.save(b);
			
			return b;
		}
		

	}


