package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PreviousLoanDetails 
{
	@Id
private int id;
private int remainingEmi;
private double remainingAmount;
private BankDetails bankDetails;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRemainingEmi() {
	return remainingEmi;
}
public void setRemainingEmi(int remainingEmi) {
	this.remainingEmi = remainingEmi;
}
public double getRemainingAmount() {
	return remainingAmount;
}
public void setRemainingAmount(double remainingAmount) {
	this.remainingAmount = remainingAmount;
}
public BankDetails getBankDetails() {
	return bankDetails;
}
public void setBankDetails(BankDetails bankDetails) {
	this.bankDetails = bankDetails;
}

}
