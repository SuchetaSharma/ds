package Treeesgraphs;

import java.util.ArrayList;

public class FindCommonAncestorMain {

	/*
	 * Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. 
	 * Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.
	 */
	public static void main(String[] args) {

		BinaryNode root = new BinaryNode(1, null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		root.left.left = new BinaryNode(4, null, null);
		root.right.right = new BinaryNode(5, null, null);
		
		FindCommonAncestor graph = new FindCommonAncestor();
		
		BinaryNode result = graph.findCommonAncestor(root, 4, 5);
		//graph.printPath(nodelist.get(2));
		System.out.println(result.value);
	

	}

}
