package com.task;

import com.bymultithreadingevenodd.NumberG;

public class Test 
{
	
	public static void main(String[] args)
	{
		NumberG odd=new NumberG(1,10);
		NumberG even=new NumberG(2,10);
		
           odd.start();
		   even.start();
		
	}
	

}
