package com.crts.app.pbl.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Branch 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int branchId;
private String branchName;
private String  branchType;
private String ifscCode;
private String micrCode;
private int branchCode;
private long branchContactNo;
private String barnchEmailId;
@OneToOne(cascade = CascadeType.ALL)
private Address branchAddress;


public int getBranchId() {
	return branchId;
}
public void setBranchId(int branchId) {
	this.branchId = branchId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getBranchType() {
	return branchType;
}
public void setBranchType(String branchType) {
	this.branchType = branchType;
}
public String getIfscCode() {
	return ifscCode;
}
public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
public String getMicrCode() {
	return micrCode;
}
public void setMicrCode(String micrCode) {
	this.micrCode = micrCode;
}
public int getBranchCode() {
	return branchCode;
}
public void setBranchCode(int branchCode) {
	this.branchCode = branchCode;
}
public long getBranchContactNo() {
	return branchContactNo;
}
public void setBranchContactNo(long branchContactNo) {
	this.branchContactNo = branchContactNo;
}
public String getBarnchEmailId() {
	return barnchEmailId;
}
public void setBarnchEmailId(String barnchEmailId) {
	this.barnchEmailId = barnchEmailId;
}
public Address getBranchAddress() {
	return branchAddress;
}
public void setBranchAddress(Address branchAddress) {
	this.branchAddress = branchAddress;
}

}
