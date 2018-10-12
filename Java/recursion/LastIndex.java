package recursion;

public class LastIndex {
	public static void main(String[] args) {
		int arr[] = { 3, 8, 1, 8, 8, 7 };
		System.out.println(lastIndex(arr, 0, 4));
	}
	
	public static int lastIndex(int arr[], int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		int res = lastIndex(arr, si + 1, data);
		if (res != -1) {
			return res;
		}
		else if (arr[si] == data) {
			return si;
		}
		return -1;
	}
}
