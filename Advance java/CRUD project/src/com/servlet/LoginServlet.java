package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;


@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res)
	{
		String un=req.getParameter("uname");
		String ps=req.getParameter("pass");
		if(un.equals("admin")&&ps.equals("admin"))
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			String sql="select * from Employee1";
					PreparedStatement ps1=con.prepareStatement(sql);
					         
			
			ResultSet rs= ps1.executeQuery();
			
			   List<Employee>list=new ArrayList();
			   while(rs.next())
			   {
				   Employee e=new Employee();
				   e.setEid(rs.getInt(1));
				   e.setName(rs.getString(2));
				   e.setAddr(rs.getString(3));
				   e.setUn(rs.getString(4));
				   e.setPs(rs.getString(5));
				   
				   
				   list.add(e);
				   
			   }
			      req.setAttribute("data", list);
			      req.getRequestDispatcher("success.jsp").forward(req,res);;
			
			}
		catch(Exception e2)
		{System.out.println(e2.getMessage());
			
		}
		else{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				String sql="select * from Employee1 where UN=? and PS=?";
				PreparedStatement ps1=con.prepareStatement(sql);
		         ps1.setString(1, un);
		         ps1.setString(2, ps);

ResultSet rs= ps1.executeQuery();

  List<Employee>list=new ArrayList();
  while(rs.next())
  {
	   Employee e=new Employee();
	   e.setEid(rs.getInt(1));
	   e.setName(rs.getString(2));
	   e.setAddr(rs.getString(3));
	   e.setUn(rs.getString(4));
	   e.setPs(rs.getString(5));
	   
	   
	   list.add(e );
	   
  }
  if(!list.isEmpty())
  {
	  
	  req.setAttribute("data", list);
      req.getRequestDispatcher("success.jsp").forward(req,res);;

 }
  else
  {
	  req.getRequestDispatcher("login.jsp").forward(req,res);;
	  
	  
}
			}
  catch(Exception e3)
	{System.out.println(e3.getMessage());
		
	}
  }
}
}
	

	
	
	

