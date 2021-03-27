package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role 
{@Id
private int roleId;
private int roleName;
private int roleStatusCode;
public int getRoleId() {
	return roleId;
}
public void setRoleId(int roleId) {
	this.roleId = roleId;
}
public int getRoleName() {
	return roleName;
}
public void setRoleName(int roleName) {
	this.roleName = roleName;
}
public int getRoleStatusCode() {
	return roleStatusCode;
}
public void setRoleStatusCode(int roleStatusCode) {
	this.roleStatusCode = roleStatusCode;
}

}
