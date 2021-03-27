package com.parag;

public class MySql implements Connection {

	public void rollback() {
		
		System.out.println("rollback mysql");
	}

	public void commit() {
		System.out.println("commit mysql");
		
	}

}
