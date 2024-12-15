package PatterProgramming;

import java.util.Scanner;

public class CharacterProgram5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number you want");
		 int rows=sc.nextInt();
		 char ch;
		 for(int i=rows;i>=1;i--) {
			 ch='g';
			 for(int j=1;j<=i;j++) {
				 System.out.print(ch+" ");
				 ch--;
			 }
			 System.out.println();
			 
		 }
	}

}
