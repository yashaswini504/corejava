package com.tns.constructor;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your address");
		String address=sc.next();
		
		System.out.println("enter your cid");
		int id=sc.nextInt();
		
		Customer c=new Customer();
		
		
	}

}
