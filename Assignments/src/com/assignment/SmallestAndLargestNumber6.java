package com.assignment;

public class SmallestAndLargestNumber6 {
	public static void main(String[] args) {

		int a[] = { 0, 9, 7, 8, 4, 6, 1, -1, 2345, -98 };

		int largest = a[0];
		int smallest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] < smallest) {
				smallest = a[i];	
			}
		}
		System.out.println("smallest number in Array :: "+smallest);
		System.out.println("largest number in Array :: "+largest);
	}

}
