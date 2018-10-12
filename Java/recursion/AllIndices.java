package recursion;

public class AllIndices {

	public static void main(String[] args) {
		int arr[] = {3, 8, 1, 8, 8, 4};
		int indices[] = allIndices(arr, 0, 8, 0);
		for (int i = 0; i < indices.length; i++) {
			System.out.println(indices[i]);
		}
	}

	public static int[] allIndices(int arr[], int si, int data, int count) {
		if (si == arr.length) {
			int base[] = new int[count];
			return base;
		}

		int indices[] = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);
		}

		if (arr[si] == data) {
			indices[count] = si;
		}
		return indices;
	}

}
