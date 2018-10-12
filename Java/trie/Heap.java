package trie;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	
	ArrayList<T> data = new ArrayList<>();
	
	// O(logn)
	public void add(T item) {
		data.add(item);
		upheapify(data.size() - 1);
	}
	
	// O(logn)
	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		
		if (isLarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}
		
	}
	
	private void swap (int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
	}
	
	public void display() {
		System.out.println(this.data);
	}
	
	public int size() {
		return this.data.size();
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	// O(logn)
	public T remove() {
		swap(0, this.data.size()-1);
		T rv = this.data.remove(this.data.size()-1);
		downheapify(0);
		return rv;
	}

	// O(logn)
	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < this.data.size() && isLarger(data.get(lci), data.get(mini)) > 0) {
			mini = lci;
		}
		if (rci < this.data.size() && isLarger(data.get(lci), data.get(mini)) > 0) {
			mini = rci;
		}
		
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}
	
	// O(1)
	public T get() {
		return this.data.get(0);
	}
	
	// If t is havng higher priority, return +ve value
	public int isLarger(T t, T o) {
		return t.compareTo(o);
	}
	
}
