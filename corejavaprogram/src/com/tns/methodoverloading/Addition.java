package com.tns.methodoverloading;
// demo for method overloading--compile time polymorphism

public class Addition {
	
	public static int addition(int a,int b) {
		int result;
		return result=a+b;
		
	}
	
	public static int addition(int a,int b,int c) {
		int result;
		return result=a+b+c;
		
	}
	
	public static void addition(int a,float b) {
		float result=(int) (a+b);
		
		System.out.println("the result of 3rd method"+result);
	}

}
