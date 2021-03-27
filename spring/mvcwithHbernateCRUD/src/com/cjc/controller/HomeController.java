package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.HomeService;

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
		int id=hs.savedata(stu);
		if(id>0)
		{
			return "login";
			
		}
		else{
			
	  return "register";
		}
		 
	 }
  @RequestMapping("/login")
	 public String loginCheck(@RequestParam("un")String uname,@RequestParam("ps")String pass,Model m)
	 {
		List<Student>list=hs.loginCheck(uname,pass);
		m.addAttribute("data", list); 
            return "success";
            
	 }     
            
            @RequestMapping("/delete")
       	 public String deleteRecord(@RequestParam("rollno")int rollno,Model m)
       	 {
       		List<Student>list1=hs.deleteRecord(rollno);
       		m.addAttribute("data", list1); 
                   return "success";
                           
       	 }    
             @RequestMapping("/edit")
         public String editRecord(@RequestParam("rollno")int rollno,Model m)
         {
           Student st=hs.editRecord(rollno);
          m.addAttribute("stu", st); 
               return "update";
               
                                     
         }                   
         
             @RequestMapping("/update")
        	 public String updateRecord(@ModelAttribute("s") Student stu,Model m)
        	 {
        		List<Student>list2=hs.updateRecord(stu);
        		m.addAttribute("data", list2); 
                    return "success";
                                   
            
        	 }  
            
            
            
            
            
            
}