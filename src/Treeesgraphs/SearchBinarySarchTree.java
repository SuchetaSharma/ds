package Treeesgraphs;

public class SearchBinarySarchTree {

	//O(logn)
	public static void main(String[] args) {
		BinaryNode root = new BinaryNode(1,null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		searchBinarySearchTree(root, 3);
	}

	private static void searchBinarySearchTree(BinaryNode root, int i) {
		if(root == null) {
			System.out.println("the tree is null");
			return;
		}
			if(root.value == i) {
				System.out.println("item is found");
			}else if(root.value <= i) {
				searchBinarySearchTree(root.right, i);
			}else {
				searchBinarySearchTree(root.left, i);
			}
				
			
		}
		
	}


