package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
  @Id
  private int rollno;
  private String name;
  private String un;
  private String ps;
  private String mno;
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
public String getUn() {
	return un;
}
public void setUn(String un) {
	this.un = un;
}
public String getPs() {
	return ps;
}
public void setPs(String ps) {
	this.ps = ps;
}
public String getMno() {
	return mno;
}
public void setMno(String mno) {
	this.mno = mno;
}
	
	
}
