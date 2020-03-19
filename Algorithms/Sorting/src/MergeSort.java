import java.util.Arrays;
public class MergeSort {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int arr[] =  {12, 11, 13, 5, 6, 7}; 
		System.out.println("UnSorted array " + Arrays.toString(arr));
		ms.sort(arr, 0, arr.length - 1);
		System.out.println("Sorted array " + Arrays.toString(arr));
	}

	private  void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l+r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	private  void merge(int[] arr, int l, int m, int r) {
		int lSize = m - l + 1;
		int rSize = r - m;

		int L[] = new int[lSize];
		int R[] = new int[rSize];
		
		for (int i = 0; i < lSize; i++)
			L[i] = arr[l + i];

		for (int j = 0; j < rSize; j++)
			R[j] = arr[m + j+ 1];
		System.out.println(" array L" + Arrays.toString(L));
		System.out.println(" array R" + Arrays.toString(R));
		int i = 0;
		int j = 0;
		int k = l;
		while (i < lSize && j < rSize) {
			if (L[i] < R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}

			k++;

		}
		while (i < lSize) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while ( j < rSize) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

}
