package PatterProgramming;

import java.util.Scanner;

public class CharcterProgram6 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter how many rows you want");
		int rows=sc.nextInt();
		char ch;
		for(int i=rows;i>=1;i--) {
			ch='a';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
