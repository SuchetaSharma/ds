package datastructures;

import node.SingleNode;

public class CircularLinkedList {



	private SingleNode head;
	private SingleNode tail;
	private int size = 0;

	// create
	public SingleNode createSimpleLinkedList(int nodeVal) {
		SingleNode node = new SingleNode();

		node.setNext(null);
		node.setValue(nodeVal);
		setHead(node);
		setTail(node);
		setSize(getSize() + 1);
		traverseSimpleLinkedList();
		return getHead();

	}

	// traverse
	public void traverseSimpleLinkedList() {
		if (getHead() != null) {
			SingleNode tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				System.out.println("value is " + tempNode.getValue());
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("the list does not exist");
		}
	}

	// search

	public boolean searchSimpleLinkedList(int val) {

		if (getHead() != null) {
			SingleNode tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				if (tempNode.getValue() == val) {
					System.out.println("value is " + tempNode.getValue());
					return true;
				}
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("the list does not exist");
			return false;

		}
		System.out.println("The item is not found");
		return false;

	}

	// add
	public void addintoSimpleLinkedList(int val, int loc) {
		SingleNode node = null;
		if (loc < 0) {
			System.out.println("The location is not valid!");
			return;
		} else {
			System.out.println("in else");
			node = new SingleNode();
			node.setValue(val);
		}
		System.out.println("size is" + getSize());
		SingleNode tempNode = getHead();
		if (null != getHead()) {
			if (loc == 0) {

				node.setNext(head); // doubt here
				// head = node;
				// head.setNext(node);
				setTail(node);
				setHead(node);
			}
			if (loc >= getSize()) {

				for (int i = 0; i < getSize() - 1; i++)
					tempNode = tempNode.getNext();

				node.setNext(head);
				tail.setNext(node);
				tail = node;
				setTail(tail);
				tempNode.setNext(node);
				
				setSize(getSize() + 1);

			} else {
				SingleNode prev = head;
				for (int i = 0; i < loc; i++) {
					prev = prev.getNext();
				}

				node.setNext(prev.getNext());
				prev.setNext(node);
				setSize(getSize() + 1);

			}
		} else {
			// createSimpleLinkedList(val);
			// setSize(1);
			System.out.println("The linked list does not exist!!");

		}
		System.out.println("add method");
		traverseSimpleLinkedList();
	}

	// delete
	public void deleteSimpleLinkedList(int loc) {
		if (getHead() != null) {
			if (loc < 0) {
				System.out.println("The location is not valid!");
			}
			if (loc == 0) {
				if (getSize() > 1) {
					setHead(head.getNext());// getHead().setNext(head.getNext());
					setSize(getSize() - 1);
					System.out.println("size >1");
				}
				if (getSize() == 1) {
					System.out.println("size 0");
					tail = null;
					head = null;
					setHead(null);
					setTail(null);
					setSize(0);
				}
			} else {
				SingleNode tempNode = getHead();
				if (loc >= getSize()) {

					System.out.println("last element to be deleted!");
					for (int i = 0; i < getSize() - 1; i++)
						tempNode = tempNode.getNext();

					tempNode.setNext(head);
					tail = tempNode;
					tail.setNext(tempNode);
					
					setSize(getSize() - 1);

				} else {
					for (int i = 0; i < loc - 1; i++)
						tempNode = tempNode.getNext();

					tempNode.setNext(tempNode.getNext().getNext());
					setSize(getSize() - 1);

				}

			}
		} else {
			System.out.println("the list does not exist");

		}
		System.out.println("in delete");
		traverseSimpleLinkedList();

	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
