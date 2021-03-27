package com.wcs.mvccrud.Daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.wcs.mvccrud.DaoI.DaoIntra;
import com.wcs.mvccrud.model.Student;

public class DaoImpl implements DaoIntra
{

	public void saveStudent(Student s) 
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			String sql="insert into Student values(?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1,s.getRollno());
				ps.setString(2, s.getName());
				ps.setString(3, s.getAddr());
				ps.setString(4, s.getUn());
					ps.setString(5, s.getPs());
					ps.execute();
				System.out.println("successfully register");
				
		
					
			
		}catch(Exception e2)
		{
			e2.printStackTrace();
	}
}

	public List<Student> loginStudent(String un, String ps) 
	{
		 List<Student>list=new ArrayList();
		 if(un.equals("admin")&&ps.equals("admin"))
		 {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
					String sql="select * from Student";
							PreparedStatement ps1=con.prepareStatement(sql);
							         
					
					ResultSet rs= ps1.executeQuery();
					
					   
					   while(rs.next())
					   {
						   System.out.println("getdata");
						   Student es=new Student();
						   es.setRollno(rs.getInt(1));
						   es.setName(rs.getString(2));
						   es.setAddr(rs.getString(3));
						   es.setUn(rs.getString(4));
						   es.setPs(rs.getString(5));
						   
						    list.add(es);
						  System.out.println(es.getName()); 
					   }
		
		
					  
					 			}
					   catch(Exception e3)
					 	{
						   e3.printStackTrace();
					 		
					 	}
					   }else{
							try{
								Class.forName("com.mysql.jdbc.Driver");
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
								String sql="select * from Student where UN=? and PS=?";
								PreparedStatement ps1=con.prepareStatement(sql);
						         ps1.setString(1, un);
						         ps1.setString(2, ps);

				ResultSet rs= ps1.executeQuery();

				  //List<Student>list2=new ArrayList();
				  while(rs.next())
				  {
					  Student ess=new Student();
					   ess.setRollno(rs.getInt(1));
					   ess.setName(rs.getString(2));
					   ess.setAddr(rs.getString(3));
					   ess.setUn(rs.getString(4));
					   ess.setPs(rs.getString(5));
					   
					   
					   list.add(ess );
			}} catch(Exception e4)
		 	{e4.printStackTrace();
	 		
		 	}
		                      
	}
		return list;
	}
		@Override
		public List<Student> getAllData1() 
		{ 
			List<Student>list3=new ArrayList();
		 
	             try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
					String sql="select * from Student";
							PreparedStatement ps1=con.prepareStatement(sql);
							         
					
					ResultSet rs= ps1.executeQuery();
					
					   
					   while(rs.next())
					   {System.out.println("getdata");
						   Student ss=new Student();
						   ss.setRollno(rs.getInt(1));
						   ss.setName(rs.getString(2));
						   ss.setAddr(rs.getString(3));
						   ss.setUn(rs.getString(4));
						   ss.setPs(rs.getString(5));
						   
						    list3.add(ss);
						   
					   }
	             }
		
					   catch(Exception e3)
					 	{e3.printStackTrace();
					 		
					 	}
	       
			             return list3;
		}
	public void Delete(int rollno) {
		
		 try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
				String sql="delete from Student where Rollno=?";
				PreparedStatement ps1=con.prepareStatement(sql);
				               ps1.setInt(1,rollno);
				               int rollno1= ps1.executeUpdate();
		 }
				           			catch(Exception e2)
						    		{
						    			e2.printStackTrace();
						    		}
		                                 
		
	}

	@Override
	public Student EditRecord(int rollno) {
		 Student s =new Student();
		 try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
				String sql="select * from Student where Rollno=?";
				PreparedStatement ps1=con.prepareStatement(sql);
				 ps1.setInt(1,rollno);
				 
				
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		   {
			  
			   s.setRollno(rs.getInt(1));
			   s.setName(rs.getString(2));
			   s.setAddr(rs.getString(3));
			   s.setUn(rs.getString(4));
			   s.setPs(rs.getString(5));
		
	}
}
		 catch(Exception e2)
 		{
 			e2.printStackTrace();
 		}
		
		 return s;
		
    }

	@Override
	public void UpdateRecord(Student s) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			String sql="update Student set Name=?,Addr=?,UN=?,PS=? where Rollno=?";
					PreparedStatement ps=con.prepareStatement(sql);
					
					ps.setString(1, s.getName());
					ps.setString(2, s.getAddr());
					ps.setString(3, s.getUn());
					ps.setString(4, s.getPs());
					ps.setInt(5, s.getRollno());
				      ps.executeUpdate();
					
		
		}
				 catch(Exception e2)
			 		{
					 System.out.println(e2.getMessage());
			 	    }
		}      	
}
	
