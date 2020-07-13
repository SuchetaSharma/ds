package Treeesgraphs;


public class CheckBalanced {

	public static void main(String[] args) {
		//Implement a function to check if a binary tree is balanced. 
		//a balanced tree is defined to be a tree such that the heights.
		//of the two subtrees of any node never differ by more than one.
		BinaryNode node = new BinaryNode(1, null, null);
		node.left = new BinaryNode(2, null, null);
		node.right = new BinaryNode(3, null, null);
		node.left.left = new BinaryNode(4, null, null);
		node.left.right = new BinaryNode(5, null, null);
		node.right.left = new BinaryNode(6, null, null);
		node.right.right = new BinaryNode(7, null, null);
		int i = checkHeight(node);
		System.out.println(i);
		boolean blnFlag = isBalanced(i);
		System.out.println(blnFlag);
	}

	private static boolean isBalanced(int i) {
		return i != Integer.MIN_VALUE;
	}

	private static int checkHeight(BinaryNode root) {
		if(null == root) {
			return -1;
		}
		int leftHeight = checkHeight(root.left);
		if(leftHeight == Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		int rightHeight = checkHeight(root.right);
		if(rightHeight == Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		int heightDiff = Math.abs(leftHeight - rightHeight);
		if(heightDiff > 1) {
			return Integer.MIN_VALUE;
		}else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

}
