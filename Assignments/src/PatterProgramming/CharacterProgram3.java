package PatterProgramming;

import java.util.Scanner;

public class CharacterProgram3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Please Number rows You want to Print");
		int rows=sc.nextInt();
		char ch='a';
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

}
