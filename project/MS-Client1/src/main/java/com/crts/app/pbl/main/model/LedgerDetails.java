package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LedgerDetails 
{
	@Id
	
private int ledgerDetailsId;
//foreign Key
private String customerId;
//take from loan disbursement details
private String caseNumber;
//loanNo//foreign key
private String loanMasterDeatilsId;
private double totalAmount;
private int tenure;
private double emi;
private double adavanceEmi;
private String emiStartDate;
private String emiEndDate;
private String ledgerCreatedDate;
private double ledgerDeatilsEmiPaidAmount;
public int getLedgerDetailsId() {
	return ledgerDetailsId;
}
public void setLedgerDetailsId(int ledgerDetailsId) {
	this.ledgerDetailsId = ledgerDetailsId;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCaseNumber() {
	return caseNumber;
}
public void setCaseNumber(String caseNumber) {
	this.caseNumber = caseNumber;
}
public String getLoanMasterDeatilsId() {
	return loanMasterDeatilsId;
}
public void setLoanMasterDeatilsId(String loanMasterDeatilsId) {
	this.loanMasterDeatilsId = loanMasterDeatilsId;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public int getTenure() {
	return tenure;
}
public void setTenure(int tenure) {
	this.tenure = tenure;
}
public double getEmi() {
	return emi;
}
public void setEmi(double emi) {
	this.emi = emi;
}
public double getAdavanceEmi() {
	return adavanceEmi;
}
public void setAdavanceEmi(double adavanceEmi) {
	this.adavanceEmi = adavanceEmi;
}
public String getEmiStartDate() {
	return emiStartDate;
}
public void setEmiStartDate(String emiStartDate) {
	this.emiStartDate = emiStartDate;
}
public String getEmiEndDate() {
	return emiEndDate;
}
public void setEmiEndDate(String emiEndDate) {
	this.emiEndDate = emiEndDate;
}
public String getLedgerCreatedDate() {
	return ledgerCreatedDate;
}
public void setLedgerCreatedDate(String ledgerCreatedDate) {
	this.ledgerCreatedDate = ledgerCreatedDate;
}
public double getLedgerDeatilsEmiPaidAmount() {
	return ledgerDeatilsEmiPaidAmount;
}
public void setLedgerDeatilsEmiPaidAmount(double ledgerDeatilsEmiPaidAmount) {
	this.ledgerDeatilsEmiPaidAmount = ledgerDeatilsEmiPaidAmount;
}

}
