package com.cjc.main.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;
import com.cjc.main.util.PdfGenerator;


@Controller
public class HomeController 
{
  @Autowired
  HomeService hs;
  @RequestMapping("/")
	public String prelogin()
	{
		return "login";
	
	}
@RequestMapping("/register")
	 public String preregister()
	 {
		return "register";
		 
	}

@RequestMapping("/reg")
	 public String registerData(@ModelAttribute("s") Student stu)
	 {
		hs.savedata(stu);
		
			return "login";
			
		}
@RequestMapping("/login")
public String loginCheck(@RequestParam("un")String uname,@RequestParam("ps")String pass,Model m)
{
	Iterable<Student>list=new ArrayList<Student>();
	if(uname.equals("admin")&&pass.equals("admin"))
	{
		
	list=hs.getAlldata();

    }
	
	else
	{
		list=hs.loginCheck(uname,pass);
		
	}
	m.addAttribute("data",list); 
	 return "success";
	
}
@RequestMapping("/delete")
	 public String deleteRecord(@RequestParam("rollno")int rollno,Model m)
	 {
	       hs.deleteRecord(rollno);
		Iterable<Student>list1=hs.getAlldata();
		m.addAttribute("data", list1); 
          return "success";
                  
	 }   

@RequestMapping("/edit")
public String editRecord(@RequestParam("rollno")int rollno,Model m)
{
    Student st1=hs.editRecord(rollno);

	m.addAttribute("stu",st1); 
     return "update";
             
}   
   @RequestMapping("/update")
public String updateData(@ModelAttribute("s") Student stu,Model m)
{
	hs.savedata(stu);
	Iterable<Student>st=hs.getAlldata();
	m.addAttribute("data",st);
		return "success";
		
	}

   @RequestMapping(value = "/gen", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	  public ResponseEntity<InputStreamResource> studentReport() throws IOException {

	  	List<Student> list = (List<Student>) hs.findAll();

	  	ByteArrayInputStream bis = PdfGenerator.studentReport(list);

	  	HttpHeaders headers = new HttpHeaders();
	  	headers.add("Content-Disposition", "inline; filename=studentreport.pdf");

	  	return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
	  			.body(new InputStreamResource(bis));
	  }



}