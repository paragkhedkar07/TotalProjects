package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name="CourseofCollage")
public class Course
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int cid;
  private String name;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
	
	
	
	
	
}
