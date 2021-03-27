package com.objectLevelLock;

public class Hello
{
	
  synchronized public void display(String msg)
  {
	  System.out.println("[");
	  System.out.println(msg);
	  System.out.println("]");
	  
  }
}
