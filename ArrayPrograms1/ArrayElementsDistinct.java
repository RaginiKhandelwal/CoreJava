package prestigepoint.ArrayPrograms;

public class ArrayElementsDistinct {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 7, 8, 9, 10, 11 };
		int flag = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 1) {
			System.out.println("not distinct");
		} else {
			System.out.println("distinct");
		}
	}
}
