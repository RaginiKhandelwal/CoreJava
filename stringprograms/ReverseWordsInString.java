package com.stringprograms;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String line = "hello i am ragini";
System.out.println(line);
		String splitline[] = line.split(" ");
		String revstr = "";

		for (int i = 0; i < splitline.length; i++) {
			String word = splitline[i];
			String rev = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			revstr = revstr + rev + " ";

		}
		System.out.println("rev str=" + revstr);
	}
}
