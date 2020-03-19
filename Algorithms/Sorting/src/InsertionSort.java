import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		System.out.println("UnSorted array " + Arrays.toString(arr));
		sort(arr);
		;
		System.out.println("Sorted array " + Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int element = arr[i];
			int j = i - 1;
			while(arr[j] > element && j >=0)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] =  element;
		}
		
	}
}
