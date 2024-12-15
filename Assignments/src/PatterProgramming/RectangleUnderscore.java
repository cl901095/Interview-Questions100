package PatterProgramming;

public class RectangleUnderscore {
	public static void main(String[] args) {
		int number=5;
		RectangleUnderscore e=new RectangleUnderscore();
		e.method(number);	
	}
	
	public void method(int n) {
		
		// i-->for rows
		for(int i=0;i<n;i++) {
			// j-->columns
			for(int j=0;j<n;j++) {
				System.out.print("*");
				if(j!=n-1) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}
