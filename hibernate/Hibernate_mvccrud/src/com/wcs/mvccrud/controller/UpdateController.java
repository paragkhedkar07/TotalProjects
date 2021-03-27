package com.wcs.mvccrud.controller;

import java.io.IOException;
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

@WebServlet(urlPatterns="/update")
public class UpdateController extends HttpServlet
{
  protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{   
	  ServiceIntra ser=new ServiceImpl();
		Student s=new Student();
		s.setRollno(Integer.parseInt(req.getParameter("Rollno")));
		s.setName(req.getParameter("Name"));
		s.setAddr(req.getParameter("Addr"));
		s.setUn(req.getParameter("Un"));
		s.setPs(req.getParameter("Ps"));
		  ser.UpdateRecord(s);
		
		List<Student> list=ser.getAllData1();
		
		 req.setAttribute("data", list);
		 
		RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
                          rd.forward(req, res);

		
		
		
		
		
}
}