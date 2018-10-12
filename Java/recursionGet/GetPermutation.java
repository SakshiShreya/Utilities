package recursionGet;

import java.util.ArrayList;

public class GetPermutation {
	public static void main(String[] args) {
		System.out.println(getPermutation("abc"));
	}

	public static ArrayList<String> getPermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getPermutation(ros);
		for (String recRes : recResult) {
			for (int i = 0; i <= recRes.length(); i++) {
				String val = recRes.substring(0, i) + cc + recRes.substring(i);
				myResult.add(val);
			}
		}
		return myResult;
	}
}
