package PatterProgramming;

public class NumberReversePattern {
	public static void main(String[] args) {
		
		System.out.println("pattern");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
