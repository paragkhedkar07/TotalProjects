package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/first")
public class FirstServlet extends HttpServlet
{
  @Override
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
	  System.out.println("hello----");
	  
	  RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
	                    rd.forward(request, response);
    }
	
	
	
}
