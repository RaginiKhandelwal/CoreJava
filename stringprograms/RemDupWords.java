package com.stringprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemDupWords {
	public static void main(String[] args) {
		// remove duplicate strings in a line

		String o = "hello hello i am am ram ram ram dayal"

		String star[] = o.split(" ");

		Set set = new LinkedHashSet();
		for (String n : star) {
			set.add(n);
		}
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
