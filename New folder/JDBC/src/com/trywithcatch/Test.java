package com.trywithcatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test 
{
	public static void main(String[] args) 
{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			 Statement smt=con.createStatement();
			  ResultSet rs=smt.executeQuery("select * from student1");
			
			)
			{
			  while(rs.next())
			  {
				  System.out.println(rs.getInt(1));
				  System.out.println(rs.getString(2));
				  System.out.println(rs.getString(3));
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

}
