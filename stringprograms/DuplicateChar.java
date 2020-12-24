package stringprograms;

//import java.util.HashMap;
import java.util.Scanner;
 

public class DuplicateChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any string-");
		String st=s.nextLine();
		char c[]=st.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			 for(int j=i+1;j<c.length;j++)
			 {
				if(c[i]==c[j])
				{
					count++;
				System.out.println("duplicate="+c[i]);	
				 return;
				//break;
				}
			 }
		}System.out.println(count);how to count
		 
		s.close();
 	}
}
