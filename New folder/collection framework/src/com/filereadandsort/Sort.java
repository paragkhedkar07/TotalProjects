package com.filereadandsort;

import java.util.Comparator;

import com.sortbyidnameaddress.Employee;

public class Sort implements Comparator 
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		FileDemo fd1=(FileDemo)o1;
		FileDemo fd2=(FileDemo)o2;
		
	    return fd1.getLength()-fd2.getLength();
		
	}
}
