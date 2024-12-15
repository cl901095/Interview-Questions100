package PatterProgramming;

import java.util.Scanner;

public class CharacterProgram7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter how many rows you want");
		int rows = sc.nextInt();
		char ch;

		for (int i = 1; i <= rows; i++) {
			ch = 'a';
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(ch+" ");
				ch++;

			}
			System.out.println();
		}
	}

}
