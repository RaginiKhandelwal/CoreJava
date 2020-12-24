package com.stringprograms;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "radar";
		char c[] = s1.toCharArray();
		String s2 = "";
		for (int i = c.length - 1; i >= 0; i--) {
			// System.out.print(c[i]);
			s2 = s2 + c[i];
		}
		System.out.println("s2=" + s2);
		StringBuilder s3 = new StringBuilder(s1);
		System.out.println("rev=" + s3.reverse());

		if (s2.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
