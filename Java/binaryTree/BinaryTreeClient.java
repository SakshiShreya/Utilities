package binaryTree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		
		// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
		BinaryTree tree = new BinaryTree();
		tree.display();
		System.out.println(tree.height());
		tree.preorder();
		tree.postorder();
		tree.inorder();
		tree.levelOrder();
	}

}
