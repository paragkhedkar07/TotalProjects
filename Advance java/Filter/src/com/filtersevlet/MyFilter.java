package com.filtersevlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/log")
public class MyFilter implements Filter
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException {
		System.out.println("in filter");
		String un=req.getParameter("uname");
		
		   if(un !=null)
		   {
			   System.out.println("enter your un-");
			   
			  
			   
			   RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			   rd.forward(req, res);
		}
		   else
		   {
			  
		   }
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
