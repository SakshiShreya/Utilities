package funcAnd1DArray;

public class ArrayCode {

	public static void main(String[] args) {
		
		// declare
		int[] arr = null;
		System.out.println(arr);
		
		// allocate space
		arr = new int[5];
		System.out.println(arr);
		
		// get value
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// set value
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("printing after changing values");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// print
		System.out.println("Using for loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("enhanced for loop");
		for(int val:arr) {
			System.out.println(val);
		}
		
		int i = 0, j = 2;
		System.out.println("\n" + arr[i] + ", " + arr[j]);
		swap1(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

	}
	
	public static void swap1(int[] arr, int i, int j) {
		System.out.println(arr[i] + ", " + arr[j]);
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		System.out.println(arr[i] + ", " + arr[j]);
	}

}
