package com.tns.demoarray;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student[]arr;  //arr is a variable with type student(class)
		arr=new Student[3];
		
		arr[0]=new Student(101,"yashaswini","CSE");
		arr[1]=new Student(102,"tejaswi","CSE");
		arr[2]=new Student(103,"sandhya","CSE");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("The elements of array"+arr[i].getSid()+" "+arr[i].getSname()+" "+arr[i].getBranch()+" ");
					
		}
		
		
	}

}
