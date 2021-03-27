package com.wcs.mvccrud.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.wcs.mvccrud.model.Student;
import com.wcs.mvccrud.serviceImplement.ServiceImpl;
import com.wcs.mvccrud.serviceInterface.ServiceIntra;



@WebServlet(urlPatterns="/register")
public class RegisterController extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{   System.out.println("hello");
	    ServiceImpl ser=new ServiceImpl();
		Student s=new Student();
		s.setRollno(Integer.parseInt(req.getParameter("rollno")));
		s.setName(req.getParameter("name"));
		s.setAddr(req.getParameter("addr"));
		s.setUn(req.getParameter("un"));
		s.setPs(req.getParameter("ps"));
		ser.saveStudent(s);
		System.out.println("in controller");
 		
	      res.sendRedirect("login.jsp");
	
	
	
	
	
	
}}