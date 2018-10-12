package interfaceAndGenerics.genericsDemo.genericClass;

public class QueueGeneric<T> {
	protected T[] data;
	protected int front;
	protected int size;

	public static final int DEFAULT_CAPACITY = 10;

	public QueueGeneric() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public QueueGeneric(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid Capacity");
		}
		this.data = (T[]) new Object[capacity];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void enqueue(T value) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Queue is full");
		}
		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = value;
		this.size++;
	}

	public T dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		T rv = this.data[this.front];
		this.data[this.front] = null;
		this.front = (this.front + 1) % data.length;
		this.size--;
		return rv;
	}

	public T front() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		T rv = this.data[this.front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + "=>");
		}
		System.out.println("END");
	}
}
