package com.studentphone;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Student 
{
@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY) 
private int rollno;
private String name;
private String addr;

@OneToMany(cascade=CascadeType.ALL,mappedBy="stu")

private Set<PhoneNo>sphone=new HashSet<PhoneNo>();

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

public Set<PhoneNo> getSphone() {
	return sphone;
}

public void setSphone(Set<PhoneNo> sphone) {
	this.sphone = sphone;
}


	
	
}
