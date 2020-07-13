package linkedlist;

import elevenessential.Node;

public class ListIntersection {
	//kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list,
	//then they are intersecting.
	//intersecting linked list always have same last node
	public static void main(String[] args) {
		Node node = new Node(1,null);
		node = new Node(2,node);
		node = new Node(3,node);
		node = new Node(4,node);
		node = new Node(9,node);
		node = new Node(11,node);
		
		Node node1 = new Node(7,null);
		node1 = new Node(2,node1);
		node1 = new Node(12,node1);
		node1 = new Node(13,node1);
		node1 = new Node(14,node1);	
		node1 = new Node(15,node1);
		node1 = new Node(16,node1);
		Node intersectNode = identifyIntersectNode(node, node1);
		if(node != null)
		System.out.println(intersectNode.getVal());
		else
			System.out.println("the linked list are not intersecting");

	}

	private static Node identifyIntersectNode(Node node1, Node node2) {
		Result result1 = getLengthandLastNode(node1);
		Result result2 = getLengthandLastNode(node2);
		
		//if different tail nodes, not intersecting
		if(result1.getNode() != result2.getNode()) return null;
		Node longer = result1.getSize() > result2.getSize()? node1: node2;
		Node shorter = result2.getSize() > result1.getSize()? node2: node1;
		
		//advance the pointer of the longer by the difference in length
		longer = getKthNode(longer, Math.abs(result1.getSize() - result2.getSize()));
		while(shorter != longer) {
			shorter = shorter.getNext();
			longer = longer.getNext();
		}
		//return wither shortr or longer
		return longer;
	}
	
	private static Node getKthNode(Node longer, int i) {
		while(i > 0 && longer != null) {
			longer = longer.getNext();
			i --;
		}
		return longer;
	}

	private static Result getLengthandLastNode(Node node1) {
		int length = 0;
		while(node1 != null) {
			length ++;
			node1 = node1.getNext();
		}
		System.out.println("size of node1" + length);
		
		return new Result(length, node1);
	}

}
