package PatterProgramming;

import java.util.Scanner;

public class CharacterPrgram11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter rows");
		int rows = sc.nextInt();
		char ch;

		for (int i = rows; i >= 1; i--) {
			ch = 'a';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
		
		for(int i=2;i<=rows;i++) {
			ch='a';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
