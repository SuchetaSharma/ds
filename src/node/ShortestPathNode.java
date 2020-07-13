package node;

public class ShortestPathNode {
private int value;
private ShortestPathNode parent;
private boolean isVisited;
public ShortestPathNode(int i) {
	this.value = i;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public ShortestPathNode getParent() {
	return parent;
}
public void setParent(ShortestPathNode parent) {
	this.parent = parent;
}
public boolean isVisited() {
	return isVisited;
}
public void setVisited(boolean isVisited) {
	this.isVisited = isVisited;
}

}
