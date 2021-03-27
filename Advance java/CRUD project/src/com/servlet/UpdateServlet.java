package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
@WebServlet(urlPatterns="/update")
public class UpdateServlet extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res)
	{   
		Employee e=new Employee();
		e.setEid(Integer.parseInt(req.getParameter("Eid")));
		e.setName(req.getParameter("Name"));
		e.setAddr(req.getParameter("Addr"));
		e.setUn(req.getParameter("Un"));
		e.setPs(req.getParameter("Ps"));
		
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			String sql="update Employee1 set Name=?,Address=?,UN=?,PS=? where Eid=?";
					PreparedStatement ps=con.prepareStatement(sql);
					
					ps.setString(1, e.getName());
					ps.setString(2, e.getAddr());
					ps.setString(3, e.getUn());
					ps.setString(4, e.getPs());
					ps.setInt(5,e.getEid());
				int id=	ps.executeUpdate();
					
			      if(id!=0)
	            	   
	               {
	            	   
	           			Class.forName("com.mysql.jdbc.Driver");
	           			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	           			String sql1="select * from Employee1";
	           					PreparedStatement ps2=con1.prepareStatement(sql1);
	           					         
	           			
	           			ResultSet rs= ps2.executeQuery();
	           			
	           			   List<Employee>list=new ArrayList();
	           			   while(rs.next())
	           			   {
	           				   Employee e1=new Employee();
	           				   e1.setEid(rs.getInt(1));
	           				   e1.setName(rs.getString(2));
	           				   e1.setAddr(rs.getString(3));
	           				   e1.setUn(rs.getString(4));
	           				   e1.setPs(rs.getString(5));
	           				   
	           				   
	           				   list.add(e1);
	           				   
	           			   }
	           			      req.setAttribute("data", list);
	           			   req.getRequestDispatcher("success.jsp").forward(req,res);;
	           			
	           			}
	            	}
		catch(Exception e2)
		{
			e2.printStackTrace();
			
		}
		
	
		
	}

	
	
	
	
}
