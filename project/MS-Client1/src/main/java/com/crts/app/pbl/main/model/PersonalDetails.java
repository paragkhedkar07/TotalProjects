package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonalDetails 
{
	@Id
private int id;
private int customerId;
//foreignKey
private String fatherName;
private String motherName;
private int noOfFamilyMember;
private int noOfChild;
private String maritalStatus;
private int dependenteMember;
private double familyIncome;
private String spouseName;
private String nationality;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public int getNoOfFamilyMember() {
	return noOfFamilyMember;
}
public void setNoOfFamilyMember(int noOfFamilyMember) {
	this.noOfFamilyMember = noOfFamilyMember;
}
public int getNoOfChild() {
	return noOfChild;
}
public void setNoOfChild(int noOfChild) {
	this.noOfChild = noOfChild;
}
public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public int getDependenteMember() {
	return dependenteMember;
}
public void setDependenteMember(int dependenteMember) {
	this.dependenteMember = dependenteMember;
}
public double getFamilyIncome() {
	return familyIncome;
}
public void setFamilyIncome(double familyIncome) {
	this.familyIncome = familyIncome;
}
public String getSpouseName() {
	return spouseName;
}
public void setSpouseName(String spouseName) {
	this.spouseName = spouseName;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}



}
