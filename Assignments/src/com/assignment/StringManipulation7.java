package com.assignment;

public class StringManipulation7 {

	public static void main(String[] args) {
		String s = "Hi gopi is a senior java developer";
		String s1 = "Hi gopi is a senior java developer";
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("g"));// 1st Occurance
		System.out.println(s.indexOf("a", s.indexOf('a') + 1));// 2nd occurance
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("chandu")); // -1 is displayed

		// comparing two strings
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));

		// subString
		System.out.println(s.substring(0, 10));

		// trim before string and after string space is removed
		String s2 = "  gopi is java developer ";
		System.out.println(s2.trim());

		System.out.println(s2.replace(" ", ""));

		String date = "12-10-2024";
		System.out.println(date.replaceAll("-", "/"));

		// split
		String a[] = s2.split(" ");
		for (String name : a) {
			System.out.print(name + " ");
		}
		
		System.out.println(s2.concat(date));
		
		String x="hello chandra ";
		String y="tcs";
		int c=10;
		int d=20;
		
		System.out.println(x+y+c+d);
		System.out.println(c+d+x+y);

	}

}
