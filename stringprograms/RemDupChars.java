package com.stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemDupChars {
public static void main(String[] args) {
	System.out.println("=====remove duplicate characters in a string=================");
    String dup="abcabcabd";

    String []dupc=dup.split("");
     
    Set setdup= new LinkedHashSet();
    for(String sd:dupc){
    	setdup.add(sd);
    }
     System.out.println("dup string without duiplicate chars="+setdup);
}
}
