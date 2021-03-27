package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
@WebServlet(urlPatterns="/edit")
public class EditServlet extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res)
	{
	  int id=Integer.parseInt(req.getParameter("Eid"));
	   System.out.println(id);
	   try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			String sql="select * from Employee1 where Eid=?";
			PreparedStatement ps1=con.prepareStatement(sql);
			 ps1.setInt(1,id);
			 ResultSet rs= ps1.executeQuery();
			 while(rs.next())
 			   {
 				   Employee e=new Employee();
 				   e.setEid(rs.getInt(1));
 				   e.setName(rs.getString(2));
 				   e.setAddr(rs.getString(3));
 				   e.setUn(rs.getString(4));
 				   e.setPs(rs.getString(5));
			
 				  req.setAttribute("emp",e );
   			      req.getRequestDispatcher("update.jsp").forward(req,res);;
   			
   			}
    	}
	catch(Exception e2)
	{
		
		e2.printStackTrace();
	} 
 			   
	   }
}
