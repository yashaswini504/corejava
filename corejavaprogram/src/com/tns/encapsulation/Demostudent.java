package com.tns.encapsulation;
//demo for encapsulation

public class Demostudent {
	
	private int sid;
	private String sname;
	
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
	
	public void display() {
		System.out.println("The student details are"+sid+sname);
	}
	
	public static void main(String[] args) {
		
		Demostudent obj=new Demostudent();
		obj.setSid(504);
		obj.setSname("yashu");
		
		System.out.println(obj.getSid());
		System.out.println(obj.getSname());
	}
	
	

}
