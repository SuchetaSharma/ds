package node;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode> {
private String name;
private int distance;
private boolean isVisited;
private WeightedNode parent;
private ArrayList<WeightedNode> neighbors = new ArrayList<WeightedNode>();

public void setNeighbors(ArrayList<WeightedNode> neighbors) {
	this.neighbors = neighbors;
}
private HashMap<WeightedNode, Integer> weightMap = new HashMap<>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public boolean isVisited() {
	return isVisited;
}
public void setVisited(boolean isVisited) {
	this.isVisited = isVisited;
}
public WeightedNode getParent() {
	return parent;
}
public void setParent(WeightedNode parent) {
	this.parent = parent;
}
public WeightedNode(String name) {
	this.name = name;
	this.distance = Integer.MAX_VALUE;
}
public ArrayList<WeightedNode> getNeighbors() {
	// TODO Auto-generated method stub
	return neighbors;
}
public HashMap<WeightedNode, Integer> getWeightMap() {
	return weightMap;
}
public void setWeightMap(HashMap<WeightedNode, Integer> weightMap) {
	this.weightMap = weightMap;
}
@Override
public String toString() {
	return name;
}

@Override
public int compareTo(WeightedNode o) {
	return this.distance - o.distance;
}

}
