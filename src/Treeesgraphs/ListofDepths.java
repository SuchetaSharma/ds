package Treeesgraphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import node.BFSNode;

public class ListofDepths {

	public static void main(String[] args) {
		//Given a binary tree.
		//design an algorithm which creates a linked list of all the nodes at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).

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
		listofDepths(bFSLinkedList, arr);

	
		
	}

	private static void listofDepths(List<BFSNode> bFSLinkedList, int[][] arr) {
		LinkedList<LinkedList<BFSNode>> levelList = new LinkedList<LinkedList<BFSNode>>();
		Queue<BFSNode> queue = new LinkedList<BFSNode>();
		
		LinkedList<BFSNode> currentlevelList = new LinkedList<BFSNode>();
		BFSNode rootlevel = bFSLinkedList.get(0);
		currentlevelList.add(rootlevel);
		queue.add(rootlevel);
		while(!queue.isEmpty()) {
			BFSNode element = queue.remove();
			element.setVisited(true);
			for(BFSNode neighbour : getNeighbours(element,bFSLinkedList, arr)) {
				if(!neighbour.isVisited()) {
					queue.add(neighbour);
					neighbour.setVisited(true);
					int index = getRowIndex(element,bFSLinkedList);
					if (index != -1) {
					currentlevelList.add(index, neighbour);
					} 
					
				}
			}
			levelList.add(currentlevelList);
		}
		for(LinkedList<BFSNode> list :levelList ) {
			for(int i =0; i<list.size(); i++) {
				System.out.println(list.get(i).getVal());
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
