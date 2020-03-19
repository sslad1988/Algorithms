import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		System.out.println("UnSorted array " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Sorted array " + Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				//save unnecessary iterations
				break;
			}
		}

	}

}
