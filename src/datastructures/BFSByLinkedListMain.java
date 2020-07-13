package datastructures;

import java.util.ArrayList;
import java.util.List;

import node.BFSNode;

public class BFSByLinkedListMain {

	public static void main(String[] args) {
		List<BFSNode> bFSLinkedList = new ArrayList<BFSNode>();
		
BFSNode node = new BFSNode(20);
		bFSLinkedList.add(new BFSNode(10)); 
		bFSLinkedList.add(node);
		bFSLinkedList.add(new BFSNode(30));
		bFSLinkedList.add(new BFSNode(40));
		bFSLinkedList.add(new BFSNode(50));
		int[][] arr = { { 0, 1, 1, 0, 0 }, //node10
				{ 0, 0, 1, 1, 1 }, //node20
				{ 0, 1, 1, 0, 1 }, //node30
				{ 0, 1, 1, 0, 0 }, //node40
				{ 0, 1, 0, 1, 0 } //node50
				};
		BFSByLinkedList bFSByLinkedList = new BFSByLinkedList(bFSLinkedList, arr);
		bFSByLinkedList.bFSAlgorithm(node);
	}

}
