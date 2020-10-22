 
package prestigepoint;

 import java.util.Scanner;
public class FindDigitInNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter any digit");
        int digit=sc1.nextInt();
         int count=0;
         int rem=0;

         while(number!=0)
         {
        rem=number%10;
       if(rem==digit)
         {	
             count++;
        } 
         number=number/10;
         }System.out.println("number found "+count +"times");
         sc.close();
         sc1.close();
	}
}
