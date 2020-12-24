package stringprograms;

import java.util.Scanner;

public class CheckVowelsDigit {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any string-");
	String st=s.nextLine();
	char[]c=st.toCharArray();
	int count=0;
//	for( char ch:c)
//	{
//	 switch(ch){
//	 case 'a':
//	 case 'e':
//	 case 'i':
//	 case 'o':
//	 case 'u':
//		count++;
//		break;
//	 
//	 }
//	}
	int digit=0;
	int space=0;
	int consonant=0;
	int n=st.length();
	System.out.println(n);
	System.out.println("vowels="+count);
//	float f=(count/n)*100;
//	System.out.println("percentage="+ f);
	
	for(int i=0;i<st.length();i++)
	{
		if(c[i]>='0' &&c[i]<='9')
		{
			digit++;
		}
	else if(c[i]=='a' ||c[i]=='e' ||c[i]=='i'||c[i]=='o'||c[i]=='u')
		{
			count++;
		}
	else if(c[i]==' ')
	{
		space++;
	}
	else
	{
		consonant++;
	}
	}System.out.println("digits="+digit);
	System.out.println("vowels="+count);
	System.out.println("space="+space);
	System.out.println("consonant"+consonant);
}
}	
