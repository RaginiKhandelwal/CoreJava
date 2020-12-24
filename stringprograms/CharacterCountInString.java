package stringprograms;

import java.util.Scanner;

public class CharacterCountInString {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any string-");
		String st=s1.nextLine();
		//char c[]=st.toCharArray();
		//System.out.println("enter char to be searched=");
		
		String s="ragini khandelwal";
		 char c='a';
		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(st.charAt(i)==c)
			 {
				count++ ;
			 }
		 }System.out.println(c+"="+count);
		}
}
