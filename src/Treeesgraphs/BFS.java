package Treeesgraphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import datastructures.BFSByLinkedList;
import node.BFSNode;

public class BFS {

	public static void main(String[] args) {
		List<BFSNode> bFSLinkedList = new ArrayList<BFSNode>();
		BFSNode nodeA = new BFSNode(10);
		BFSNode nodeB = new BFSNode(20);
		BFSNode nodeC = new BFSNode(30);
		BFSNode nodeD = new BFSNode(40);
		BFSNode nodeE = new BFSNode(50);
		bFSLinkedList.add(nodeA);
		bFSLinkedList.add(nodeB);
		bFSLinkedList.add(nodeC);
		bFSLinkedList.add(nodeD);
		bFSLinkedList.add(nodeE);
		
		int [][] arr = {
				{0,1,1,0,0},//A
				{1,0,0,1,1},//B
				{1,0,0,0,0},//C
				{0,1,0,0,0},//D
				{0,1,0,0,0}//E
		};
		breadthFirstSearch(bFSLinkedList, arr);

	}
	private static void breadthFirstSearch(List bFSLinkedList, int [][]arr) {
		Queue<BFSNode> queue = new LinkedList<BFSNode>();
		queue.add((BFSNode)bFSLinkedList.get(0));
	
		while(!queue.isEmpty()) {
			BFSNode node = queue.remove();
			node.setVisited(true);
			System.out.println(node.getVal());
			for(BFSNode neighbour : getNeighbours(node,bFSLinkedList,arr)) {
				if(!neighbour.isVisited()) {
				queue.add(neighbour);
				//neighbour.setVisited(true);
				//System.out.println(neighbour.getVal());
				}
			}
		}
	}
	private static Collection<BFSNode> getNeighbours(BFSNode node, List bFSLinkedList, int [][]arr) {
		List<BFSNode> neighbours = new ArrayList<BFSNode>();
		int rowIndex = getRowIndex(node,bFSLinkedList);
		int[] row;
		if(rowIndex >=0) {
			row = arr[rowIndex];
			for(int i = 0; i< row.length; i++ ) {
				if(row[i] ==1) {
					neighbours.add((BFSNode) bFSLinkedList.get(i));
					//System.out.println(neighbours.get(i).getVal());
				}
			}
		}else {
			return null;
		}
		
		return neighbours;
	}
	private static int getRowIndex(BFSNode node, List bFSLinkedList) {
		for(int i = 0;i<bFSLinkedList.size();i++) {
			if(bFSLinkedList.get(i) == node) {
				return i;
			}
		}
		return -1;
	}

}
