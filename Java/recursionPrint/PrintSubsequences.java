package recursionPrint;

public class PrintSubsequences {
	public static void main(String[] args) {
		printSS("abc", "");
		printSSASCII("ab", "");
	}
	
	public static void printSS(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, result);
		printSS(ros, result + cc);
	}
	
	public static void printSSASCII(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSSASCII(ros, result);
		printSSASCII(ros, result + cc);
		printSSASCII(ros, result + (int)cc);
	}
}
