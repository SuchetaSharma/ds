package node;

public class BFSNode {
private boolean isVisited = false;
private int val = 0;

public BFSNode(int val) {
	this.val = val;
}

public boolean isVisited() {
	return isVisited;
}

public void setVisited(boolean isVisited) {
	this.isVisited = isVisited;
}

public int getVal() {
	return val;
}

public void setVal(int val) {
	this.val = val;
}

}
