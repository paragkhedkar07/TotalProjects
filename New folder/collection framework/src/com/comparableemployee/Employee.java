package com.comparableemployee;

public class Employee implements Comparable
{
  private int age;
  private int id;
  private String name;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  public int compareTo(Object o)
  {
	  Employee e=(Employee)o;
	  return this.age-e.age;
	  
  }
  
	
	
}
