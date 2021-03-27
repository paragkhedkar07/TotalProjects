package com.bymultithreadingevenodd;

public class Test
{
	public static void main(String[] args)
	{
		NumberG odd=new NumberG(1,10000);
		NumberG even=new NumberG(2,10000);
		
           odd.start();
		   even.start();
		
	}

}
