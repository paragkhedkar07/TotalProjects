package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY) 
private int empid;
private String name;
private String designation;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="dept_id")

private Department dept;

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}

 
	
	
}
