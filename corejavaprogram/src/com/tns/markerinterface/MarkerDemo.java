package com.tns.markerinterface;

public class MarkerDemo {
	
	public static void main(String[] args) {
		
		Student ob=new Student(504,"yashaswini","cse");
		
		if(ob instanceof Register)
		 System.out.println("student is registered");
		 
		 else
			 
			 System.out.println("student is not registered");
	}

}
