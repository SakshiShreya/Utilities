package linkedList;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

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
	public void addLast(int item) {
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	// O(1)
	public void addFirst(int item) {
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size >= 1) {
			nn.next = this.head;
		}

		// summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	// O(n)
	public void addAt(int item, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			addFirst(item);
		} else if (index == this.size) {
			addLast(item);
		} else {
			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

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
	public int getFirst() throws Exception {
		if (this.head == null) {
			throw new Exception("Linked List is Empty");
		}
		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {
		if (this.tail == null) {
			throw new Exception("Linked List is Empty");
		}
		return this.tail.data;
	}

	// O(n)
	public int getAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		if (index < 0 || index == this.size) {
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
		if (index < 0 || index == this.size) {
			throw new Exception("Index out of bound");
		}

		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(1)
	public int removeFirst() throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");
		}
		int rv = this.head.data;
		this.head = this.head.next;
		size--;
		if (this.size == 1) {
			this.tail = null;
		}
		return rv;
	}

	// O(n)
	public int removeLast() throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");
		}
		int rv = this.tail.data;

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
	public int removeAt(int index) throws Exception {
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
	
	// O(n^2)
	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size -1 ;
		
		while (left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			
			left++;
			right--;
		}
	}
	
	// O(n)
	public void reversePointer() {
		
		Node prev = head;
		Node curr = prev.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
		}
		
		// swapping 
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		
		this.tail.next = null;
	}
	
	// O(log(n))
	public int getMid() {
		
		Node n1 = this.head;
		Node n2 = this.head;
		
		while (n2.next != null && n2.next.next != null) {
			n1 = n1.next;
			n2 = n2.next.next;
		}
		
		return n1.data;
		
	}
	
}
