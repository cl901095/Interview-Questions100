package PatterProgramming;

public class XshapePattern {
	public static void main(String[] args) {
		
		System.out.println("start program");
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				if(j==i || j==(5-i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
