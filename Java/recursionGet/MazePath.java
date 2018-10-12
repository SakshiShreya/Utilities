package recursionGet;

import java.util.ArrayList;

public class MazePath {
	public static void main(String[] args) {
		System.out.println(getMazePath(0, 0, 2, 2));
		System.out.println(getMazePathDiag(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazePath(int currRow, int currCol, int endRow, int endCol) {

		if (currRow > endRow || currCol > endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}

		if (currRow == endRow && currCol == endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResultH = getMazePath(currRow, currCol + 1, endRow, endCol);
		for (String recResH : recResultH) {
			myResult.add('H' + recResH);
		}
		ArrayList<String> recResultV = getMazePath(currRow + 1, currCol, endRow, endCol);
		for (String recResV : recResultV) {
			myResult.add('V' + recResV);
		}
		return myResult;
	}
	
	public static ArrayList<String> getMazePathDiag(int currRow, int currCol, int endRow, int endCol) {

		if (currRow > endRow || currCol > endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}

		if (currRow == endRow && currCol == endCol) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResultH = getMazePathDiag(currRow, currCol + 1, endRow, endCol);
		for (String recResH : recResultH) {
			myResult.add('H' + recResH);
		}
		ArrayList<String> recResultV = getMazePathDiag(currRow + 1, currCol, endRow, endCol);
		for (String recResV : recResultV) {
			myResult.add('V' + recResV);
		}
		ArrayList<String> recResultD = getMazePathDiag(currRow + 1, currCol + 1, endRow, endCol);
		for (String recResD : recResultD) {
			myResult.add('D' + recResD);
		}
		return myResult;
	}
}
