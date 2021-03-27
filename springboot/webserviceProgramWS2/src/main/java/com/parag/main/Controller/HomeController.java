package com.parag.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("*")

@RestController
public class HomeController {
 @Autowired
 
RestTemplate rt;
 
@RequestMapping(value="/log/{uid}/{pid}")

public List logincheck(@PathVariable("uid")String uid,@PathVariable("pid")String pid)
{
	System.out.println(uid+""+pid);
	String url="http://localhost:8083/logdata/"+ uid + "/" + pid;
	List l=rt.getForObject(url,List.class);
	return l;


}
 
	
}
