
package prestigepoint.ArrayPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = // new int[5];
				{ 4, 5, 6, 43, 7, 8, 9, 98 };
		int tempmin = 0;
		int tempmax = 0;
		// a[0]=temp;
		int i;
		System.out.println("array elements");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		tempmin = tempmax = a[0];
		for (i = 1; i < a.length; i++) {
			if (a[i] < tempmin) {
				tempmin = a[i];
			}
			if (a[i] > tempmax) {
				tempmax = a[i];
			}

		}
		System.out.println("min=" + tempmin);
		System.out.println("max=" + tempmax);

		List l = Arrays.asList(a);

		Iterator li = l.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		sc.close();

	}
}
