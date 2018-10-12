package recursionPrint;

public class PrintMazePath {

	public static void main(String[] args) {
		
		printPath(0, 0, 2, 2, "");
		System.out.println(printPath(0, 0, 2, 2));
		printPathDiag(0, 0, 2, 2, "");
		System.out.println(printPathDiag(0, 0, 2, 2));

	}
	
	public static void printPath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		
		if (cr > er || cc > ec) {
			return;
		}
		
		printPath(cr, cc + 1, er, ec, ans + "H");
		printPath(cr + 1, cc, er, ec, ans + "V");
	}
	
	public static int printPath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}
		
		if (cr > er || cc > ec) {
			return 0;
		}
		
		int count = 0;
		count += printPath(cr, cc + 1, er, ec);
		count += printPath(cr + 1, cc, er, ec);
		
		return count;
	}
	
	public static void printPathDiag(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		
		if (cr > er || cc > ec) {
			return;
		}
		
		printPathDiag(cr, cc + 1, er, ec, ans + "H");
		printPathDiag(cr + 1, cc, er, ec, ans + "V");
		printPathDiag(cr + 1, cc + 1, er, ec, ans + "D");
	}
	
	public static int printPathDiag(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}
		
		if (cr > er || cc > ec) {
			return 0;
		}
		
		int count = 0;
		count += printPathDiag(cr, cc + 1, er, ec);
		count += printPathDiag(cr + 1, cc, er, ec);
		count += printPathDiag(cr + 1, cc + 1, er, ec);
		
		return count;
	}

}
