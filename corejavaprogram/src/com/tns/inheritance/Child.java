package com.tns.inheritance;

public class Child extends Father{
	
	int a=8;
	
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.car);
		System.out.println(c.money);
		
		
		c.drinking();
		c.learn();
	}

}
