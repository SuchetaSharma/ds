package Treeesgraphs;

public class ValidateeBinarySearchTree {
		//Our first thought might be to do an in-order traversal, copy the elements to an array, and then check to see if the array is sorted. 
		//this can't handle duplicate values.
		public static void main(String[] args) {
		BinaryNode node = new BinaryNode(1, null, null);
		node.left = new BinaryNode(2, null, null);
		node.right = new BinaryNode(3, null, null);
		node.left.left = new BinaryNode(4, null, null);
		node.left.right = new BinaryNode(5, null, null);
		node.right.left = new BinaryNode(6, null, null);
		node.right.right = new BinaryNode(7, null, null);
		int [] arr = inOrder(node);
		for(int i=0; i< arr.length; i++) {
			if(arr[i] >arr[i+1]) {
				//return false;
				System.out.println("not a valid binary search tree");
			}
		}

	}
		private static int[] inOrder(BinaryNode root) {
			int index = 0;
			int[] arr = new int[8];//root size
			if(root == null) {
			return null;
			}
			inOrder(root.left);
			//int i = getIndex();
			arr[index] = root.value;
			index ++;
			inOrder(root.right);
			return arr;
			
		}

}
