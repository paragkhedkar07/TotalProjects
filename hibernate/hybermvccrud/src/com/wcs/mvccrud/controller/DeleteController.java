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

@WebServlet("/delete")
public class DeleteController extends HttpServlet
{
	
	 
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	

	 int rollno=Integer.parseInt(req.getParameter("Rollno"));
	   System.out.println(rollno);
	   ServiceIntra ser=new ServiceImpl();
	               ser.Delete(rollno);
	                List<Student> list=ser.getAllData();
	 //  List<Student> list=ser.Delete(rollno);
	
	   req.setAttribute("data", list);
	     
	   RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
                       rd.forward(req, res);
	
}
}
