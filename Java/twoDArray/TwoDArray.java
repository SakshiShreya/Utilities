package twoDArray;

public class TwoDArray {

	public static void main(String[] args) {

//		int[][] arr;
//		arr = new int[3][3];

		
//		int[][] arr = new int[3][3];
//		display(arr);
//		arr[0][0] = 10;
//		arr[2][0] = 20;
//		display(arr);
		
		int[][] arr = new int[3][];
		arr[0] = new int[4];
		arr[2] = new int[3];
		arr[1] = new int[2];
		display(arr);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
