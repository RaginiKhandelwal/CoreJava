package stringprograms;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string=");
	String st=s.next();
	char[]c=st.toCharArray();
	 
	String palin="";
	for(int i=c.length-1;i>=0;i--)
	{
		palin=palin+c[i];
		 
	}
	System.out.println(palin);
	System.out.println(st);
	if( st.equals(palin))
	{
		 System.out.println("palin");
	}
	else
	{
		System.out.println("not palin");
	}
//	if(b==true)
//	System.out.println("palindrome");
//	else
//		System.out.println("not palindrome");
}
}
