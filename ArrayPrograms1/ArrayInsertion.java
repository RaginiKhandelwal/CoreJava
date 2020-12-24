package prestigepoint.ArrayPrograms;

public class ArrayInsertion {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 7, 8, 9 };

		int item = 100;
		int pos = 4;
		for (int i = a.length - 1; i >= pos - 1; i--) {
			a[i] = a[i - 1];

		}
		a[pos - 1] = item;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
