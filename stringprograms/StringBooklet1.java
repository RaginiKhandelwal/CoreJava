package stringprograms;
//example 1 to 6
public class StringBooklet1 {
public static void main(String[] args) {
	String s1="ragini";
	//String s2="ragini";
	String s2=new String("ragini");
	String s4=new String("ragini");
	System.out.println(s1==s2);//ref comp
	System.out.println(s1.equals(s2));//content comp
	int i=95;
	
	System.out.println(s1);
	System.out.println(s1.toString());
	
	String s3=String.valueOf(i);
	//System.out.println(s1.valueOf(s2));
	System.out.println(s3+10+10);//951010
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s4.hashCode());
	
	String s5="aabhas"+s1;
	String s6="aabhas"+"ragini";
	System.out.println(s5==s6);//ref comp
	System.out.println(s5.equals(s6));//content comp
	System.out.println(s5.hashCode());
	System.out.println(s6.hashCode());
	
	//ex 7---------------
	StringBooklet1 st=new StringBooklet1(10);
	String ex7=new String();
  
}
int i;
StringBooklet1(int i)
{
	this.i=i;
}

}
