package com.array;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("thi program is running in Debug Mode");
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min number" + min);
		System.out.println("max number" + max);

	}

}
