package com.switchCaseStatement;

import java.io.*;

public class IndianCricketPlayers {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Jersy Number");
		String str = br.readLine();

		int num = Integer.parseInt(str);

		switch (num) {
		
		case 1: System.out.println("KL Rahul");
		break;
		
		case 17: System.out.println("Rishabh Pant");
		break;
		
		case 2: System.out.println("Arshdeep Singh");
		break;
		
		case 3: System.out.println("Yuzvendra Chahal");
		break;
		
		case 4: System.out.println("T Natarajan");
		break;
		
		case 45: System.out.println("Rohit Sharma");
		break;
		
		case 5: System.out.println("Washington Sundar");
		break;
		
		case 18: System.out.println("Virat Kohli");
		break;
		
		case 6: System.out.println("Wriddhiman Shaha");
		break;
		
		case 7: System.out.println("MS Dhoni");
		break;
		
		case 8: System.out.println("Ravindra Jadeja");
		break;
		
		case 9: System.out.println("Sanju Samson");
		break;
		
		case 10: System.out.println("Sachin Tendulkar");
		break;
		
		case 11: System.out.println("Mohammed Shami");
		break;
		
		case 12: System.out.println("Yuvraj Singh, Nitish Rana");
		break;
		
		case 13: System.out.println("Munaf Patel, Mohammed Siraj");
		break;
		
		case 14: System.out.println("Sanju Samson");
		break;
		
		case 15: System.out.println("Bhuvneshwar Kumar");
		break;
		
		case 16: System.out.println("Mayank Agarwal");
		break;
		

		}
	}

}
