import java.util.Arrays;

public class SelectionSort {
	static int[] selectionSort(int[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[min])
					min = j;
			}
			if (A[min] < A[i]) {
				int temp = A[min];
				A[min] = A[i];
				A[i] = temp;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int[] A = {5, 3, 7, 1, 2};
		int[] sorted = selectionSort(A);
		System.out.println(Arrays.toString(sorted));
	}
}
