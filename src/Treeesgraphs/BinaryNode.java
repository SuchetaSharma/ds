package Treeesgraphs;

import java.util.LinkedList;

public class BinaryNode {
	boolean isVisited = false;
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	public BinaryNode(int value, BinaryNode left, BinaryNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
		
	}
	public int value;
	public BinaryNode left;
	public BinaryNode right;
	public LinkedList<BinaryNode> neighbours = new LinkedList();
	public LinkedList<BinaryNode> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(LinkedList<BinaryNode> neighbours) {
		this.neighbours = neighbours;
	}

}
