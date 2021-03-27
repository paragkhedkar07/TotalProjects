package com.crts.app.pbl.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/getdata")
public String m1()
{
return "welcome to client";		

}
	
}
