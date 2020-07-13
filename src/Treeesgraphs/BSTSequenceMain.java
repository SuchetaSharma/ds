package Treeesgraphs;

public class BSTSequenceMain {

	public static void main(String[] args) {
		/*
		 * A binary search tree was created by traversing through an array from left to right and inserting each element. 
		 * Given a binary search tree with distinct elements, print all possible arrays that could have led to this tree.
		 */
		BinaryNode root = new BinaryNode(1, null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		root.left.left = new BinaryNode(4, null, null);
		root.right.right = new BinaryNode(5, null, null);
		BSTSequence bstSequence = new BSTSequence();
		bstSequence.getnumberofArrays(root);

	}

}
