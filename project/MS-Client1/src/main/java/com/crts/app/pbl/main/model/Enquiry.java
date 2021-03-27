package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enquiry 
{
	@Id
private int enquiryId;
private String customerFname;
private String customerMname;
private String customerLname;
private String customerGender;
private String customerMobileNo;
private String customerDob;
private String customerEmailId;
private String address;
private String createBy;
//employeeId
private int statusCode;
private double loanRequired;
private String dateTime;
public int getEnquiryId() {
	return enquiryId;
}
public void setEnquiryId(int enquiryId) {
	this.enquiryId = enquiryId;
}
public String getCustomerFname() {
	return customerFname;
}
public void setCustomerFname(String customerFname) {
	this.customerFname = customerFname;
}
public String getCustomerMname() {
	return customerMname;
}
public void setCustomerMname(String customerMname) {
	this.customerMname = customerMname;
}
public String getCustomerLname() {
	return customerLname;
}
public void setCustomerLname(String customerLname) {
	this.customerLname = customerLname;
}
public String getCustomerGender() {
	return customerGender;
}
public void setCustomerGender(String customerGender) {
	this.customerGender = customerGender;
}
public String getCustomerMobileNo() {
	return customerMobileNo;
}
public void setCustomerMobileNo(String customerMobileNo) {
	this.customerMobileNo = customerMobileNo;
}
public String getCustomerDob() {
	return customerDob;
}
public void setCustomerDob(String customerDob) {
	this.customerDob = customerDob;
}
public String getCustomerEmailId() {
	return customerEmailId;
}
public void setCustomerEmailId(String customerEmailId) {
	this.customerEmailId = customerEmailId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCreateBy() {
	return createBy;
}
public void setCreateBy(String createBy) {
	this.createBy = createBy;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public double getLoanRequired() {
	return loanRequired;
}
public void setLoanRequired(double loanRequired) {
	this.loanRequired = loanRequired;
}
public String getDateTime() {
	return dateTime;
}
public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}

}
