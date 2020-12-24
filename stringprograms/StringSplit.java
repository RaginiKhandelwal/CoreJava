package stringprograms;

import java.util.Scanner;

public class StringSplit {
public static void main(String[] args) {
	//String s="aabhas is a good boy.";
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter any string-");
	String st=s.nextLine();
	
	
	String[]sp= st.split(" ");
	int count=0;
	for(String sp1:sp)
	{
		count++;
		System.out.println(sp1);
	}
	System.out.println(count);
	s.close();
}
}
