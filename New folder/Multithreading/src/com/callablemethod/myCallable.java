package com.callablemethod;

import java.util.concurrent.Callable;

public class myCallable implements Callable<Integer>
{
    int st,end,sum; 
	public myCallable(int st,int end)
	{
		this.st=st;
		this.end=end;		
		
	}
	
	public Integer call() throws Exception {
		
		for(int i=st;i<end;i++)
		{
			sum=sum+i;
			  i++;
			
		}
		
		
		return sum;
	}

}
