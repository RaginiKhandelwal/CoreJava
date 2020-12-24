import java.util.*;
//Java Program To Find Longest Substring Without Repeated Character  
public class LongestSubstring{
	public static void main(String[] args) {
		String s="bbcde";
		char[] ch=s.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(!map.containsKey(c))//if map does not contains the char 
            //then it adds into the map
            {
            	map.put(c,i);//key as char and value as i
            }
            else{
            	i=map.get(c);//if map contains the char then 
            	//else part will execute
            	//here i will be set 0 to the repeating char
            	//eg-for'abbcde'
            	//for i=0 a is added to map
            	//i=1 b is added to map
            	//i=2 now b is already in map
            	//now here i starts from 2 index and clears the map
            	map.clear();
            	//empty all the chars in map as it found repeated char
            }
		}
		System.out.println(map.keySet().toString());
	}
}