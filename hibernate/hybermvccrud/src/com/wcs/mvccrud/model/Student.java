package com.wcs.mvccrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
@Id
private int rollno;
private String name;
private String addr;
private String un;
private String ps;
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
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
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



}
