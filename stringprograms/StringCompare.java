package stringprograms;

public class StringCompare {
public static void main(String[] args) {
	String s1="ragini";
	String s2=new String("ragini");
	String s3="ragini";
	String s4=new String("ragini");
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
	System.out.println(s2==s4);
	System.out.println(s2.equals(s4));
	
	StringBuffer sb1=new StringBuffer("ragini");
	StringBuffer sb2=new StringBuffer("ragini");
	
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb2));
	System.out.println(s1.equals(sb1));
	
}
}
