package com.tns.demoarray;

//demo for class as an array
public class Student {
	
	int sid;
	String sname;
	String branch;
	
	//constructor
	public Student(int sid, String sname, String branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
	}
	
     //getters and setters
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
