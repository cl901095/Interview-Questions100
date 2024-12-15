package com.array;

import java.util.Arrays;

public class arrayIterationTypes {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,67,87,9,0};
		
		//first type
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	   //Second Type
		for(int a:arr) {
			System.out.println(a);
		}
		
	  //Third Type
		System.out.println(Arrays.toString(arr));
		
	}

}
