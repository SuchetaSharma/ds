package linkedlist;

import elevenessential.Node;

public class Result {
	private int size;
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	private Node node;
	public Result(int size, Node node) {
		this.size = size;
		this.node = node;
	}

}
