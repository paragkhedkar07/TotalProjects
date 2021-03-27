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
import com.wcs.mvccrud.serviceimplement.ServiceImpl;
import com.wcs.mvccrud.serviceinterface.ServiceIntra;

@WebServlet("/update")
public class UpdateController extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		ServiceIntra ser=new ServiceImpl();
		Student s=new Student();
		s.setRollno(Integer.parseInt(req.getParameter("rollno")));
		s.setName(req.getParameter("name"));
		s.setAddr(req.getParameter("addr"));
		s.setUn(req.getParameter("un"));
		s.setPs(req.getParameter("ps"));
		  ser.UpdateRecord(s);
		
		List<Student> list=ser.getAllData();
		
		 req.setAttribute("data", list);
		 
		RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
                          rd.forward(req, res);

		
		
	}
}
