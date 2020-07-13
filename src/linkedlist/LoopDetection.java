package linkedlist;

import elevenessential.Node;

public class LoopDetection {

	public static void main(String[] args) {
		//Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
		//Input: A -> B -> C -> D -> E -> C
		//Output: C
		Node node = new Node(1, null);
		node = new Node(2,node);
		node = new Node(3,node);
		node = new Node(4,node);
		node = new Node(2,node);
		node = new Node(7,node);
		Node detectedNode = identifyCircularNode(node);
		if(detectedNode != null)
		{
			System.out.println(detectedNode.getVal());
		}else {
			System.out.println("there is no detected loop");
		}

	}

	private static Node identifyCircularNode(Node head) {
	Node slow = head;
	Node fast = head;
	//Find meeting point. This will be LOOP_SIZE - k steps into the linked list.
	while(fast != null && fast.getNext() != null) {
		slow = slow.getNext();
		fast = fast.getNext().getNext();
		if(slow == fast) {
			break;
		}
	}
		//no colliding point
	if(fast == null || fast.getNext() == null) {
		return null;
	}
	//Move slow to Head. Keep fast at Meeting Point. Each are k(K is non-looped part), steps from the
	//Loop Start. If they move at the same pace, they must meet at Loop Start
	slow = head;
	while(slow != fast) {
		slow = slow.getNext();
		fast = fast.getNext();
	}
		//both now point to the start of the loop
		return fast;
	}

}
