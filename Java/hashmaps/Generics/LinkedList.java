package hashmaps.Generics;

public class LinkedList<T> {
	private class Node {
		T data;
		Node next;
		
		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	// O(n)
	public void display() {
		System.out.println("-------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("-------------------");
	}

	// O(1)
	public void addLast(T item) {
		// create a new node
		Node nn = new Node(item, null);

		// attach
		if (this.isEmpty()) {
			this.head = nn;
			this.tail = nn;
		}
		else {
			this.tail.next = nn;
			this.tail = nn;
		}

		this.size++;
	}

	// O(1)
	public void addFirst(T item) {
		// create a new node
		Node nn = new Node(item, this.head);

		this.head = nn;

		// summary
		if (this.isEmpty()) {
			this.tail = nn;
		}
		this.size++;
	}

	// O(n)
	public void addAt(T item, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			addFirst(item);
		} else if (index == this.size) {
			addLast(item);
		} else {
			// create a new node
			Node nn = new Node(item, null);

			// attach
			Node nm1 = getNodeAt(index - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			// summary update
			size++;
		}
	}

	// O(1)
	public T getFirst() throws Exception {
		if (this.head == null) {
			throw new Exception("Linked List is Empty");
		}
		return this.head.data;
	}

	// O(1)
	public T getLast() throws Exception {
		if (this.tail == null) {
			throw new Exception("Linked List is Empty");
		}
		return this.tail.data;
	}

	// O(n)
	public T getAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Index out of bound");
		}

		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	// O(n)
	private Node getNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Index out of bound");
		}

		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(1)
	public T removeFirst() throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");
		}
		T rv = this.head.data;
		this.head = this.head.next;
		size--;
		if (this.size == 1) {
			this.tail = null;
		}
		return rv;
	}

	// O(n)
	public T removeLast() throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");
		}
		T rv = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			this.tail = this.getNodeAt(this.size - 2);
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}

	// O(n)
	public T removeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Index out of Bound");
		}
		if (size == 0) {
			throw new Exception("Linked List is Empty");
		}
		
		if (index == 0) {
			return removeFirst();
		}
		else if (index == this.size - 1) {
			return removeLast();
		}else {
			Node nm1 = getNodeAt(index - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			
			nm1.next = np1;
			
			this.size--;
			return n.data;
		}
	}
	
	public int find(T data) {
		int index = 0;
		for (Node temp = this.head; temp != null; temp = temp.next, index++) {
			if (temp.data.equals(data)) {
				return index;
			}
		}
		return -1;
	}
}
