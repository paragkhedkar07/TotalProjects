package com.wcs.mvccrud.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.wcs.mvccrud.model.Student;
import com.wcs.mvccrud.serviceImplement.ServiceImpl;
import com.wcs.mvccrud.serviceInterface.ServiceIntra;

@WebServlet(urlPatterns="/log")
public class LoginController extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{  
		ServiceIntra ser=new ServiceImpl();
	
		String un=req.getParameter("uname");
		String ps=req.getParameter("pass");
		
	
			  List list=ser.loginStudent(un,ps);
	/*
			  req.setAttribute("data", list);
		     
	RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
	                  rd.forward(req, res);
		      
		  */
			  if(!list.isEmpty())
			   {
					  
					  req.setAttribute("data", list);
					  RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
	                  rd.forward(req, res);
				 }
				  else
				  {
					  RequestDispatcher rd=  req.getRequestDispatcher("login.jsp");
					  rd.forward(req, res);
			}
}
}