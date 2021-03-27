package com.parag.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
  @Autowired
     RestTemplate rt;
  @RequestMapping("/getdata")
public List logincheck()
{
String url="http://localhost:8072/getalldata";
List l=rt.getForObject (url,List.class);
return l;

}

  
  
	
}
