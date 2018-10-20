package funcAnd1DArray;

import java.util.Scanner;

public class SortingAndSearching {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = { 99, 77, 88, 66, 55 };
		insertionSort(array);
		display(array);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int maxInArray(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;

	}

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int item) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] < item) {
				low = mid + 1;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i], j;
			for (j = i - 1; j >= 0 && arr[j] > val; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = val;
		}
	}

}
