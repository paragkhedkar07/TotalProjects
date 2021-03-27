package com.cjc;

public class MySql implements Connection
{

	@Override
	public void rollback() {
		System.out.println("mysql rollback method");
		
	}

	@Override
	public void commit() {
		System.out.println("mysql commit method");
		
	}

}
