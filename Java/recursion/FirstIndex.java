package recursion;

public class FirstIndex {
	public static void main(String[] args) {
		int arr[] = { 6, 8, 1, 1, 8, 3, 4};
		System.out.println(firstIndex(arr, 0, 7));
	}
	
	public static int firstIndex(int[] arr, int si, int data) {
		
		if (si == arr.length) {
			return - 1;
		}
		
		if (arr[si] == data) {
			return si;
		}
		else {
			int result = firstIndex(arr, si + 1, data);
			return result;
		}
		
	}
}
