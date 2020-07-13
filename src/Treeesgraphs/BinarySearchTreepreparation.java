package Treeesgraphs;

import java.util.LinkedList;

public class BinarySearchTreepreparation {

	public static void main(String[] args) {

		BinaryNode root = new BinaryNode(1,null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		LinkedList<BinaryNode> list = new LinkedList();
		list.add(root.left);
		list.add(root.right);
		root.setNeighbours(list);
		BinaryNode node = search(root,1);
		if(null != node) {
		System.out.println(node.value);
		} else {
			System.out.println("value not found");
		}
		//insert(new BinaryNode(4, null, null));
		//deleteNodeOfBinaryTree(root, 4);
	

	}

	private static BinaryNode search(BinaryNode root, int value) {
		if(root == null) {
			return null;
		}
		if(root.value == value) {
			return root;
		}else if(root.value > value) {
			search(root.right, value);
		}else {
			search(root.left, value);
		}
		
		return null;
	}

	private static BinaryNode delete(BinaryNode root, int value) {
		if(root == null) {
			return null;
		}
		if(root.value == value) {
			return root;
		}else if(root.value > value) {
			search(root.right, value);
		}else {
			search(root.left, value);
		}
		
		return null;
	}

	private static BinaryNode insert(BinaryNode root, int value) {
		if(root == null) {
			BinaryNode node = new BinaryNode(value, null, null);
			
		}
		if(root.value == value) {
			return null;
		}else if(root.value > value) {
			search(root.right, value);
		}else {
			search(root.left, value);
		}
		
		return null;
	}
	
	// Deleting a node from BST
		public void deleteNodeOfBST(int value) {
			System.out.println("\n\nDeleting " + value + " from BST...");
			deleteNodeOfBST(root,value);
		}
		
		// Helper Method for delete
		public BinaryNode deleteNodeOfBST(BinaryNode root, int value) {
			if (root == null) {
				System.out.println("Value not found in BST");
				return null;
			}
			if (value < root.getValue()) {
				root.setLeft(deleteNodeOfBST(root.getLeft(), value));
			} else if (value > root.getValue()) {
				root.setRight(deleteNodeOfBST(root.getRight(), value));
			} else { // If currentNode is the node to be deleted

				if (root.getLeft() != null && root.getRight() != null) { // if nodeToBeDeleted have both children
					BinaryNode temp = root;
					BinaryNode minNodeForRight = minimumElement(temp.getRight());// Finding minimum element from right subtree
					root.setValue(minNodeForRight.getValue()); // Replacing current node with minimum node from right subtree
					root.setRight(deleteNodeOfBST(root.getRight(), minNodeForRight.getValue()));  // Deleting minimum node from right now
				} else if (root.getLeft() != null) {// if nodeToBeDeleted has only left child
					root = root.getLeft();
				} else if (root.getRight() != null) {// if nodeToBeDeleted has only right child
					root = root.getRight();
				} else // if nodeToBeDeleted do not have child (Leaf node)
					root = null;
			}
			return root;
		}// end of method

		
		
		// Get minimum element in binary search tree
		public static BinaryNode minimumElement(BinaryNode root) {
			if (root.getLeft() == null)
				return root;
			else {
				return minimumElement(root.getLeft());
			}
		}// end of method

		
		// Search a node in BST
		void searchForValue(int value) {
			searchForValue(root, value);
		}
		
		

}
