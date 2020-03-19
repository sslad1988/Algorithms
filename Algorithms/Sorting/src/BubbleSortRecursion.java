import java.util.Arrays;

public class BubbleSortRecursion {
	public static void main(String[] args) {
		BubbleSortRecursion bs= new BubbleSortRecursion();
		int arr[] = { 64, 25, 12, 22, 11 };
		
		System.out.println("UnSorted array " + Arrays.toString(arr));
		bs.sort(arr, arr.length );;
		System.out.println("Sorted array " + Arrays.toString(arr));
	}

	private  void sort(int[] arr, int n) {
		if (n == 1)
			return;
		for (int j = 0; j < n-1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		
		sort(arr, n - 1);
	}
}
