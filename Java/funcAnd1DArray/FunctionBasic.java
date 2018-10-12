package funcAnd1DArray;

public class FunctionBasic {
	
	public static int val = 20;

	public static void main(String[] args) {		
		System.out.println("Hello");
		
		System.out.println(addition(10, 20));
		System.out.println(addition(20, 30));
		
		System.out.println("bye");
		
		// Global Scope
		System.out.println(val);
		int val = 200, one = 10;
		System.out.println(val);
		System.out.println(FunctionBasic.val);
		int ans = global(one);
		System.out.println(ans);
	}
	
	public static int global(int one) {
		int sum = one + val;
		return sum;
	}

	public static int addition(int a, int b) {

		return a + b;
		
	}

}
