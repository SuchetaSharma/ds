package Treeesgraphs;

public class InsertintoBinarySarchTree {

	//O(logn)
	public static void main(String[] args) {
		BinaryNode root = new BinaryNode(1,null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		insertBinarySearchTree(root, 4);
	}

	private static void insertBinarySearchTree(BinaryNode root, int i) {
		if(root == null) {
			System.out.println("the tree is empty");
			return;
		}
			 if(root.value > i) {
				if(root.left == null) {
					System.out.println("node inserted in left");
						root.left = new BinaryNode(i, null, null);
					
				}else {
				insertBinarySearchTree(root.left, i);
				}
			}else {
				if(root.right == null) {
					System.out.println("node inserted in right");
					root.right = new BinaryNode(i, null, null);
				
			}else {
			insertBinarySearchTree(root.right, i);
			}
		}
				
			
		}
		
	}


