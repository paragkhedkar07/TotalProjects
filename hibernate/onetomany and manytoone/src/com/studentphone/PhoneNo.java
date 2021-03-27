package com.studentphone;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class PhoneNo 
{
 @Id
// @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 
 private String phno;
 @ManyToOne(cascade=CascadeType.ALL)
 @JoinColumn(name="r_no")
 
private Student stu;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public Student getStu() {
	return stu;
}
public void setStu(Student stu) {
	this.stu = stu;
}
 }
