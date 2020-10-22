 
package prestigepoint;

import java.util.Scanner;

 
public class NumberInWords {
    public static void main(String[] args) {
		//public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
                 
                String word=null;
                switch(number)
                {
                    case '0':
                        word="zero";
                        break;
                    case 1:
                        word="one";
                        break;
                           
                      case 2:
                        word="two";
                        break;
                      case 3:
                        word="three";
                        break;
                      case 4:
                        word="four";
                        break;
                      case 5:
                        word="five";
                        break;
                      case 6:
                        word="six";
                        break;
                      case 7:
                        word="seven";
                        break;
                      case 8:
                        word="eight";
                        break;
                      case 9:
                        word="nine";
                        break;
                          
                }System.out.println(number+" in words="+word);
                sc.close();
                    
}
}