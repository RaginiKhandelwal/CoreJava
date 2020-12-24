package stringprograms;

import java.util.Scanner;

public class StringPermutation {
	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		System.out.println("enter any string-");
		String st=s.nextLine();
		//char c[]=st.toCharArray();
		for( int i=0;i<st.length();i++)
		{
		char c=st.charAt(i);
		String s1=st.substring(0, i)+
				  st.substring(i+1);
		System.out.println(s1);
	}
}
}