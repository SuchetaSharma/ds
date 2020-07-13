package Treeesgraphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import node.ShortestPathNode;
import node.ShortestPathNode;

//does not work for weighted graph
//O(E) - time
// O(E) - space 
//As we do not have any disjoint nodes
public class ShortestpathBFS {

	public static void main(String[] args) {
		List<ShortestPathNode> bFSLinkedList = new ArrayList<ShortestPathNode>();
		ShortestPathNode nodeA = new ShortestPathNode(10);
		ShortestPathNode nodeB = new ShortestPathNode(20);
		ShortestPathNode nodeC = new ShortestPathNode(30);
		ShortestPathNode nodeD = new ShortestPathNode(40);
		ShortestPathNode nodeE = new ShortestPathNode(50);
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
		breadthFirstSearchShortestpath(bFSLinkedList, arr);

	}
	private static void breadthFirstSearchShortestpath(List bFSLinkedList, int [][]arr) {
		Queue<ShortestPathNode> queue = new LinkedList<ShortestPathNode>();
		queue.add((ShortestPathNode)bFSLinkedList.get(0));
	
		while(!queue.isEmpty()) {
			ShortestPathNode node = queue.remove();
			node.setVisited(true);
			System.out.println("printing the path for node:"+node);
			if(node.getValue() == 40) {
			pritnPath(node);
			}
			for(ShortestPathNode neighbour : getNeighbours(node,bFSLinkedList,arr)) {
				if(!neighbour.isVisited()) {
				queue.add(neighbour);
			
				neighbour.setParent(node);
				
				//neighbour.setVisited(true);
				//System.out.println(neighbour.getVal());
				}
			}
		}
	}
	private static void pritnPath(ShortestPathNode node) {
		if(node.getParent() != null) {
			pritnPath(node.getParent());
		}
		System.out.println(node.getValue());
		
	}
	private static Collection<ShortestPathNode> getNeighbours(ShortestPathNode node, List bFSLinkedList, int [][]arr) {
		List<ShortestPathNode> neighbours = new ArrayList<ShortestPathNode>();
		int rowIndex = getRowIndex(node,bFSLinkedList);
		int[] row;
		if(rowIndex >=0) {
			row = arr[rowIndex];
			for(int i = 0; i< row.length; i++ ) {
				if(row[i] ==1) {
					neighbours.add((ShortestPathNode) bFSLinkedList.get(i));
					//System.out.println(neighbours.get(i).getVal());
				}
			}
		}else {
			return null;
		}
		
		return neighbours;
	}
	private static int getRowIndex(ShortestPathNode node, List bFSLinkedList) {
		for(int i = 0;i<bFSLinkedList.size();i++) {
			if(bFSLinkedList.get(i) == node) {
				return i;
			}
		}
		return -1;
	}
}
