package datastructures;

public class StackByLinkeedList {
	SimpleLinkedList list;
	int topOfStack = 1;
	
	
	StackByLinkeedList(){
		list = new SimpleLinkedList();
	}
	public void push(int i) {
		if (list.getHead() == null) {
			list.createSimpleLinkedList(i);
			System.out.println("inserted on head");
		}else {
			list.addintoSimpleLinkedList(i, topOfStack);
			topOfStack++;
			System.out.println("added on head");
		}
	}
	
	
	public int pop() {
		if(!isStackEmpty()) {
			System.out.println("list.getHead().getValue()" + list.getHead().getValue());
			list.deleteSimpleLinkedList(0);
			
			return list.getHead().getValue();
		}else {
			System.out.println("The stack is empty!");
			return -1;
		}
	}
	

	private boolean isStackEmpty() {
		if(list.getHead() == null)
			return true;
		
		return false;
	}
	public int peek() {
		if(!isStackEmpty()) {
			System.out.println("list.getHead().getValue()" + list.getHead().getValue());
			//list.deleteSimpleLinkedList(0);
			
			return list.getHead().getValue();
		}else {
			System.out.println("The peek stack is empty!");
			return -1;
		}}
	
	public void deleteStack() {
		list.setHead(null);
		System.out.println("stack deleted successfully!");
		
	}

}
