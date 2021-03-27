package com.cjc.account;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account 
{
  @Id
  private int acno;
  private String name;
  @OneToOne(cascade=CascadeType.ALL,mappedBy="account")
  
private Accountplus acp;
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Accountplus getAcp() {
	return acp;
}
public void setAcp(Accountplus acp) {
	this.acp = acp;
}
	
}
