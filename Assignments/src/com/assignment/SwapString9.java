package com.assignment;

public class SwapString9 {
	public static void main(String[] args) {
		
		String a="chandra";
		String b="sekhar";
		
		System.out.println("before swag");
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
		
		// 1.append  a and b
		a=a+b; // chandrasekhar
		
		// 2. store intital string a in string b
		b=a.substring(0, a.length()-b.length());
		
		
		// 3. store intial string b into a
		a=a.substring(b.length());
		
		System.out.println("after swag");
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
		
		
		
		
	}
	

}
