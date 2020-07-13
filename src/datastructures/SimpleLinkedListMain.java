package datastructures;
import datastructures.SimpleLinkedList;
public class SimpleLinkedListMain {

	public static void main(String[] args) {
		
		SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
		
		simpleLinkedList.createSimpleLinkedList(2);
		simpleLinkedList.addintoSimpleLinkedList(3, 2);
		simpleLinkedList.addintoSimpleLinkedList(5, 2);
		simpleLinkedList.addintoSimpleLinkedList(4, 2);
		//simpleLinkedList.addintoSimpleLinkedList(7, 0);
		//simpleLinkedList.deleteSimpleLinkedList(2);
		//simpleLinkedList.deleteSimpleLinkedList(0);
		simpleLinkedList.searchSimpleLinkedList(5);
	}

}
