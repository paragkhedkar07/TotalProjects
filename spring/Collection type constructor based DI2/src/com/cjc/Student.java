package com.cjc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student
{
  private List MyList;
  private Set MySet;
  private Map MyMap;
  
  
public Student(List myList, Set mySet, Map myMap) {
	super();
	MyList = myList;
	MySet = mySet;
	MyMap = myMap;
}


@Override
public String toString() {
	return "Student [MyList=" + MyList + ", MySet=" + MySet + ", MyMap=" + MyMap + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}






}