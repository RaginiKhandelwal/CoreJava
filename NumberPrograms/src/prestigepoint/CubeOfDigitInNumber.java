 
package prestigepoint;

import java.util.Scanner;

 
public class CubeOfDigitInNumber {
    public static void main(String[] args) {
		//public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		int rem=0;
		int cube=0;
		while(number!=0)
		{
			rem=number%10;
			if(rem%3==0)
			{
		      cube=rem*rem*rem;
		      System.out.println("cube of  "+rem+" divisible by 3 is = "+cube);
			}
			 
			number=number/10;
			sc.close();
	    }
    }
}
