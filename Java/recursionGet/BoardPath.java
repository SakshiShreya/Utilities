package recursionGet;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		
		System.out.println(boardPath(0, 10).size());

	}
	
	public static ArrayList<String> boardPath(int curr, int end) {
		
		if (curr > end) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		
		if (curr == end) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("\n");
			return baseResult;
		}
		
		ArrayList<String> myResult = new ArrayList<>();
		
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> recResult = boardPath(curr + dice, end);
			for (String recRes : recResult) {
				myResult.add(dice + recRes);
			}
		}
		return myResult;
	}

}
