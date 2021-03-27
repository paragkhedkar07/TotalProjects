package com.preparedstatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.mysql.jdbc.PreparedStatement;

public class Test
{
  public static void main(String[] args){

  {try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e1) {
	
	e1.printStackTrace();
}
    
Connection con = null;
try {
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
} catch (SQLException e1) {
	
	e1.printStackTrace();
}
	
	String sql="insert into student values(?,?,?)";
	
	try {
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
		CallableStatement cs=con.prepareCall("{call ss(?,?,?)}");
		                  cs.setInt(1,5);
		                  cs.setString(2,"xyz");
		                  cs.setString(3,"akurdi");
		                  cs.execute();
		                  
		                  
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
   
}

  }}



















