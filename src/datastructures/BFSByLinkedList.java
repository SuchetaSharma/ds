package datastructures;
import java.util.*;
import node.*;

public class BFSByLinkedList {
	
	
	
	private List<BFSNode> bFSByLinkedList;
	private int[][] arr;
	private Queue<BFSNode> queue;

	public BFSByLinkedList(List<BFSNode> bFSByLinkedList, int[][] arr) {
		// TODO Auto-generated constructor stub
		this.bFSByLinkedList = bFSByLinkedList;
		this.arr = arr;
		queue = new LinkedList<BFSNode>();
	}

	public void bFSAlgorithm(BFSNode node) {
		queue.add(node);
		
		while (!queue.isEmpty()) {
			BFSNode element = queue.remove();
			element.setVisited(true);
			System.out.println("element is: " + element.getVal());
			for (BFSNode neighbour: getNeighbours(element, arr)) {
				if(!neighbour.isVisited()) {
					queue.add(neighbour);
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
		if(index >=0) {
			row = arr[index];
			for(int i=0; i<row.length;i++) {
				if (row[i] == 1) {
					neighbours.add(bFSByLinkedList.get(i));
				}
			}
		}else {
			System.out.println("The node is not present in the graph");
			return null;
		}
		return neighbours;
	}

	private int nodeIndex(BFSNode element) {
		for (int i=0;i<bFSByLinkedList.size();i++) {
			if(element == bFSByLinkedList.get(i)) {
				return i;
			}
		}
		return -1;
	}
	

}
