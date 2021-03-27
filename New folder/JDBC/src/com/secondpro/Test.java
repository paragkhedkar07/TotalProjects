package com.secondpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test
{
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
     
	int rollno=Integer.parseInt(args[0]);
	String name=args[1];
	String addr=args[2];
	String sql="insert into Student1 values("+rollno+",'"+name+"','"+addr+"')";
	System.out.println(sql);
	
	Statement smt=con.createStatement();
	    smt.execute(sql);
	    smt.close();
	    con.close();
	    
	
	
	
}
}
