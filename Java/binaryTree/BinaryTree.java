package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	Node root;
	int size;

	BinaryTree() {
		Scanner scn = new Scanner(System.in);
		this.root = takeInput(scn, null, false);
	}

	private Node takeInput(Scanner scn, Node parent, boolean isLeftorRight) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (isLeftorRight) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		int nodeData = scn.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child of " + node.data);
		choice = scn.nextBoolean();

		if (choice) {
			node.left = takeInput(scn, node, true);
		}

		choice = false;
		System.out.println("Do you have right child of " + node.data);
		choice = scn.nextBoolean();

		if (choice) {
			node.right = takeInput(scn, node, false);
		}

		return node;
	}
	
	public void display() {
		this.display(this.root);
	}
	
	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + node.left.data + " => ";
		}
		else {
			str = str + "END => ";
		}
		
		str = str + node.data;
		
		if (node.right != null) {
			str = str + " <= " + node.right.data;
		}
		else {
			str = str + " <= END";
		}
		
		System.out.println(str);
		
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}
	
	public int height() {
		return this.height(this.root);
	}
	
	private int height(Node node) {
		
		if (node == null) {
			return -1;
		}
		
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		
		int height = Math.max(lheight, rheight) + 1;
		
		return height;
	}
	
	public void preorder() {
		this.preorder(this.root);
		System.out.println("END");
	}
	
	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + ", ");
		preorder(node.left);
		preorder(node.right);
	}
	
	public void postorder() {
		this.postorder(this.root);
		System.out.println("END");
	}
	
	private void postorder(Node node) {
		if (node == null) {
			return;
		}
		preorder(node.left);
		preorder(node.right);
		System.out.print(node.data + ", ");
	}
	
	public void inorder() {
		this.inorder(this.root);
		System.out.println("END");
	}
	
	private void inorder(Node node) {
		if (node == null) {
			return;
		}
		preorder(node.left);
		System.out.print(node.data + ", ");
		preorder(node.right);
	}
	
	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<> ();
		queue.add(this.root);
		while(!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.print(rv.data + ", ");
			if (rv.left != null) {
				queue.addLast(rv.left);
			}
			if (rv.right != null) {
				queue.addLast(rv.right);
			}
			
		}
		System.out.println("END");
	}
}
