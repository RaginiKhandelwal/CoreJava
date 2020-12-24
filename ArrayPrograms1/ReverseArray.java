package prestigepoint.ArrayPrograms;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = { 3, 6, 8, 2, 4, 9, 8, 5 };
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i]);
		}
		// we will use swapping method for reversing array elements
		int temp = 0;
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(" " + a[i]);
		}

	}
}
