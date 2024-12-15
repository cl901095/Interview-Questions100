package com.assignment;

import javax.management.StringValueExp;

public class ReverseInteger3 {
	
	public static void main(String[] args) {
		
	// 1. using normal algo
		int num=12345;
		int rev=0;
		
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		
	// 2. Using StringBuffer class
	// by using of StringBuffer we need to convert interger into String and reverse it they can ask in interview
		int num1=9876;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
