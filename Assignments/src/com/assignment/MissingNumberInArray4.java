package com.assignment;

public class MissingNumberInArray4 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum2=0;
		for(int i=1;i<=9;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		int diff=0;
		diff=sum2-sum;
		System.out.println("missing Number"+diff);
	}
}
