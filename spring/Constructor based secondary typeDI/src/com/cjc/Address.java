package com.cjc;

public class Address 
{
  private String cityname;
  private String areaname;
  
public Address(String cityname, String areaname) {
	super();
	this.cityname = cityname;
	this.areaname = areaname;
}

public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public String getAreaname() {
	return areaname;
}
public void setAreaname(String areaname) {
	this.areaname = areaname;
}
	
	
}
