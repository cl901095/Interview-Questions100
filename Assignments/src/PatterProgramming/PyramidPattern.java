package PatterProgramming;

public class PyramidPattern {
	public static void main(String[] args) {
		
		System.out.println("starting point");
		
		for(int i=1;i<=10;i++) {
			for(int k=10-i;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
 	}
	

}
