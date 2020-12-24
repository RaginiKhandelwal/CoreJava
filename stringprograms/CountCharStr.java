package com.stringprograms;

public class CountCharStr {
	public static void main(String[] args) {
		String s = "ragini khandelwal";
		char c = 'i';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(c + " =" + count);

//reverse string 1 way
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
