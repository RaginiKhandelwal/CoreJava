package prestigepoint.ArrayPrograms;

public class InsertInSortedArray {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 7, 8, 9 };

		int item = 6;

		for (int i = a.length - 2; item < a[i] && i > 0; i--) {

			a[i] = a[i - 1];
			a[i - 1] = item;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
