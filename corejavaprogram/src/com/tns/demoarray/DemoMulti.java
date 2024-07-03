package com.tns.demoarray;
//demo for multi-dimensional array
public class DemoMulti {
	
	public static void main(String[] args) {
	//declaration
		//int [][]arr1;-->example 1
		//int[][]arr2;-->example 2
		//int[][]arr3;-->example 3
		
		//intilization
		//arr=new int[3][3];
		
		int arr[][]= {{10,20},{30,40},{10,50}};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"");
				
			}
			
			System.out.println();
		
		}
		
	}

}
