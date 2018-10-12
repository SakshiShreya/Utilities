package interfaceAndGenerics.genericsDemo.genericClass;

public class DynamicQueueGeneric<T> extends QueueGeneric<T> {

	public DynamicQueueGeneric() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	
	public DynamicQueueGeneric(int capacity) throws Exception {
		super(capacity);
	}
	
	public void enqueue(T item) throws Exception {
		if (this.size() == this.data.length) {
			@SuppressWarnings("unchecked")
			T arr[] = (T[]) new Object[2 * this.data.length];
			for (int i = 0; i < this.size; i++) {
				arr[i] = this.data[(this.front + i) % this.data.length];
			}
			this.data = arr;
			this.front = 0;
		}
		super.enqueue(item);
	}
	
}
