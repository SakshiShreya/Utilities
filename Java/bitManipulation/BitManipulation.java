package bitManipulation;

public class BitManipulation {
	public static void main(String[] args) {
		System.out.println(extractBit(22, 5));
		System.out.println(setBit(6, 5));
		System.out.println(resetBit(22, 5));
		System.out.println(rightmostSetBit(6));
		System.out.println(addOne(7));
		System.out.println(magicNo(5));
		System.out.println(pascalSum(5));
		System.out.println(powerOfTwo(16));
	}

	public static int extractBit(int n, int i) {

		int mask = 1;

		mask = 1 << (i - 1);

		n = n & mask;

		return (n == 0 ? 0 : 1);
	}

	public static int setBit(int n, int i) {

		int mask = 1;

		mask = 1 << (i - 1);

		n = n | mask;

		return n;
	}

	public static int resetBit(int n, int i) {

		int mask = 1;

		mask = 1 << (i - 1);
		mask = ~mask;

		n = n & mask;

		return n;
	}

	public static int rightmostSetBit(int n) {

		int mask = 1, pos = 1;

		while ((n & mask) == 0) {
			pos++;
			mask = mask << 1;
		}
		return pos;
	}

	public static int addOne(int n) {
		int mask = 1;
		while ((n & mask) != 0) {
			n = n ^ mask;
			mask = mask << 1;
		}
		n = n ^ mask;
		return n;
	}

	public static int magicNo(int i) {
		int pow = 1, ans = 0;

		while (i != 0) {
			pow *= 5;

			if ((i & 1) != 0) {
				ans += pow;
			}

			i = i >> 1;
		}
		return ans;
	}

	public static int pascalSum(int n) {
		int res = (1 << n);
		return res - 1;
	}

	public static boolean powerOfTwo(int n) {
		if (n != 0) {

			if ((n & (n - 1)) == 0) {
				return true;
			}
		}
		return false;
	}

}
