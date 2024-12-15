package PatterProgramming;

public class CharacterProgram2 {
	public static void main(String[] args) {
		
		System.out.println("start progran");
		
		char ch;
		for(int i=1;i<=5;i++) {
			ch='Z';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}

}
