package com.array;

public class array4 {
	public static void main(String[] args) {
		
		System.out.println("this program is run by Debug Program");
		int arr[]= {1,34,56,78,98,76,54,32,12,3};
		
		int temp=0;
		
		for(int i=0; i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
