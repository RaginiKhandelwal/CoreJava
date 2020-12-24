package stringprograms;

 

public class CharToString {
public static void main(String[] args) {
	 char[]c= {'a','b','c','d','e','f'};
	 System.out.print("char array=");
	 for(char a:c)
	 {
		 System.out.print(a); 
	 }
	 String s= new String(c);
	 System.out.println("  String="+s);
	
	 
	 char ch[]= {'r','a','g','i','n','i'};
	 String st="aabhas"+new String(ch);;
	 
	 System.out.println(st);
	 String s1="ragini";
	 char[]c1=s1.toCharArray();
	 for(char c2:c1)
	 {
		 System.out.println(c2);
	 }
	// String s2=s1.toUpperCase();
	 //System.out.println(s2);
	 for(int i=0;i<= c1.length-1;i++)
	 {
		c1[i]=(char)(c1[i]-32); 
	 }
     System.out.print(c1);
     System.out.println();
	System.out.println(s1.replace("i","y"));
	//trim spaces program
	String s2="i	love	india";
	s2=s2.replaceAll("\\t", " ");
	System.out.println(s2);
	//[]ch2=s2.toCharArray();
	//System.out.println(s2.trim());
//	for(int i=0;i<ch2.length;i++)
//	{
//		 if(ch2[i]==' ')
//		 {
//			ch2[i+1] 
//		 }
//			
//		
//	}
	 
}
  }
