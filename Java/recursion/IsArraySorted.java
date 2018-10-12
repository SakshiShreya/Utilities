package recursion;

public class IsArraySorted {

	public static void main(String[] args) {
		
		int[] arr = { 1, 3, 4, 5 };
		System.out.println(isSorted(arr, arr.length - 1));

	}

	public static boolean isSorted(int[] arr, int si) {
		if (si == 0) {
			return true;
		}
		if (arr[si] > arr[si-1]) {
			boolean result = isSorted(arr, si-1);
			return result;
		}
		return false;
	}

}
