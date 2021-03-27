package com.comparatortreeset;

import java.util.Comparator;

public class RollNofort implements Comparator
{
  public int compare(Object o1,Object o2)
  {
	  Student stu=(Student)o1;
	  Student stu1=(Student)o1; 
	  return stu.getRollno()-stu1.getRollno();
	  
	  
	  
  }
	
	
}
