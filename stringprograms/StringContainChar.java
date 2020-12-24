package stringprograms;

import java.util.Scanner;

public class StringContainChar {
public static void main(String[] args) {
		 
Scanner s=new Scanner(System.in);
System.out.println("enter any string-");
String st=s.nextLine();
char c[]=st.toCharArray();
 System.out.println(st.contains("ly"));
boolean b=false;
for( int i=0;i<c.length;i++)
{
	if(c[i]=='l'&&c[i+1]=='y')
	{
	b=true;	
	}
}System.out.println(st+"=="+b);
 
s.close();
}

}
