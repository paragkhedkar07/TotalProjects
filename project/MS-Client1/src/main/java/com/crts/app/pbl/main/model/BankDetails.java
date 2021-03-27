package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDetails 
{
	@Id
private int bid;
private String bankAccountNo;
private String bankAccountHoldersName;
private Branch bankBranch;
private int status;
private int custId;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBankAccountNo() {
	return bankAccountNo;
}
public void setBankAccountNo(String bankAccountNo) {
	this.bankAccountNo = bankAccountNo;
}
public String getBankAccountHoldersName() {
	return bankAccountHoldersName;
}
public void setBankAccountHoldersName(String bankAccountHoldersName) {
	this.bankAccountHoldersName = bankAccountHoldersName;
}
public Branch getBankBranch() {
	return bankBranch;
}
public void setBankBranch(Branch bankBranch) {
	this.bankBranch = bankBranch;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}

}
