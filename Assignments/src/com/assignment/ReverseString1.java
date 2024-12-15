package com.assignment;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "javadeveloper";
		
		//1. Using For Loop type
//		char[] ch = str.toCharArray();
//
//		for (int i = ch.length - 1; i >= 0; i--) {
//			System.out.println(ch[i]);
//		}
		
		//2. Using for Loop2
//		String rev="";
//		int len=str.length();
//		System.out.println("String length = "+len);
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		//3.Using StringBuffer class
		StringBuffer sf=new StringBuffer(str);
		System.out.println(sf.reverse());

	}

}
