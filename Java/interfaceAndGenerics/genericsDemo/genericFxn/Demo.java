package interfaceAndGenerics.genericsDemo.genericFxn;

import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		Integer[] arri = { 10, 20, 30, 40, 50 };
		display(arri);

		String[] arrs = { "Hello", "India", "Delhi", "Sakshi" };
		display(arrs);
		
		Car[] cars = new Car[5];
		cars[0] = new Car(1000, 400, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(500, 900, "Black");
		cars[3] = new Car(300, 30, "Grey");
		cars[4] = new Car(700, 60, "White");
		
		
//		bubble(cars);
		bubble(cars, new CarSpeedComparator());
		display(cars);

		bubble(cars, new CarPriceComparator());
		display(cars);

		bubble(cars, new CarColorComparator());
		display(cars);
		
		
	}

//	public static void display(Integer[] arr) {
//		for (Integer val : arr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//	}
//
//	public static void display(String[] arr) {
//		for (String val : arr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> void bubble(T[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
	
	public static <T> void bubble(T[] arr, Comparator<T> comparator) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}
