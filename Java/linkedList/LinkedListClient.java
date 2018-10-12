package linkedList;

public class LinkedListClient {
	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addAt(100, 1);
		list.display();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.getAt(3));
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		list.display();
		list.addLast(200);
		list.addLast(300);
		list.display();
//		System.out.println(list.removeAt(3));
		list.display();
		list.reverseData();
		list.display();
		list.reversePointer();
		list.display();
		System.out.println(list.getMid());
	}
}
