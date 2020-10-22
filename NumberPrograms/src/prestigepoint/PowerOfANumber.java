 
package prestigepoint;

import java.util.Scanner;

 
public class PowerOfANumber {
    

public static void main(String[] args) {
		//public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number=");
		int number=sc.nextInt();
                Scanner sc1=new Scanner(System.in);
		System.out.println("enter the power=");
		int power=sc1.nextInt();
                int ex=power;
                int result=1;
                while(power!=0)
                {
                    result=result*number;
                    power--;
                }
                System.out.println(number+" to the power "+ex+"=="+result);
                sc.close();
                sc1.close();
}
}