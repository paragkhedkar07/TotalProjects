package com.throwcustomException;

import java.io.IOException;

public class AgeInvalidException extends IOException 
{
  public AgeInvalidException()
  {
	  System.out.println("Invalid age");
	  
}
 public AgeInvalidException(String Message)
  {
	  super(Message);
  }
	
}
 