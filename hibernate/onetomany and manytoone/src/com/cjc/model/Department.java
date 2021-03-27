package com.cjc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department 
{
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int did;
 @Column(name="emp_name")
 private String name;
 @OneToMany(cascade=CascadeType.ALL,mappedBy="dept")
 Set<Employee>semp=new HashSet<>();
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Employee> getSemp() {
	return semp;
}
public void setSemp(Set<Employee> semp) {
	this.semp = semp;
}
 
 
	
	
	
}
