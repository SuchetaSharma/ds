package elevenessential;

public class Node {
private int val;
private Node next;
private boolean identifier;

public Node(int i, Object object) {
	this.next = (Node)object;
	this.val = i;
}
public int getVal() {
	return val;
}
public void setVal(int val) {
	this.val = val;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
public boolean isIdentifier() {
	return identifier;
}
public void setIdentifier(boolean identifier) {
	this.identifier = identifier;
}

}
