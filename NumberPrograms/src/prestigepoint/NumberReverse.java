 
package prestigepoint;

 
public class NumberReverse {
    public static void main(String[] args) {
        int n=123;
        int reverse=0;
        int rem=0;
        while(n!=0)
        {
        rem=n%10;
        reverse=reverse*10+rem;
         n=n/10; 
        
        } System.out.println("reverse="+reverse);
    }
}
