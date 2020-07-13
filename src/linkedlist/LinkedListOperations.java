package linkedlist;

import node.SingleNode;

public class LinkedListOperations {
	SingleNode head = null;

	SingleNode node = null;
	int size = 0;

	void deletefromLinkedList(int loc) {

		SingleNode prevNode = getHead();
		if (prevNode != null) {
			if (loc == 0) {
				setHead(prevNode.getNext());

			} else {
				if (loc >= getSize())
					loc = getSize();

				for (int j = 0; j < loc - 1; j++) {
					prevNode = prevNode.getNext();
				}
				
				if (loc >= getSize())
					prevNode.setNext(null);
				else
					prevNode.setNext(prevNode.getNext().getNext());
			}

		} else {
			System.out.println("the list does not exist");
		}
		setSize(getSize() - 1);
	}

	void traverseLinkedList() {
		if (getHead() != null) {
			node = getHead();
			for (int i = 0; i < getSize(); i++) {
				System.out.println(node.getValue());
				node = node.getNext();
				// setSize(getSize() -1);
			}
		} else {
			System.out.println("the list does not exist!");
		}

	}

	void addtoLionkedList(int i, int loc) {
		SingleNode nodetobeInserted = new SingleNode();
		nodetobeInserted.setValue(i);
		SingleNode prevNode = getHead();
		if (prevNode != null) {
			if (loc == 0) {
				nodetobeInserted.setNext(prevNode.getNext());
				setHead(nodetobeInserted);
				head.setNext(nodetobeInserted);
				setSize(getSize() + 1);
			} else {
				if (loc >= getSize()) {
					loc = getSize();
				}
				for (int j = 0; j < loc - 1; j++) {
					prevNode = prevNode.getNext();
				}
				prevNode.setNext(nodetobeInserted);

				if (loc >= getSize()) {

					nodetobeInserted.setNext(null);
				}

				else {

					nodetobeInserted.setNext(prevNode.getNext().getNext());
				}

				setSize(getSize() + 1);
			}
		} else {
			System.out.println("the list does not exist");
		}
	}

	void createLinkedList(int i) {
		node = new SingleNode();
		node.setValue(i);
		node.setNext(null);
		head = node;
		setSize(1);
		setHead(head);

	}

	private void setSize(int size) {
		this.size = size;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getNode() {
		return node;
	}

	public void setNode(SingleNode node) {
		this.node = node;
	}

	public int getSize() {
		return size;
	}

}
