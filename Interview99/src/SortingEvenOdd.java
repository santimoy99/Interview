import java.util.Arrays;
import java.util.Collections;

public class SortingEvenOdd {

	public static void main(String[] args) {

		Integer[] arr = { 6, 9, 7, 10, 87, 56 };
		twoWaySort(arr, arr.length);

		System.out.print(Arrays.toString(arr));

	}

	static void twoWaySort(Integer arr[], int n) {
		// Current indexes from left and right
		int l = 0, r = n - 1;

		// Count of odd numbers
		int k = 0;

		while (l < r) {
			// Find first odd number from left side.
			while (arr[l] % 2 != 0) {
				l++;
				k++;
			}

			// Find first even number from right side.
			while (arr[r] % 2 == 0 && l < r)
				r--;

			// Swap odd number present on left and even
			// number right.
			if (l < r) {
				// swap arr[l] arr[r]
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;

			}

		}

		// Sort odd number in descending order
		Arrays.sort(arr, 0, k, Collections.reverseOrder());

		// Sort even number in ascending order
		Arrays.sort(arr, k, n);
	}

}
