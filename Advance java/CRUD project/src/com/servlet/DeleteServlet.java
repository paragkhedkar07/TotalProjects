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
@WebServlet(urlPatterns="/delete")
public class DeleteServlet extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res)
	{
	  int id=Integer.parseInt(req.getParameter("Eid"));
	   System.out.println(id);
	   try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			String sql="delete from Employee1 where Eid=?";
			PreparedStatement ps1=con.prepareStatement(sql);
			               ps1.setInt(1,id);
			               int id1= ps1.executeUpdate();
			               if(id1!=0)
			            	   
			               {
			            	   
			           			Class.forName("com.mysql.jdbc.Driver");
			           			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			           			String sql1="select * from Employee1";
			           					PreparedStatement ps2=con.prepareStatement(sql1);
			           					         
			           			
			           			ResultSet rs= ps2.executeQuery();
			           			
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
			            	}
			    		catch(Exception e2)
			    		{
			    			//System.out.println(e2.getMessage());
			    			e2.printStackTrace();
			    		} 
			            	   
			            	   
			            	   
			               }
			               
	
	
	
	
	
	
	
}
	
	
	

