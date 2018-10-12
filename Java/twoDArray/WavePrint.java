package twoDArray;

public class WavePrint {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		rowWavePrint(arr);

	}
	
	public static void rowWavePrint(int[][] arr) {
		int col = 0;
		for(int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				while (col < arr[i].length) {
					System.out.print(arr[i][col] + " ");
					col++;
				}
				col--;
			}
			else {
				while (col >= 0) {
					System.out.print(arr[i][col] + " ");
					col--;
				}
				col = 0;
			}
		}
		
	}

}
