package segmentTree;

public class SegmentTree {
	private class Node {
		int data;
		int startInterval;
		int endInterval;
		Node left;
		Node right;
	}

	Node root;

	public SegmentTree(int[] arr) {
		this.root = constructTree(arr, 0, arr.length - 1);
	}

	private Node constructTree(int arr[], int si, int ei) {
		if (si == ei) {
			Node leaf = new Node();
			leaf.data = arr[si];
			leaf.startInterval = si;
			leaf.endInterval = ei;
			leaf.left = null;
			leaf.right = null;
			return leaf;
		}
		Node node = new Node();
		node.startInterval = si;
		node.endInterval = ei;
		int mid = (si + ei) / 2;
		node.left = this.constructTree(arr, si, mid);
		node.right = this.constructTree(arr, mid + 1, ei);
		node.data = node.left.data + node.right.data;
		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + "[" + node.left.startInterval + "-" + node.left.endInterval + "]," + node.left.data + " => ";
		} else {
			str = str + "null => ";
		}
		str = str + "[" + node.startInterval + "-" + node.endInterval + "]," + node.data;
		if (node.right != null) {
			str = str + " <= [" + node.right.startInterval + "-" + node.right.endInterval + "]," + node.right.data;
		} else {
			str = str + " <= null";
		}

		System.out.println(str);

		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int query(int si, int ei) {
		return this.query(this.root, si, ei);
	}

	private int query(Node node, int si, int ei) {
		// node is completely lying inside query
		if (node.startInterval >= si && node.endInterval <= ei) {
			return node.data;
		} // node is completely outside query interval
		else if (node.startInterval > ei || node.endInterval < si) {
			return 0;
		} // overlapping case
		else {
			int leftans = this.query(node.left, si, ei);
			int rightans = this.query(node.right, si, ei);
			return leftans + rightans;
		}

	}
	
	public void update (int index, int newValue) {
		this.root.data = update(this.root, index, newValue);
	}
	
	private int update(Node node, int index, int newValue) {
		if (index >= node.startInterval && index <= node.endInterval) {
			if (index == node.startInterval && index == node.endInterval) {
				node.data = newValue;
			} else {
				int leftValue = this.update(node.left, index, newValue);
				int rightValue = this.update(node.right, index, newValue);
				node.data = leftValue + rightValue;
			}
		}
		return node.data;
	}

}
