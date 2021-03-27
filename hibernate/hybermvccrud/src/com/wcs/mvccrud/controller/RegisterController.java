package com.wcs.mvccrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.mvccrud.model.Student;
import com.wcs.mvccrud.serviceimplement.ServiceImpl;

@WebServlet("/register")
public class RegisterController extends HttpServlet
{
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{   System.out.println("hello");
	    ServiceImpl ser=new ServiceImpl();
		Student s=new Student();
		s.setRollno(Integer.parseInt(request.getParameter("rollno")));
		s.setName(request.getParameter("name"));
		s.setAddr(request.getParameter("addr"));
		s.setUn(request.getParameter("un"));
		s.setPs(request.getParameter("ps"));	
		ser.saveStudent(s);
		System.out.println("in controller");
 		
	      response.sendRedirect("login.jsp");
	
	
	
	
	
	
}}