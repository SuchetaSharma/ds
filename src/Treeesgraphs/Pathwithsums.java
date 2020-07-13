package Treeesgraphs;

import java.util.Vector;

public class Pathwithsums {
/*
 * The basic idea to solve the problem is to do a preorder traversal of the given tree. We also need a container (vector) to keep track of the path that led to that node.
 * At each node we check if there are any path that sums to k, if any we print the path and proceed recursively to print each path.
 */
	// This function prints all paths that have sum k.
	public void findPathwithsums(BinaryNode root, int k, Vector<Integer> path) {
		
		if(root == null) {
			return;
		}
		path.add(root.value);
		
		//check if there's any k sum path in the left sub-tree.
		findPathwithsums(root.left, k, path);
		
		//check if there's any k sum path in the right sub-tree.
				findPathwithsums(root.right, k, path);
		
				// check if there's any k sum path  
			    // in the right sub-tree.  
				findPathwithsums(root.right, k, path);  
			  
			    // check if there's any k sum path that  
			    // terminates at this node  
			    // Traverse the entire path as  
			    // there can be negative elements too  
			    int f = 0;  
			    for (int j = path.size() - 1; j >= 0; j--)  
			    {  
			        f += path.get(j);  
			  
			        // If path sum is k, print the path  
			        if (f == k)  {
			            printVector(path, j);  
			        f=0;
			        }
			    }  
			  
			    // Remove the current element from the path  
			    path.remove(path.size() - 1);  
			    
	}

	//utility to print vector from index i till it's end.
	public void printVector( Vector<Integer> v, int i)  {
		
		for(int j=i; j< v.size(); j++) {
			System.out.println(v.get(j) + "");
		}
}

}
