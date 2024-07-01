package com.tns.methodoverridding;

public class OverRideMain {
	
	public static void main(String[] args) {
		RBI rbi;
		
		rbi=new SBI();
		System.out.println("the RateofIntrest for SBI"+rbi.RateofIntrest());
	
	    rbi=new Axis();
	    System.out.println("the RateofIntrest for Axis"+rbi.RateofIntrest());
    }

}
