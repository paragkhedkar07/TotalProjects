package com.task;

public class MyThread extends Thread
{
	 int st;
	    int end;
	    
	    public MyThread(int st,int end)
	    {
	    	this.st=st;
	    	this.end=end;
	    	
	    }
		public void run()
		{
			for(int i=st;i<end;i++)
			{
				System.out.println(i);
				i++;
				
			}
		}
	
	
}
