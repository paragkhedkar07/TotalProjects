package com.addressstudenttask;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Student 
{
  private int sroollno;
  private String sname;
	
  List<Address>address=new ArrayList();

public List<Address> getAddress() {
	return address;
}

public void setAddress(List<Address> address) {
	this.address = address;
}

public int getSroollno() {
	return sroollno;
}

public void setSroollno(int sroollno) {
	this.sroollno = sroollno;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}


  
	
}
