package grokkingcoding;

public class BinaryTree {
	 
	    Node root; 
	    /* This is the core function to convert Tree to list. This function 
	       follows steps 1 and 2 of the above algorithm */
	    /*
	     * 1. If left subtree exists, process the left subtree
…..1.a) Recursively convert the left subtree to DLL.
…..1.b) Then find inorder predecessor of root in left subtree (inorder predecessor is rightmost node in left subtree).
…..1.c) Make inorder predecessor as previous of root and root as next of inorder predecessor.
2. If right subtree exists, process the right subtree (Below 3 steps are similar to left subtree).
…..2.a) Recursively convert the right subtree to DLL.
…..2.b) Then find inorder successor of root in right subtree (inorder successor is leftmost node in right subtree).
…..2.c) Make inorder successor as next of root and root as previous of inorder successor.
3. Find the leftmost node and return it (the leftmost node is always head of converted DLL).
	     */
	   
	    Node bintree2listUtil(Node node)  
	    { 
	        // Base case 
	        if (node == null) 
	            return node; 
	   
	        // Convert the left subtree and link to root 
	        if (node.left != null)  
	        { 
	            // Convert the left subtree 
	            Node left = bintree2listUtil(node.left); 
	   
	            // Find inorder predecessor. After this loop, left 
	            // will point to the inorder predecessor 
	            for (; left.right != null; left = left.right); 
	   
	            // Make root as next of the predecessor 
	            left.right = node; 
	   
	            // Make predecssor as previous of root 
	            node.left = left; 
	        } 
	   
	        // Convert the right subtree and link to root 
	        if (node.right != null)  
	        { 
	            // Convert the right subtree 
	            Node right = bintree2listUtil(node.right); 
	   
	            // Find inorder successor. After this loop, right 
	            // will point to the inorder successor 
	            for (; right.left != null; right = right.left); 
	   
	            // Make root as previous of successor 
	            right.left = node; 
	   
	            // Make successor as next of root 
	            node.right = right; 
	        } 
	   
	        return node; 
	    } 
	   
	    // The main function that first calls bintree2listUtil(), then follows 
	    // step 3 of the above algorithm 
	       
	    Node bintree2list(Node node)  
	    { 
	        // Base case 
	        if (node == null) 
	            return node; 
	   
	        // Convert to DLL using bintree2listUtil() 
	        node = bintree2listUtil(node); 
	   
	        // bintree2listUtil() returns root node of the converted 
	        // DLL.  We need pointer to the leftmost node which is 
	        // head of the constructed DLL, so move to the leftmost node 
	        while (node.left != null) 
	            node = node.left; 
	   
	        return node; 
	    } 
	   
	    /* Function to print nodes in a given doubly linked list */
	    void printList(Node node)  
	    { 
	        while (node != null)  
	        { 
	            System.out.print(node.data + " "); 
	            node = node.right; 
	        } 
	    } 
}
