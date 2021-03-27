package com.parag;

public class Oracle implements Connection {

	public void rollback() {
		
		System.out.println("rollback oracle");
	}

	public void commit() {
		System.out.println("commit oracle");
		
	}

}
