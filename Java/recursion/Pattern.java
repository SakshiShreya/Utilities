package recursion;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern (5, 1, 1);
	}
	
	public static void pattern (int N, int row, int col) {
		System.out.print("* ");
		if (row == N && col == N) {
			return;
		}
		if (row == col) {
			System.out.println();
			pattern(N, row + 1, 1);
			return;
		}
		pattern (N, row, col + 1);
	}

}
