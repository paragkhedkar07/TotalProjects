package com.objectLevelLock;

public class MyThread extends Thread
{
  String msg;
  Hello h;
  public MyThread(String msg,Hello h)
  {
	  this.msg=msg;
	  this.h=h;
  }
  
  public void run()
  {
	  h.display(msg);
	  
  }
}
