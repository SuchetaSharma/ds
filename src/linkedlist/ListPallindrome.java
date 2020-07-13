package linkedlist;

import elevenessential.Node;

public class ListPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1,null);
		
			node = new Node(2,node);
			node = new Node(3,node);
			node = new Node(2,node);
			node = new Node(1,node);
			node = new Node(3,node);
		
		boolean blnFlag = identifyifLinkedListisPallindrome(node);
		System.out.println(blnFlag);
	}

	private static boolean identifyifLinkedListisPallindrome(Node node) {
		int length = 0;
		int [] arr = new int[10];
		int count = 0;
		while(node != null) {
			//System.out.println(node.getVal());
			arr[node.getVal()]++;
			length +=1;
			node = node.getNext();
		}
		if(length%2 == 0) {
			for(int i=0;i<arr.length; i++) {
				if(arr[i]%2 != 0) {
					return false;
				}
			}
		
	}else {
		for(int i=0;i<arr.length; i++) {
			if(arr[i]%2 != 0) {
				count++;
			}
		}
		if(count >1) {
			return false;
		}
		
	}
		return true;

}
}