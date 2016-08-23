import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortProg {

	private void mergeSort(int[] arr, int p, int r) {
		int q;
		if (p < r) {
			q = (int) Math.floor((double) (p + r) / 2);
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q, r);
			// System.out.println(Arrays.toString(arr));
		}

	}

	private void merge(int[] arr, int p, int q, int r) {
		// System.out.println(Arrays.toString(arr));
		int[] temp = new int[6];
		int k = 0, i = p, j = q + 1;

		while (i <= q && j <= r) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		while (i <= q) {
			temp[k++] = arr[i++];
		}
		while (j <= r) {
			temp[k++] = arr[j++];
		}
		k=0;
		for (int h = p; h <= r; h++) {
			arr[h] = temp[k++];
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSortProg mer = new MergeSortProg();
		int[] arr = { 6, 5, 4, 3, 2, 1 };
		mer.mergeSort(arr, 0, arr.length - 1);
	}

}
