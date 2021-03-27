package com.braindata.service;

import java.sql.SQLException;

public interface Service 
{
  public void insertData()throws ClassNotFoundException,SQLException;
  
  public void retriveData()throws ClassNotFoundException,SQLException;
  
  public void updateData()throws ClassNotFoundException,SQLException;
  
  public void deleteData()throws ClassNotFoundException,SQLException;
	
	
}
