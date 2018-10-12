package recursionGet;

import java.util.ArrayList;

public class GetSubsequences {
	public static void main(String[] args) {
		System.out.println(getSS("abc"));
		System.out.println(getSSWAscii("ab"));
	}
	
	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		return myResult;
	}

	public static ArrayList<String> getSSWAscii(String str) {
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		int ascii = (int)cc;
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSSWAscii(ros);
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
			myResult.add(ascii + recResult.get(i));
		}
		return myResult;
	}
}
