package com.comparabledefaultsorting;


public  class Student1 implements Comparable 
{
  private int rollno;
  private String name;
  
  
  public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public int compareTo(Object o)
{
  Student1 s=(Student1)o;
  System.out.println(this.name+"----"+s.name);
 // return -(this.rollno-s.rollno);
  return this.name.compareTo(s.name);


}




	
	
}
