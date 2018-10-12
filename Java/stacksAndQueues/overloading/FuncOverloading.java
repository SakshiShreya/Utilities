package stacksAndQueues.overloading;

public class FuncOverloading {

	public static void main(String[] args) {

		System.out.println(sum(2, 3));
		System.out.println(sum(2, 3, 4));
		System.out.println(sum(3.2, 2.1));
		System.out.println(sum(3.2, "Hello"));
		System.out.println(sum(2, 3, 4, 5, 6));

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}

	public static String sum(double a, String b) {
		return a + b;
	}
	
	// variable no of arguments
	// always at the end of argument list
	// there can be at max only one variable arguments
	// args is actually array
	public static int sum(int... args) {
		int sum = 0;
		for(int val : args) {
			sum += val;
		}
		return sum;
	}

}
