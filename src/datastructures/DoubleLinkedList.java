package datastructures;

import node.DoubleNode;

public class DoubleLinkedList {


	private DoubleNode head;
	private DoubleNode tail;
	private int size = 0;

	// create
	public DoubleNode createDoubleLinkedList(int nodeVal) {
		DoubleNode node = new DoubleNode();

		node.setNext(null);
		node.setValue(nodeVal);
		node.setPrev(null);
		setHead(node);
		setTail(node);
		setSize(getSize() + 1);
		traverseDoubleLinkedList();
		return getHead();

	}

	// traverse
	public void traverseDoubleLinkedList() {
		if (getHead() != null) {
			DoubleNode tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				System.out.println("value is " + tempNode.getValue());
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("the list does not exist");
		}
	}

	// search

	public boolean searchDoubleLinkedList(int val) {

		if (getHead() != null) {
			DoubleNode tempNode = head;
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
	public void addintoDoubleLinkedList(int val, int loc) {
		DoubleNode node = null;
		if (loc < 0) {
			System.out.println("The location is not valid!");
			return;
		} else {
			System.out.println("in else");
			node = new DoubleNode();
			node.setValue(val);
		}
		System.out.println("size is" + getSize());
		DoubleNode tempNode = getHead();
		if (null != getHead()) {
			if (loc == 0) {

				node.setNext(head); // doubt here
				// head = node;
				// head.setNext(node);
				setHead(node);
				setTail(node);
				node.setPrev(null);
			}
			if (loc >= getSize()) {

				for (int i = 0; i < getSize() - 1; i++)
					tempNode = tempNode.getNext();

				node.setNext(null);
				tail.setNext(node);
				node.setPrev(tempNode); //doubt, it is mentioned to have tail here
				tail = node;
				setTail(tail);
				tempNode.setNext(node);
				setSize(getSize() + 1);

			} else {
				DoubleNode prev = head;
				for (int i = 0; i < loc; i++) {
					prev = prev.getNext();
				}

				node.setNext(prev.getNext());
				prev.setNext(node);
				node.setPrev(prev);
				node.getNext().setPrev(node);
				setSize(getSize() + 1);

			}
		} else {
			// createDoubleLinkedList(val);
			// setSize(1);
			System.out.println("The linked list does not exist!!");

		}
		System.out.println("add method");
		traverseDoubleLinkedList();
	}

	// delete
	public void deleteDoubleLinkedList(int loc) {
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
				DoubleNode tempNode = getHead();
				if (loc >= getSize()) {

					System.out.println("last element to be deleted!");
					for (int i = 0; i < getSize() - 1; i++)
						tempNode = tempNode.getNext();

					tempNode.setNext(null);
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
		traverseDoubleLinkedList();

	}

	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public DoubleNode getTail() {
		return tail;
	}

	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


}
