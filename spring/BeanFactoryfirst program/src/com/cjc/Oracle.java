package com.cjc;

public  class Oracle implements Connection
{

	@Override
	public void rollback() 
	{
		System.out.println("oracle rollback method");
		
	}

	@Override
	public void commit() {
		System.out.println("oracle commit method");
		
	}

	
	
	
}
