package Treeesgraphs;

public class FindSuccessor {
	int index = 0;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public  int[] findSuccessor(BinaryNode root, int [] arr) {
		//inorder
		if (root == null) {
			return null;
		}
		findSuccessor(root.left, arr);
		
		
		arr[getIndex()] = root.value;
		setIndex(getIndex()+1);
		findSuccessor(root.right, arr);
		
		return arr;
	}
}
