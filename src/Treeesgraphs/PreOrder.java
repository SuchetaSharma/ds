package Treeesgraphs;

public class PreOrder {

	public static void main(String[] args) {
		BinaryNode root = new BinaryNode(1,null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		preOrder(root);
	}

	private static void preOrder(BinaryNode root) {
		if(root == null) {
			System.out.println("the tree is empty");
			return;
		}else {
			System.out.println(root.value);
		}
		preOrder(root.left);
		preOrder(root.right);
		
		// Inorder
		/*
		 * if (root == null) return; inorder(root.left); System.out.print(root.data +
		 * " "); inorder(root.right);
		 */
		
	}

}
