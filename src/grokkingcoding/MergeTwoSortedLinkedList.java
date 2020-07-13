package grokkingcoding;

import node.SingleNode;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		// Given two sorted linked lists, merge them so that the resulting linked list is also sorted.
		
		SingleNode node1 = new SingleNode();
		node1.setValue(1);
		SingleNode node2 = new SingleNode();
		node2.setValue(7);
		node1.setNext(node2);
		SingleNode node3 = new SingleNode();
		node3.setValue(9);
		node2.setNext(node3);
		node3.setNext(null);
		
		SingleNode node4 = new SingleNode();
		node4.setValue(3);
		SingleNode node5 = new SingleNode();
		node5.setValue(4);
		node4.setNext(node5);
		SingleNode node6 = new SingleNode();
		node6.setValue(7);
		node5.setNext(node6);
		node6.setNext(null);
		
		mergeNumbers(node1, node4);

	}

	private static void mergeNumbers(SingleNode node1, SingleNode node2) {

		
		SingleNode mergedList = new SingleNode();
		if(node1.getValue() > node2.getValue()) {
			mergedList = node2;
			node2 = node2.getNext();
		}else {
			mergedList = node1;
			node1 = node1.getNext();
		}
		while(node1 != null && node2 != null ) {
			SingleNode temp = new SingleNode();
			if(node1.getValue() > node2.getValue()) {
				temp = node2;
				node2 = node2.getNext();
			}else {
				temp = node1;
				node1 = node1.getNext();
			}
			mergedList.setNext(temp);
			
		}
		if(node1 != null) {
			
			mergedList.setNext(node1);
			//node1 = node1.getNext();
		}
		
		if(node2 != null) {
			
			mergedList.setNext(node2);
			//node2 = node2.getNext();
		}
while(mergedList.getNext() != null) {
	System.out.println(mergedList.getValue());
	mergedList = mergedList.getNext();
}
	
	}
}
