package com.tns.inheritance;
//demo for multi-level inheritance

public class City extends State{
	
	//variables
	public String cityname;
	public int citycode;
	
	//getter and setter methods
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getCitycode() {
		return citycode;
	}
	public void setCitycode(int citycode) {
		this.citycode = citycode;
	}

}
