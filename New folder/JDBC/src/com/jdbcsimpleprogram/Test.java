package com.jdbcsimpleprogram;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test 
{
public static void main(String[] args)throws ClassNotFoundException,SQLException
{
   Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh","root","root");
     
	String sql="insert into student values(54,'xyz','karvenagar')";
	
	Statement smt=con.createStatement();
	
	smt.execute(sql);
	 smt.close();
	 con.close();
	
	
}
}
