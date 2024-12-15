package com.assignment;

public class SwappingVariable8 {

	public static void main(String[] args) {

		int x = 2;
		int y = 3;

		// 1. by using thired variable
//		
//		int t;
//		t=x;//2
//		x=y;//3
//		y=t;//2
//		
//		System.out.println(x+"  "+y);

		// 2. without using third varaible : using + operator

//		x = x + y; // 2+3=5
//		y = x - y; // 5-3=2
//		x = x - y;// 5-2=3

		// 3. without using third variable : using * operator
//		
//		x=x*y;// 2*3=6
//		y=x/y;// 6/3=2
//		x=x/y;// 6/2=3
		
		x=x^y;// 2(0010) ^ 3(0011)= 6(0110)
		y=x^y;// 6(0110) ^ 3(0011)= 2(0010)
		x=x^y;// 6(0110) ^ 3(0011)= 3(0011)
		

		System.out.println(x + "  " + y);

	}

}
