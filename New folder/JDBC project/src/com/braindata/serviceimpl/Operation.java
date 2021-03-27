package com.braindata.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.braindata.model.Employee;
import com.braindata.service.Service;

public class Operation implements Service {
           
	
	
	@Override
	public void insertData()  
	{
		Employee e=new Employee();
	
		e.setEid(59);
		e.setEname("parag");
		e.setAddress("karvenagar");
		e.setUname("parag07");
		e.setUpass("paragpotter");
		
		int id=e.getEid();
		String name=e.getEname();
		String address=e.getAddress();
		String uname=e.getUname();
		String upass=e.getUpass();
		
	try
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
			
				e1.printStackTrace();
			}
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/braindata_employee_db","root","root");
			String sql="insert into employee values("+id+",'"+name+"','"+address+"','"+uname+"','"+upass+"')";
			
			Statement smt=con.createStatement();
			 smt.execute(sql);
			    smt.close();
			    con.close();
		
		}
			catch(SQLException es)
			{
				es.printStackTrace();
			
			}		
			}
		
	

	@Override
	public void retriveData() {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/braindata_employee_db","root","root");
			 Statement smt=con.createStatement();
			  ResultSet rs=smt.executeQuery("select * from employee");
			
			)
			{
			  while(rs.next())
			  {
				  System.out.println(rs.getInt(1));
				  System.out.println(rs.getString(2));
				  System.out.println(rs.getString(3));
				  System.out.println(rs.getString(4));
				  System.out.println(rs.getString(5));
			  }
			
			
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			
			}		
			}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}
		
}
     public void updateData() 
     {
        
    	 Employee e=new Employee();
 		e.setEid(59);
 		e.setEname("parag");
 		e.setAddress("karvenagar");
 		e.setUname("parag07");
 		e.setUpass("paragpotter");
 		
 		int id=e.getEid();
 		String name=e.getEname();
 		String address=e.getAddress();
 		String uname=e.getUname();
 		String upass=e.getUpass();
 		
 	try
 		{
 			try {
 				Class.forName("com.mysql.jdbc.Driver");
 			} catch (ClassNotFoundException e1) {
 			
 				e1.printStackTrace();
 			}
 			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/braindata_employee_db","root","root");
 			String sql="update employee set ename='SIRbjhhbi' where eid=53";
 			
 			Statement smt=con.createStatement();
 			 smt.executeUpdate(sql);
 			    smt.close();
 			    con.close();
 		
 		}
 			catch(SQLException es)
 			{
 				es.printStackTrace();
 			
 			}		
		
		
	}

	@Override
	public void deleteData() {
		
		/* Employee e=new Employee();
	 		e.setEid(59);
	 		e.setEname("parag");
	 		e.setAddress("karvenagar");
	 		e.setUname("parag07");
	 		e.setUpass("paragpotter");
	 		
	 		int id=e.getEid();
	 		String name=e.getEname();
	 		String address=e.getAddress();
	 		String uname=e.getUname();
	 		String upass=e.getUpass();  */
	 		
	 	try
	 		{
	 			try {
	 				Class.forName("com.mysql.jdbc.Driver");
	 			} catch (ClassNotFoundException e1) {
	 			
	 				e1.printStackTrace();
	 			}
	 			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/braindata_employee_db","root","root");
	 			String sql="delete from employee where eid=58";
	 			
	 			Statement smt=con.createStatement();
	 			 smt.executeUpdate(sql);
	 			    smt.close();
	 			    con.close();
	 		
	 		}
	 			catch(SQLException es)
	 			{
	 				es.printStackTrace();
	 			
	 			}		
		
		
	}

}
