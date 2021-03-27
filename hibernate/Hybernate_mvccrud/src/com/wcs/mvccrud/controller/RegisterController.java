package com.wcs.mvccrud.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.mvccrud.ServiceImplement.ServiceImpl;
import com.wcs.mvccrud.ServiceInterface.ServiceIntra;
import com.wcs.mvccrud.model.Student;

@WebServlet(urlPatterns="/register")
public class RegisterController extends HttpServlet
{
  protected void Service(HttpServletRequest req,HttpServletResponse res) throws IOException
  {
	  System.out.println("hello");
	  ServiceIntra ser=new ServiceImpl();
	  Student s=new Student();
	  s.setRollno(Integer.parseInt(req.getParameter("rollno")));
	  s.setName(req.getParameter("name"));
	  s.setAddr(req.getParameter("addr"));
	  s.setUn(req.getParameter("un"));
	  s.setPs(req.getParameter("ps"));
	     ser.saveStudent(s);
	     System.out.println("in registercontroller");
	     res.sendRedirect("login.jsp");
	  

  }	
	
	
	
	
}
