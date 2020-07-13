package datastructures;

public class DoubleLikedListMain {

	

		public static void main(String[] args) {
			
			DoubleLinkedList DoubleLinkedList = new DoubleLinkedList();
			
			DoubleLinkedList.createDoubleLinkedList(2);
			DoubleLinkedList.addintoDoubleLinkedList(3, 2);
			DoubleLinkedList.addintoDoubleLinkedList(5, 2);
			DoubleLinkedList.addintoDoubleLinkedList(4, 2);
			//DoubleLinkedList.addintoDoubleLinkedList(7, 0);
			//DoubleLinkedList.deleteDoubleLinkedList(2);
			//DoubleLinkedList.deleteDoubleLinkedList(0);
			DoubleLinkedList.searchDoubleLinkedList(5);
		

}

}
