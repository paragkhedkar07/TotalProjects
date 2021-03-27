package com.parag.main.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rs;

	@RequestMapping("/getdata")
	public List m1()
	{
		String url="http://localhost:8083/getAllData";
		List l=rs.getForObject(url,List.class);
		
		return l;
		
		
	}
	
}
