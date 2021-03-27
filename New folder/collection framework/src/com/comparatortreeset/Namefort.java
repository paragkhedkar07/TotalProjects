package com.comparatortreeset;

import java.util.Comparator;

public class Namefort implements Comparator 
{
  public int compare(Object o1,Object o2)
  {
	  Student stu=(Student)o1;
	  Student stu1=(Student)o2;
	  return stu.getName().compareTo(stu1.getName());
	  
	  
  }
	
}
