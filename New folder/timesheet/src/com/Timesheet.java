package com;

public class Timesheet 
{
  private int id;
  private String taskName;
  private String dateWorked;
  private int hrsWorked;
  private String taskDescription;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
public String getDateWorked() {
	return dateWorked;
}
public void setDateWorked(String dateWorked) {
	this.dateWorked = dateWorked;
}
public int getHrsWorked() {
	return hrsWorked;
}
public void setHrsWorked(int hrsWorked) {
	this.hrsWorked = hrsWorked;
}
public String getTaskDescription() {
	return taskDescription;
}
public void setTaskDescription(String taskDescription) {
	this.taskDescription = taskDescription;
}
 public Timesheet(int id,String TaskName,String dateWorked,int hrsWorked,String taskDescription)
 {
	 
	 
 }
	
}
