package interfaceAndGenerics.genericsDemo.genericClass;

public class DynamicStackGeneric<T> extends StackGeneric<T> {
	public DynamicStackGeneric() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	
	public DynamicStackGeneric(int capacity) throws Exception {
		super(capacity);
	}
	
	public void push(T item) throws Exception {
		if (this.size()==this.data.length) {
			@SuppressWarnings("unchecked")
			T arr[] = (T[]) new Object[2 * this.data.length];
			for (int i = 0; i < this.size(); i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
		super.push(item);
	}
}
