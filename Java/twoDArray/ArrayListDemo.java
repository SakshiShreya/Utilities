package twoDArray;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());

		list.add(20);
		System.out.println(list);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list);
		System.out.println(list.size());

		list.add(40);
		System.out.println(list);
		System.out.println(list.size());

		list.add(50);
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(45);
		list1.add(76);
		list1.addAll(list);
		System.out.println(list1);
		
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		list2.add(list1);
		list2.add(list);
		System.out.println(list2);
	}
	
}
