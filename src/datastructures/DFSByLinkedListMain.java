package datastructures;

import java.util.ArrayList;
import java.util.List;

import node.BFSNode;

public class DFSByLinkedListMain {

	public static void main(String[] args) {
		List<BFSNode> dFSLinkedList = new ArrayList<BFSNode>();

		BFSNode node = new BFSNode(20);
		dFSLinkedList.add(new BFSNode(10));
		dFSLinkedList.add(node);
		dFSLinkedList.add(new BFSNode(30));
		dFSLinkedList.add(new BFSNode(40));
		dFSLinkedList.add(new BFSNode(50));
		int[][] arr = { { 0, 1, 1, 0, 0 }, // node10
				{ 0, 0, 1, 1, 1 }, // node20
				{ 0, 1, 1, 0, 1 }, // node30
				{ 0, 1, 1, 0, 0 }, // node40
				{ 0, 1, 0, 1, 0 } // node50
		};
		DFSByLinkedList dFSByLinkedList = new DFSByLinkedList(dFSLinkedList, arr);
		dFSByLinkedList.dFSAlgorithm(node);
	}

}
