package PatterProgramming;

import java.util.Scanner;

public class CharacterProgram8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pleaase enter number of rows");

		int rows = sc.nextInt();
		char ch = 'A';

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(ch + " ");
				ch--;
			}
			ch = (char) ((int) 'A' + i);
			System.out.println();

		}

	}

}
