package com.assignment;

public class RepeatedString1 {
	public static void main(String[] args) {

		System.out.println("this program is run by debug mode");
		String str = "Srinivas java developer";

		String[] arr = str.split(" ");

		int n = arr.length;

		for (int i = 0; i < n / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;

		}
		for (String s : arr) {
			System.out.println(s + " ");
		}
		
		

        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i] + (i == 0 ? "" : " "); // add space conditionally
        }

        System.out.println(reversed);

	}

}
