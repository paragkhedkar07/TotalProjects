package com.crts.app.pbl.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class EmployeeDetails
{@Id
private int userId;
private String fullName;
private Address userLaddress;
private Address userPaddress;
private long userMobno;
private long userAmobno;
private String userEmail;
private String userGender;
private String userName;
private String password;
private Role userRole;
private Branch userBanch;
private String userDob;
private String userDoj;
private int userStatusCode;

@OneToOne(cascade = CascadeType.ALL)
private EmployeeDocuments empDocuments;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public Address getUserLaddress() {
	return userLaddress;
}
public void setUserLaddress(Address userLaddress) {
	this.userLaddress = userLaddress;
}
public Address getUserPaddress() {
	return userPaddress;
}
public void setUserPaddress(Address userPaddress) {
	this.userPaddress = userPaddress;
}
public long getUserMobno() {
	return userMobno;
}
public void setUserMobno(long userMobno) {
	this.userMobno = userMobno;
}
public long getUserAmobno() {
	return userAmobno;
}
public void setUserAmobno(long userAmobno) {
	this.userAmobno = userAmobno;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserGender() {
	return userGender;
}
public void setUserGender(String userGender) {
	this.userGender = userGender;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getUserRole() {
	return userRole;
}
public void setUserRole(Role userRole) {
	this.userRole = userRole;
}
public Branch getUserBanch() {
	return userBanch;
}
public void setUserBanch(Branch userBanch) {
	this.userBanch = userBanch;
}
public String getUserDob() {
	return userDob;
}
public void setUserDob(String userDob) {
	this.userDob = userDob;
}
public String getUserDoj() {
	return userDoj;
}
public void setUserDoj(String userDoj) {
	this.userDoj = userDoj;
}
public int getUserStatusCode() {
	return userStatusCode;
}
public void setUserStatusCode(int userStatusCode) {
	this.userStatusCode = userStatusCode;
}
public EmployeeDocuments getEmpDocuments() {
	return empDocuments;
}
public void setEmpDocuments(EmployeeDocuments empDocuments) {
	this.empDocuments = empDocuments;
}




}
