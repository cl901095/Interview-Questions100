package com.array;

public class arraySummatchingParirs {
	public static void main(String[] args) {
		
		System.out.println("this program run at the DeBug mode");

		int[] arr = { 1, 3, 4, 7, 6, 9, 3, 0, 8 };
		int sum = 8;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + " +" + arr[j] + " =" +" 8");
				}
			}
		}
	}

}
