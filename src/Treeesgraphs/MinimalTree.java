package Treeesgraphs;

public class MinimalTree {

	public static void main(String[] args) {
		//Given a sorted (increasing order) array with unique integer elements, 
		//write an algorithm to create a binary search tree with minimal height.
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		//we can cut out the extra traversals by recursively using the createMinimalBST method. 
		//This method is passed just a subsection of the array and returns the root of a minimal tree for that array.
		int start = 0;
		int end = arr.length - 1;
		createMinimalBST(arr, start, arr.length - 1);
	}
private static BinaryNode createMinimalBST(int[] arr, int start, int end) {
		if(end < start) {
		//System.out.println("the tree cannot be created");
		return null;
	}
	int mid = (start + end)/2;
	BinaryNode root = new BinaryNode(arr[mid], null, null);
	root.left = createMinimalBST(arr, start, mid - 1);
    root.right = createMinimalBST(arr, mid + 1, end);
	return root;
}

}
