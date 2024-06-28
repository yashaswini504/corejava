package com.tns.inheritance;

public class Citizen {
	
	private String name;
	private long aadharno;
	private String address;
	private long phnno;

	//default 
	public Citizen() {
	
}
	//parameter

	public Citizen(String name, long aadharno, String address, long phnno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phnno = phnno;
	}
	
	//getter and setter methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhnno() {
		return phnno;
	}

	public void setPhnno(long phnno) {
		this.phnno = phnno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phnno=" + phnno + "]";
	}
	
}
