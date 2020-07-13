package Treeesgraphs;

public class DeletiofromBinarySarchTree {

	//O(logn)
	public static void main(String[] args) {
		BinaryNode root = new BinaryNode(1,null, null);
		root.left = new BinaryNode(2, null, null);
		root.right = new BinaryNode(3, null, null);
		deletefromBinarySearchTree(root, 4);
	}

	private static void deletefromBinarySearchTree(BinaryNode root, int i) {
		if(root == null) {
			System.out.println("the tree is empty");
			return;
		}
		    //delete node with one child
			 if(root.value > i) {
				if(root.left != null) {
					if(root.left.value == i) {
						if(root.left.left == null && root.left.right == null ) {
							root.left = null;
							
						}
						else if(root.right == null){
							root.left = root;
						}else {
							//two child loop - find the successor of the node to be deleted. 
							//Successor is the least value on the right subtree.
							BinaryNode successorNode = findSuccrssor(root.left);
							//if successor is leaf node
							if(successorNode.left == null && successorNode.right == null) {
								root.left.value = successorNode.value;
								successorNode = null;
							}else {
								if(successorNode.right != null) {
									successorNode.right = root.left;
									root.left.value = successorNode.value;
									successorNode = null;
								}
							}
						}
					}	
					
				}else {
					deletefromBinarySearchTree(root.right, i);
				}
			}else {
				if(root.right.value == i) {
					if(root.right.right == null && root.right.right == null ) {
						root.right = null;
						
					}
					else if(root.left == null){
						root.right = root;
					}else {
						//two child loop - find the successor of the node to be deleted. 
						//Successor is the least value on the right subtree.
						BinaryNode successorNode = findSuccrssor(root.right);
						if(successorNode.left == null && successorNode.right == null) {
							root.right.value = successorNode.value;
							successorNode = null;
						}else {
							if(successorNode.right != null) {
								successorNode.right = root.left;
								root.right.value = successorNode.value;
								successorNode = null;
							}
						}

					}
				}
				
			}
				
			
		}

	private static BinaryNode findSuccrssor(BinaryNode left) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}


