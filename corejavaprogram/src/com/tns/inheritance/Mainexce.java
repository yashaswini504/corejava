package com.tns.inheritance;
//demo for multi-level inheritance
public class Mainexce {
	
	public static void main(String[] args) {
		
		//instance
		City c=new City();
		
		c.setCountryname("india");
		c.setCountrycapital("delhi");
		c.setStatename("telangana");
		c.setStatecapital("hyderabad");
		c.setCityname("kandi");
		c.setCitycode(502285);
		
		System.out.println(c.countryname);
		System.out.println(c.countrycapital);
		System.out.println(c.statename);
		System.out.println(c.statecapital);
		System.out.println(c.cityname);
		System.out.println(c.citycode);
	

	}

}
