package Treeesgraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class BellmonNode implements Comparable<BellmonNode>{

	private boolean isVisited;
	private int distance;
	private String name;
	private ArrayList<BellmonNode>neighbours = new ArrayList<BellmonNode>();
	private HashMap<BellmonNode, Integer> weightedMap = new HashMap<BellmonNode, Integer> ();
	private BellmonNode parent;
	
	public BellmonNode getParent() {
		return parent;
	}
	public void setParent(BellmonNode parent) {
		this.parent = parent;
	}
	public ArrayList<BellmonNode> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(ArrayList<BellmonNode> neighbours) {
		this.neighbours = neighbours;
	}
	public HashMap<BellmonNode, Integer> getWeightedMap() {
		return weightedMap;
	}
	public void setWeightedMap(HashMap<BellmonNode, Integer> weightedMap) {
		this.weightedMap = weightedMap;
	}
	BellmonNode(String name){
		this.name = name;
		this.distance = Integer.MAX_VALUE;
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(BellmonNode o) {
		return this.getDistance() - o.getDistance();
	}
}
