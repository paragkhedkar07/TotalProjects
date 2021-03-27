package com.crts.app.pbl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State 
{@Id
	private int stateId;
	private String stateName;
	private String stateCocde;
	private Country Country;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCocde() {
		return stateCocde;
	}
	public void setStateCocde(String stateCocde) {
		this.stateCocde = stateCocde;
	}
	public Country getCountry() {
		return Country;
	}
	public void setCountry(Country country) {
		Country = country;
	}
	
	
}
