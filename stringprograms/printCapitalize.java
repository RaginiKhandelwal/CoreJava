package stringprograms;

import java.util.Scanner;

public class printCapitalize {
public static void main(String[] args) {
	 
	char[]c;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string=");
	String st=s.nextLine();
	c=st.toCharArray();
	System.out.println(st.toUpperCase());
	int i=0;
	c[0]=(char)(c[0]-32);
	for( i=1;i<c.length;i++)
	{
		if(c[i]==' ')
		{
		c[i+1]=	(char)(c[i+1]-32);
		}
	}
	System.out.println(c);
	
	s.close();
}
}
