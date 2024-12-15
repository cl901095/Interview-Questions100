package com.assignment;

public class RemoveJunk2 {

	public static void main(String[] args) {
		
		// ^-->name it was "not"
		// Regular Expression : [^a-zA-Z0-9] we need to extract from the string in square bract letters
		
		String s="!@#$%^&ASDFGHJ)098765:/.,.,.,";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}
