package grokkingcoding;

import java.util.List;

public class ConvertBinTreetoDoubleLinkedList {

	public static void main(String[] args) {
		//binarytree class
		BinaryTree tree = new BinaryTree(); 
		   
        // Let us create the tree shown in above diagram 
        tree.root = new Node(10); 
        tree.root.left = new Node(12); 
        tree.root.right = new Node(15); 
        tree.root.left.left = new Node(25); 
        tree.root.left.right = new Node(30); 
        tree.root.right.left = new Node(36); 
   
        // Convert to DLL 
        Node head = tree.bintree2list(tree.root); 
   
        // Print the converted list 
        tree.printList(head); 
	}
	

}
