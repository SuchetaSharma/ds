package linkedlist;

import elevenessential.Node;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(2, null);
		boolean blnFlag = deleteMiddleNode(node);
		System.out.println("blnFlag"+blnFlag);

	}

	private static boolean deleteMiddleNode(Node node) {
		if(null == node) {
			return false;
		}
		int count = 0;
		Node nextNode = node;
		while(nextNode != null) {
			count ++;
		}
		int nodetobedeleted = 0;
		if(count%2 == 0) {
			nodetobedeleted = count/2;
		}else {
			nodetobedeleted = (count+1)/2;
		}
		for(int i=0; i< nodetobedeleted - 1; i++) {
			node = node.getNext();
		}
		node.setNext(node.getNext().getNext());
		
		return true;
	}
	//no access to linked list, any node but the first and the last node
	private static boolean deleteMiddleNodeAnother(Node node) {
		if(null == node || node.getNext() == null) {
			return false;
		}
		Node next = node.getNext();
		node.setNext(next.getNext());
		
		return true;
	}

}
