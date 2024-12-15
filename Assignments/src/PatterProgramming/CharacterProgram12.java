package PatterProgramming;

import java.util.Scanner;

public class CharacterProgram12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the rows");
		int rows = sc.nextInt();
		char ch;

		for (int i = rows; i >= 1; i--) {
			ch = 'a';

			for (int j = 2 * rows - i; j > i; j--)
				
			{
				System.out.print(" ");
			}

			for (int k = i; k >= 1; k--) {
				System.out.print(ch + " ");

				ch++;
			}
			System.out.println();
		}
			
		// 
			for(int i=2;i<=rows;i++) {
				ch='a';
				for(int j= 2*rows-i;j>i;j--) {
					System.out.print(" ");	
				}
				for(int k=i;k>=1;k--) {
					System.out.print(ch+" ");
					ch++;
				}
				System.out.println();
				
			}
		

	}

}
