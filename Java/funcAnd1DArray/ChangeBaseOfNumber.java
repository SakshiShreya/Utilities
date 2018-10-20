package funcAnd1DArray;

import java.util.Scanner;

public class ChangeBaseOfNumber {

	public static void main(String[] args) {	
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt();
//		int sbase = scn.nextInt();
//		
//		int res = anyToDec(snum, sbase);
		
		int dbase = scn.nextInt();
		
		int res = decToAny(snum, dbase);
		
		System.out.println(res);
		
		int a = anyToDec(1423, 5);
		int b = decToAny(a, 7);
		
		System.out.println(b);
		
	}
	
	public static int anyToDec(int snum, int sbase) {
		int ans = 0;
		int multiplier = 1;
		
		while(snum != 0) {
			int rem = snum % 10;
			ans = ans + (rem * multiplier);
			multiplier *= sbase;
			snum /= 10;
		}
		
		return ans;
	}
	
	public static int decToAny(int snum, int dbase) {
		int ans = 0;
		int multiplier = 1;
		
		while(snum != 0) {
			int rem = snum % dbase;
			ans = ans + (rem * multiplier);
			multiplier *= 10;
			snum /= dbase;
		}
		
		return ans;
	}

}
