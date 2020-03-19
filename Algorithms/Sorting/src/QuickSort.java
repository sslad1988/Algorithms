import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("UnSorted array " + Arrays.toString(arr));
		qs.sort(arr, 0, arr.length - 1);
		System.out.println("Sorted array " + Arrays.toString(arr));
	}

	private void sort(int[] arr, int l, int r) {
		if (l < r) {
			int pivot = partition(arr, l, r);
			sort(arr, l, pivot - 1);
			sort(arr, pivot + 1, r);
		}
	}

	private int partition(int[] arr, int l, int r) {		
		int pivot = arr[r];
		int i = l;
		for (int j = l; j < r; j++) {
			if (arr[j] < pivot) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;

			}
		}

		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;

		return i;
	}

}