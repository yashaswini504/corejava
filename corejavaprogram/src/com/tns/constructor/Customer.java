package com.tns.constructor;

public class Customer {
	
	private String cname;
	private String caddress;
	private int cid; //properties
	
	//default constructor
	public Customer() {
		System.out.println("This is default constructor");
		
	}

	public Customer(String cname, String caddress, int cid) {
		this.cname = cname;
		this.caddress = caddress;
		this.cid = cid;
	}

	
	
}
