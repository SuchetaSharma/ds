package linkedlist;

import elevenessential.Node;

public class LinkedListPartition {

	public static void main(String[] args) {
		Node node = new Node(2,null);
		
		for(int i = 2; i<5; i++){
			node = new Node(i,node);
		}
		for(int i = 5; i<10; i++){
			node = new Node(i,node);
		}
		
		Node head = node;
		Node current = head;
		while(current != null) {
			System.out.println(current.getVal());
			current = current.getNext();
		}
		System.out.println("-----------------");
		Node partitionNode = partitionLinkedList(node, 5);
		while(partitionNode != null) {
			System.out.println(partitionNode.getVal());
			partitionNode = partitionNode.getNext();
		}
	}
	
//create two list, one with elements less than x and another with elements grater tha x. Then merge them/
	private static Node partitionLinkedList(Node node, int x) {
		Node beforeStart = null;
		Node afterStart = null;
		Node beforeEnd = null;
		Node afterEnd = null;
		while(node != null){
		Node next = node.getNext();
		node.setNext(null);
		if(node.getVal() < x) {
			if(beforeStart == null) {
			beforeStart = node;
			beforeEnd = beforeStart;
			
			}else {
				beforeEnd.setNext(node);
				beforeEnd = node;
			}
			
		}else {

			if(afterStart == null) {
				afterStart = node;
				afterEnd = afterStart;
				
			}else {
				afterEnd.setNext(node);
				afterEnd = node;
			}
			
		
		}
		node = next;
		}
		if(beforeStart == null) {
			return afterStart;
		}
		beforeEnd.setNext(afterStart);
		return beforeStart;
	}

	//build a new list, elements bigger than X will be placed in tail else on head
	private static Node partitionLinkedListAnother(Node node, int x) {
		
		Node head = node;
		Node tail = node;
		while(node != null) {
			Node next = node.getNext();
			if(node.getVal() < x) {
				node.setNext(head);
				head = node;
				
			}else {
				tail.setNext(node);
				tail = node;
			}
			node = next;
		}
		tail.setNext(null);
		return head;
	}
	
}
