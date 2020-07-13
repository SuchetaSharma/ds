package Treeesgraphs;

import java.util.ArrayList;
import java.util.List;

public class FindCommonAncestor {
	private List<Integer> path1 = new ArrayList<>(); 
    private List<Integer> path2 = new ArrayList<>(); 
	public BinaryNode findCommonAncestor(BinaryNode root, int p, int q) {
		if(root == null) {
			return null;
		}
		// If either n1 or n2 matches with root's key, report 
        // the presence by returning root (Note that if a key is 
        // ancestor of other, then the ancestor key becomes LCA 
		if(root.value == p || root.value == q) {
			return root;
		}
		// Look for keys in left and right subtrees 
		BinaryNode left_lca = findCommonAncestor(root.left, p, q);
		BinaryNode right_lca = findCommonAncestor(root.right, p, q);
		if(left_lca != null & right_lca != null) {
			return root;
		}
		return (left_lca != null? left_lca:right_lca);	
		
	}
	
	
}
