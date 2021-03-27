package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GuarantorDeatils 
{
	@Id
	private int guarantorId;
	private String guarantorName;
	private String guarantorMobileNo;
	private String guarantorEmailId;
	private String guarantorGender;
	private String guarantorDob;
	private int guarantorAge;//field to generate from DoB
	private String gaurantorProfession;
	private String policeStation;
	private String residenceType;
	private String maritalStatus;
	private String dateTime;
	public int getGuarantorId() {
		return guarantorId;
	}
	public void setGuarantorId(int guarantorId) {
		this.guarantorId = guarantorId;
	}
	public String getGuarantorName() {
		return guarantorName;
	}
	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}
	public String getGuarantorMobileNo() {
		return guarantorMobileNo;
	}
	public void setGuarantorMobileNo(String guarantorMobileNo) {
		this.guarantorMobileNo = guarantorMobileNo;
	}
	public String getGuarantorEmainId() {
		return guarantorEmailId;
	}
	public void setGuarantorEmainId(String guarantorEmainId) {
		this.guarantorEmailId = guarantorEmainId;
	}
	public String getGuarantorGender() {
		return guarantorGender;
	}
	public void setGuarantorGender(String guarantorGender) {
		this.guarantorGender = guarantorGender;
	}
	public String getGuarantorDob() {
		return guarantorDob;
	}
	public void setGuarantorDob(String guarantorDob) {
		this.guarantorDob = guarantorDob;
	}
	public int getGuarantorAge() {
		return guarantorAge;
	}
	public void setGuarantorAge(int guarantorAge) {
		this.guarantorAge = guarantorAge;
	}
	public String getGaurantorProfession() {
		return gaurantorProfession;
	}
	public void setGaurantorProfession(String gaurantorProfession) {
		this.gaurantorProfession = gaurantorProfession;
	}
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	public String getResidenceType() {
		return residenceType;
	}
	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDataTime() {
		return dateTime;
	}
	public void setDataTime(String dataTime) {
		this.dateTime = dataTime;
	}
}
