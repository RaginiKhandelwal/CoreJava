package stringprograms;

import java.util.Scanner;

public class StringContainDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any string-");
		String st=s.nextLine();
		char c[]=st.toCharArray();
		//boolean b=false;
//		for(int i=0;i<c.length;i++)
//		{
//			if(c[i]==[0-)
//			{
//				
//			}
//		}
		StringBuilder sb=new StringBuilder();
		 for(char c1:c)
		 {
			 if(Character.isDigit(c1))
			 {
			 sb.append(c1);
			 }
		 }
		 System.out.println("contains digits= "+sb);
		 s.close();
		
}
}
