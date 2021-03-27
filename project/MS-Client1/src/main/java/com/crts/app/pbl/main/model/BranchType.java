package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BranchType 
{
	@Id
	private int id;
	private String typeName;
	private String typeCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
}
