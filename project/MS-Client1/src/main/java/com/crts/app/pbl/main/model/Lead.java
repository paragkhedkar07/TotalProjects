package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lead 
{@Id
private int leadId;
private String customerAdahrCard;
private String customerPanCard;
private String custoemrAdharNo;
private String customerPanNo;
private String date;
private int statusCode;
private String leadDateAndTime;
private Enquiry enquiryId;
public int getLeadId() {
	return leadId;
}
public void setLeadId(int leadId) {
	this.leadId = leadId;
}
public String getCustomerAdahrCard() {
	return customerAdahrCard;
}
public void setCustomerAdahrCard(String customerAdahrCard) {
	this.customerAdahrCard = customerAdahrCard;
}
public String getCustomerPanCard() {
	return customerPanCard;
}
public void setCustomerPanCard(String customerPanCard) {
	this.customerPanCard = customerPanCard;
}
public String getCustoemrAdharNo() {
	return custoemrAdharNo;
}
public void setCustoemrAdharNo(String custoemrAdharNo) {
	this.custoemrAdharNo = custoemrAdharNo;
}
public String getCustomerPanNo() {
	return customerPanNo;
}
public void setCustomerPanNo(String customerPanNo) {
	this.customerPanNo = customerPanNo;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getLeadDateAndTime() {
	return leadDateAndTime;
}
public void setLeadDateAndTime(String leadDateAndTime) {
	this.leadDateAndTime = leadDateAndTime;
}
public Enquiry getEnquiryId() {
	return enquiryId;
}
public void setEnquiryId(Enquiry enquiryId) {
	this.enquiryId = enquiryId;
}

}
