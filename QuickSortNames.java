
import java.util.Arrays;

public class QuickSortNames {

	public static void main(String[] args) {
		String[] names = { "John", "Alice", "Bob", "Eve", "David", "Carol", "Frank" };

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(names));

		quickSort(names, 0, names.length - 1);

		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(names));
	}

	public static void quickSort(String[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(String[] arr, int low, int high) {
		String pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j].compareTo(pivot) <= 0) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, high);
		return i + 1;
	}

	public static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
