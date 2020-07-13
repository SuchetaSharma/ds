package Treeesgraphs;

import java.util.Vector;

public class PathwithsumsMain {

	public static void main(String[] args) {
		BinaryNode root = new BinaryNode(1, null, null);  
	    root.left = new BinaryNode(3, null, null);  
	    root.left.left = new BinaryNode(2, null, null);  
	    root.left.right = new BinaryNode(1, null, null);  
	    root.left.right.left = new BinaryNode(1, null, null);  
	    root.right = new BinaryNode(-1, null, null);  
	    root.right.left = new BinaryNode(4, null, null);  
	    root.right.left.left = new BinaryNode(1, null, null);  
	    root.right.left.right = new BinaryNode(2, null, null);  
	    root.right.right = new BinaryNode(5, null, null);  
	    root.right.right.right = new BinaryNode(2, null, null);  
	  
	   
		
		Pathwithsums pathwithSums = new Pathwithsums();
		Vector<Integer> path = new Vector<Integer>(); 
		pathwithSums.findPathwithsums(root, 5, path );
	}

}
