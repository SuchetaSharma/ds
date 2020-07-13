package linkedlist;

import node.SingleNode;

public class LinkedListOperationsMain {
	
	public static void main(String[] args) {
		//operations on linked list
		LinkedListOperations listOperations = new LinkedListOperations();
		listOperations.createLinkedList(2);
		listOperations.addtoLionkedList(3,2);
		listOperations.addtoLionkedList(4,3);
		listOperations.addtoLionkedList(5,4);
		listOperations.addtoLionkedList(6,5);
		listOperations.addtoLionkedList(7,6);
		listOperations.addtoLionkedList(8,6);
		listOperations.addtoLionkedList(9,7);
		listOperations.traverseLinkedList();
		listOperations.deletefromLinkedList(2);
		System.out.println("------------");
		listOperations.traverseLinkedList();
		listOperations.deletefromLinkedList(8);
		System.out.println("------------");
		listOperations.traverseLinkedList();
	}

}
