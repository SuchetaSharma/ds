package grokkingcoding;

import node.SingleNode;

public class AddingNumbersinLinkedList {

	public static void main(String[] args) {
		// Given the head pointers of two linked lists where each linked list represents an integer number (each node is a digit), 
		//add them and return the resulting linked list.
		
		SingleNode node1 = new SingleNode();
		node1.setValue(6);
		SingleNode node2 = new SingleNode();
		node2.setValue(7);
		node1.setNext(node2);
		SingleNode node3 = new SingleNode();
		node3.setValue(9);
		node2.setNext(node3);
		node3.setNext(null);
		
		SingleNode node4 = new SingleNode();
		node4.setValue(6);
		SingleNode node5 = new SingleNode();
		node5.setValue(7);
		node4.setNext(node5);
		SingleNode node6 = new SingleNode();
		node6.setValue(9);
		node5.setNext(node6);
		node6.setNext(null);
		
		addNumbers(node1, node4);
	}
	private static void addNumbers(SingleNode node1, SingleNode node2) {
		int carry = 0;
		
		
		int sum = 0;
		SingleNode nodesum = new SingleNode();
		
		SingleNode mergedList = new SingleNode();
		SingleNode nextNode = new SingleNode();
		sum = node1.getValue() + node2.getValue() + carry;
		carry = sum / 10;
		nextNode.setValue(sum % 10);
		mergedList = nextNode;
		while(node1 != null || node2 != null ) {
			SingleNode temp = new SingleNode();
			sum = node1.getValue() + node2.getValue() + carry;
			carry = sum / 10;
			temp.setValue(sum % 10);
			mergedList.setNext(temp);
			node1 = node1.getNext();
			node2 = node2.getNext();
			
		}
		while(node1 != null) {
			
			nodesum.setNext(node1);
			node1 = node1.getNext();
		}
		
		while(node2 != null) {
			
			nodesum.setNext(node2);
			node2 = node2.getNext();
		}
while(mergedList.getNext() != null) {
	System.out.println(mergedList.getValue());
	mergedList = mergedList.getNext();
}
	}

}
