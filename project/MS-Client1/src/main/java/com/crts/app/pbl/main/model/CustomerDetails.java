package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails 
{
	@Id
	private int custId;
	private String custName;
	private String custMobileNo;
	private String custEmail;
	private String custGender;
	private String custDob;
	private String policeStation;
	private double incomeDetail;
	private String loanNo;
	private String maritalStatus;
	private String statusCode;
	private Address address;
	private BankDetails bankDetails;
	private GuarantorDeatils guarantorDetails;
	private PreviousLoanDetails prevoiusLoanDetails;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMobileNo() {
		return custMobileNo;
	}
	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustGender() {
		return custGender;
	}
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}
	public String getCustDob() {
		return custDob;
	}
	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	public double getIncomeDetail() {
		return incomeDetail;
	}
	public void setIncomeDetail(double incomeDetail) {
		this.incomeDetail = incomeDetail;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public GuarantorDeatils getGuarantorDetails() {
		return guarantorDetails;
	}
	public void setGuarantorDetails(GuarantorDeatils guarantorDetails) {
		this.guarantorDetails = guarantorDetails;
	}
	public PreviousLoanDetails getPrevoiusLoanDetails() {
		return prevoiusLoanDetails;
	}
	public void setPrevoiusLoanDetails(PreviousLoanDetails prevoiusLoanDetails) {
		this.prevoiusLoanDetails = prevoiusLoanDetails;
	}
}
