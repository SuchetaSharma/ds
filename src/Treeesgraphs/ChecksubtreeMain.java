package Treeesgraphs;

public class ChecksubtreeMain {

	public static void main(String[] args) {
		/*
		 * Tl and T2 are two very large binary trees, withTl much bigger thanT2. 
		 * Create an algorithm to determine ifT2 is a subtree ofTl.
		 */
		/*
		 * comparing string representations of traversals of each tree.
		 */
		BinaryNode T1Node = new BinaryNode(1, null, null);
		T1Node.left = new BinaryNode(2, null, null);
		T1Node.right = new BinaryNode(3, null, null);
		T1Node.left.left = new BinaryNode(4, null, null);
		T1Node.right.right = new BinaryNode(5, null, null);
		
		BinaryNode T2Node = new BinaryNode(4, null, null);
		T2Node.left = new BinaryNode(5, null, null);
/*A binary search tree's in-order traversal always prints out the values in sorted order.
 * Therefore, two binary search trees with the same values will always have the same in-order traversals.
 * even if their structure is different.
 * 
 */
/*
 *  lf T2's pre-order traversal is a substring ofTl's pre-order traversal, then T2's root element must be found inTl.
 *  If we do a pre-order traversal from this element in Tl, we will follow
an identical path toT2's traversal. Therefore,T2 is a subtree of Tl.
 */
		/*
		 * as long as we represent the NULL nodes, the pre-order traversal of a tree is unique.
		 */

		Checksubtree checkSubtree = new Checksubtree();
		boolean blnFlag = checkSubtree.containsSubtree(T1Node, T2Node);
		System.out.println(blnFlag);
	}

}
