import java.util.Arrays;

public class SeletionSort {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		System.out.println("UnSorted array " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Sorted array " + Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
