package com.array;

public class arrayNonRepetaedElements {
	public static void main(String[] args) {

		System.out.println("this program is running on debug mode");
//		int a[] = { 1,5,7,5,8,7 };
//
//		// int count=0;
//		for (int i = 0; i < a.length-1; i++) {
//			int count = 0;
//			for (int j = 0; j < a.length-1; j++) {
//				if (a[i] == a[j]) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				System.out.print(a[i] + " ,");
//			}
//		}
//		int a[] = { 1, 5, 7, 5, 8, 7 };
//
//		for (int i = 0; i < a.length; i++) {
//		    int count = 0;
//		    for (int j = 0; j < a.length; j++) {
//		        if (a[i] == a[j]) {
//		            count++;
//		        }
//		    }
//		    if (count > 1) {
//		        System.out.print(a[i] + " ,");
//		    }
//		}
		
		int arr[]= {1,23,65,42,22,1,32,23,22,42,23};
		for(int i=0;i<=arr.length-1;i++) {
		
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
			System.out.println(arr[i] );
			}
		}
		}
	}

}
