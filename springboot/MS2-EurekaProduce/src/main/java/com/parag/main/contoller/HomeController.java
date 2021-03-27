package com.parag.main.contoller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.parag.main.model.Employee;

@RestController
public class HomeController {
	

	@RequestMapping("/getAllData")
	public String m1()
	{
		Employee e=new Employee();
		e.setId(1);
		e.setName("parag");
        e.setAddr("karvenagar");
        List l=new ArrayList();
        l.add(e);
		return "Exam";
		
		
	}
	
}
