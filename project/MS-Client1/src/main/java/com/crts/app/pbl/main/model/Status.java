package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status 
{
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private int statusId;
private String ststusName;
private int statusCode;
private String statusRemark;
public int getStatusId() {
	return statusId;
}
public void setStatusId(int statusId) {
	this.statusId = statusId;
}
public String getStstusName() {
	return ststusName;
}
public void setStstusName(String ststusName) {
	this.ststusName = ststusName;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getStatusRemark() {
	return statusRemark;
}
public void setStatusRemark(String statusRemark) {
	this.statusRemark = statusRemark;
}

}
