package com.classLevelLock;

public class Hello
{
	
  synchronized static  public void display(String msg)
  {
	  System.out.println("[");
	  System.out.println(msg);
	  System.out.println("]");
	  
	  
	  
  }
	
	
	
}
