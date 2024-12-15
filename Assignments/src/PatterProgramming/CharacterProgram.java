package PatterProgramming;

public class CharacterProgram {
	public static void main(String[] args) {
		
		System.out.println("start program");
		char ch;
		
		for(int i=1;i<=5;i++) {
			ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
