package datastructures;

import java.util.*;
import node.*;

public class DFSByLinkedList {

	private List<BFSNode> dFSByLinkedList;
	private int[][] arr;
	private Stack<BFSNode> stack;

	public DFSByLinkedList(List<BFSNode> dFSByLinkedList, int[][] arr) {
		// TODO Auto-generated constructor stub
		this.dFSByLinkedList = dFSByLinkedList;
		this.arr = arr;
		stack = new Stack<BFSNode>();
	}

	public void dFSAlgorithm(BFSNode node) {
		stack.add(node);

		while (!stack.isEmpty()) {
			BFSNode element = stack.pop();
			element.setVisited(true);
			System.out.println("element is: " + element.getVal());
			for (BFSNode neighbour : getNeighbours(element, arr)) {
				if (!neighbour.isVisited()) {
					stack.add(neighbour);
					neighbour.setVisited(true);
					System.out.println("element is" + neighbour.getVal());
				}
			}
		}
	}

	private Collection<BFSNode> getNeighbours(BFSNode element, int[][] arr2) {
		int index = nodeIndex(element);
		List<BFSNode> neighbours = new ArrayList<BFSNode>();
		int[] row;
		if (index >= 0) {
			row = arr[index];
			for (int i = 0; i < row.length; i++) {
				if (row[i] == 1) {
					neighbours.add(dFSByLinkedList.get(i));
				}
			}
		} else {
			System.out.println("The node is not present in the graph");
			return null;
		}
		return neighbours;
	}

	private int nodeIndex(BFSNode element) {
		for (int i = 0; i < dFSByLinkedList.size(); i++) {
			if (element == dFSByLinkedList.get(i)) {
				return i;
			}
		}
		return -1;
	}

}
