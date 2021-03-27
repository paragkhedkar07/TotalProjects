package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmiPaymentDetails 
{
	@Id
private int emiPayemnentId;
private int loanNo;
private double emiAmount;
private String emiLastDate;
private  double emiPaidAmount;
private double totalAmount;
private String emiPaidDate;
public int getEmiPayemnentId() {
	return emiPayemnentId;
}
public void setEmiPayemnentId(int emiPayemnentId) {
	this.emiPayemnentId = emiPayemnentId;
}
public int getLoanNo() {
	return loanNo;
}
public void setLoanNo(int loanNo) {
	this.loanNo = loanNo;
}
public double getEmiAmount() {
	return emiAmount;
}
public void setEmiAmount(double emiAmount) {
	this.emiAmount = emiAmount;
}
public String getEmiLastDate() {
	return emiLastDate;
}
public void setEmiLastDate(String emiLastDate) {
	this.emiLastDate = emiLastDate;
}
public double getEmiPaidAmount() {
	return emiPaidAmount;
}
public void setEmiPaidAmount(double emiPaidAmount) {
	this.emiPaidAmount = emiPaidAmount;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public String getEmiPaidDate() {
	return emiPaidDate;
}
public void setEmiPaidDate(String emiPaidDate) {
	this.emiPaidDate = emiPaidDate;
}

}

