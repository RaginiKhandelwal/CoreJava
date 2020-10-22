/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestigepoint;

import java.util.Scanner;

 
public class SumOfSqOfDigitInNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		int rem=0;
		int sum=0;
		while(number!=0)
		{
			rem=number%10;
			sum=sum+rem*rem;
			number=number/10;

		}System.out.println("sum of square of number="+sum);
		sc.close();
}
}