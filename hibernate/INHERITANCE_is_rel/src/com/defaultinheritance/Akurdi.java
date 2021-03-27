package com.defaultinheritance;

import javax.persistence.Entity;

@Entity
public class Akurdi extends CJC
{
	private String reg;

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

}
