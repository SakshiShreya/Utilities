package recursion;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 50, 30, 40, 20, 10 };
		bubbleSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
	}

	public static void bubbleSort(int arr[], int si, int li) {
		if (si < li) {
			if (arr[si] > arr[si + 1]) {
				int temp = arr[si];
				arr[si] = arr[si + 1];
				arr[si + 1] = temp;
			}
			
			bubbleSort(arr, si + 1, li);
		}
		else if (li > 0) {
			bubbleSort(arr, 0, li - 1);
		}

	}

}
