package com.customchecktask;

public class InvalidNumberException extends Exception
{

 public InvalidNumberException()
 {
	System.out.println("number");
	 
 }
 public InvalidNumberException(String msg)
 {
	super(msg);
 }
}
