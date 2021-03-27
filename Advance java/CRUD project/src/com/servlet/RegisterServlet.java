package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
@WebServlet(urlPatterns="/register")
public class RegisterServlet extends HttpServlet 
{
	protected void service(HttpServletRequest req,HttpServletResponse res)
	{   System.out.println("hello");
		Employee e=new Employee();
		e.setEid(Integer.parseInt(req.getParameter("eid")));
		e.setName(req.getParameter("name"));
		e.setAddr(req.getParameter("addr"));
		e.setUn(req.getParameter("un"));
		e.setPs(req.getParameter("ps"));
		System.out.println(e.getAddr());
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			String sql="insert into Employee1 values(?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1,e.getEid());
					ps.setString(2, e.getName());
					ps.setString(3, e.getAddr());
					ps.setString(4, e.getUn());
					ps.setString(5, e.getPs());
					ps.execute();
					System.out.println("successfully register");
					
					req.getRequestDispatcher("login.jsp").forward(req,res);;
					
			
		}catch(Exception e2)
		{
			e2.printStackTrace();
			
		}
		
	
		
	}

}
