package recursionPrint;

public class printBoardPath {
	public static void main(String[] args) {
		//printPath(0, 10, "");
		System.out.println(printPath(0, 10));
	}
	
	public static void printPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		
		if (curr > end) {
			return;
		}
		
		
		for (int dice = 1; dice <= 6; dice++) {
			printPath(curr + dice, end, ans + dice);
		}
	}
	
	public static int printPath(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		
		if (curr > end) {
			return 0;
		}
		
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += printPath(curr + dice, end);
		}
		
		return count;
	}
}
