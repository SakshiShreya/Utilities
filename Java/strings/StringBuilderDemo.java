package strings;

import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.append("abc");
		System.out.println(sb);
		
		sb.insert(2, "def");
		System.out.println(sb);
		
		sb.insert(sb.length(), 'g');
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		sb.setCharAt(4, 'b');
		System.out.println(sb);
		
		String s = sb.toString();
		System.out.println(s);
	}
	
}
