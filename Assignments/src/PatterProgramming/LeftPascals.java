package PatterProgramming;

public class LeftPascals {
	public static void main(String[] args) {
		
		System.out.println("Start Programming");
		for(int i=1;i<=5;i++) {
			for(int j=2*5-i;j>i;j--) {
				System.out.print(" ");
			 }
			for(int k=i;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
