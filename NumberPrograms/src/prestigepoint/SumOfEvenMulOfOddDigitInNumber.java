 
package prestigepoint;

import java.util.Scanner;

 
public class SumOfEvenMulOfOddDigitInNumber {
     public static void main(String[] args) {
		//public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		int rem=0;
		int productofodd=1;
                int sumofeven=0;
		while(number!=0)
		{
			rem=number%10;
			if(rem%2==0)
			{
                         sumofeven=sumofeven+rem;   
                        }
                        else
                        {
                            productofodd=  productofodd*rem;
                        }
                        number=number/10;
                }
                System.out.println("sum of even numbers="+sumofeven);
                System.out.println("product of odd numbers="+productofodd );
                sc.close();
                
     }
}