package com.stringprograms;

public class SwapStrings {
	public static void main(String[] args) {
		 

		String s3 = "ragini";
		String s4 = "aabhas";
		int l = s3.length();
		s3 = s3 + s4;
		System.out.println(s3);
		s4 = s3.substring(0, l);
		s3 = s3.substring(l);
		System.out.println("s3=" + s3);
		System.out.println("s4=" + s4);

	}
}
