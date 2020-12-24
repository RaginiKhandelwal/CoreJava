package com.stringprograms;

public class CountChar {
	public static void main(String[] args) {
		String d = "my address is 99 sai kripa colony and phone is 878482149";

		System.out.println(d);
		int county = 0;
		String numbers = "";
		char chdigit[] = d.toCharArray();
		for (int i = 0; i < chdigit.length; i++) {
			if (Character.isDigit(chdigit[i])) {
				county++;
				numbers = numbers + chdigit[i];
			}

		}
		System.out.println(" counting numbers=" + county);
		System.out.println("  numbers=" + numbers);

		System.out.println(d.replaceAll("[0-9]", "."));

		 

	}
}
