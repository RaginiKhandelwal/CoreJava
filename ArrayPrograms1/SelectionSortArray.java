package prestigepoint.ArrayPrograms;

public class SelectionSortArray {
	public static void main(String[] args) {
		int a[] = { 6, 4, 7, 2, 8, 3, 9, 1 };
		int temp = 0;
		int min;

		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; i < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
