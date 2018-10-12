package twoDArray;

public class SpiralPrint {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		spiralPrint(arr);

	}

	public static void spiralPrint(int[][] arr) {
		int top = 0, bottom = arr.length - 1, left = 0, right = arr[top].length - 1;
		int count = (bottom + 1) * (right + 1);
		int dir = 1;

		while (count > 0) {
			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + " ");
					count--;
				}
				dir++;
				top++;
			} else if (dir == 2) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][right] + " ");
					count--;
				}
				dir++;
				right--;
			} else if (dir == 3) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
					count--;
				}
				dir++;
				bottom--;
			} else {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
					count--;
				}
				dir = 1;
				left++;
			}
		}
	}

}
