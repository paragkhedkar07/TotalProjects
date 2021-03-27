package com.webcore.app.loan.main.model;

public class UserDocument 
{
private int udId;
private byte[] adharCard;
private byte[] panCard;
private byte[] photo;
public int getUdId() {
	return udId;
}
public void setUdId(int udId) {
	this.udId = udId;
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
