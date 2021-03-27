package com.wcs.mvccrud.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.mvccrud.model.Student;
import com.wcs.mvccrud.serviceimplement.ServiceImpl;
import com.wcs.mvccrud.serviceinterface.ServiceIntra;

@WebServlet("/edit")
public class EditController extends HttpServlet 
{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		int rollno=Integer.parseInt(req.getParameter("Rollno"));
		   System.out.println(rollno);
		
		   ServiceIntra ser=new ServiceImpl();
	       Student s=ser.EditRecord(rollno);
	       
	            req.setAttribute("stu", s);

	RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
	            rd.forward(req, res);

	}
	
	}
