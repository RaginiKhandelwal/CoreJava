 
package prestigepoint;

//import java.util.Scanner;

 
public class PrimeNo1to99 {
    public static void main(String[] args) {
//        
       
      
         for(int i=2;i<100;i++)
         {
              boolean isPrime=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                  isPrime=false; 
                  break;
                }
                
            }
             if(isPrime)
                 System.out.print(" "+i); 
             
        }//System.out.println("prime nos from 1 to 99==");
    }
}
