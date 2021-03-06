package bst;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int[] arr) {
		this.root = this.construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int low, int high) {
		if (low > high) {
			return null;
		}

		// mid
		int mid = (low + high) / 2;

		Node node = new Node();
		node.data = arr[mid];

		node.left = this.construct(arr, low, mid - 1);
		node.right = this.construct(arr, mid + 1, high);

		return node;
	}

	public void display() {
		System.out.println("--------------");
		display(this.root);
		System.out.println("--------------");
		
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";
		if (node.left == null) {
			str += ". => ";
		} else {
			str += node.left.data + " => ";
		}

		str += node.data;

		if (node.right == null) {
			str += " <= .";
		} else {
			str += " <= " + node.right.data;
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public void add(int item) {
		add(this.root, item);
	}

	private void add(Node node, int item) {

		if (item < node.data) {
			if (node.left == null) {
				Node nn = new Node();
				nn.data = item;

				node.left = nn;
			} else {
				add(node.left, item);
			}
		} else {
			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;

				node.right = nn;
			} else {
				add(node.right, item);
			}
		}

	}

	public void remove(int item) {
		remove(this.root, null, false, item);
	}

	private void remove(Node node, Node parent, boolean isLeftChild, int item) {
		if (null == null) {
			return;
		}
		
		if (item > node.data) {
			remove(node.right, node, false, item);
		} else if (item < node.data) {
			remove(node.left, node, true, item);
		} else {
			if (node.left == null && node.right == null) {
				if (isLeftChild) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.left == null && node.right != null) {
				if (isLeftChild) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else if (node.left != null && node.right == null) {
				if (isLeftChild) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else {
				int max = max(node.left);
				node.data = max;
				remove(node.left, node, true, max);
			}
		}

	}

}
