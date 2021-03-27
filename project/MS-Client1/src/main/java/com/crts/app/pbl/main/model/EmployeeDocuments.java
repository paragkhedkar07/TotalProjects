package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDocuments 
{@Id
private int udid;
private byte[] adharCard;
private byte[] panCard;
private byte[] photo;
public int getUdid() {
	return udid;
}
public void setUdid(int udid) {
	this.udid = udid;
}
public byte[] getAdharCard() {
	return adharCard;
}
public void setAdharCard(byte[] adharCard) {
	this.adharCard = adharCard;
}
public byte[] getPanCard() {
	return panCard;
}
public void setPanCard(byte[] panCard) {
	this.panCard = panCard;
}
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}

}
